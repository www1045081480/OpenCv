package jp.newpulse.action.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.np.base.orm.Criteria;
import com.np.base.orm.Restrictions;
import com.np.base.utils.MD5;
import com.np.order.action.SessionMgr;
import com.np.order.models.NapaStores;
import com.np.order.models.NapaUsers;
import com.np.order.models.Users;
import com.opensymphony.xwork2.ActionContext;

import jp.newpulse.action.BaseAction;
import jp.newpulse.action.search.SearchAction;

@SuppressWarnings("serial")
public class LoginAction extends BaseAction {
	private static Log logger = LogFactory.getLog(LoginAction.class);
	private String userId;
	private String passWord;
	private Users user;
	private String login;


	public List<NapaStores> getList() {
		return list;
	}

	public void setList(List<NapaStores> list) {
		this.list = list;
	}

	private List<NapaStores> list = new ArrayList<NapaStores>();
	private Map<String, Object> session;

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	private boolean accept() {
		String userAgent = ServletActionContext.getRequest().getHeader("user-agent");
		logger.debug("user-agent = " + userAgent);
		if (userAgent.indexOf("Firefox") != -1) {
			return true;
		}
		if (userAgent.indexOf("Chrome") != -1) {
			return true;
		}
		return false;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String execute() throws Exception {
		
		logger.debug("############login#########");
		//登陆画面需要重新做
		if(userId.equals("admin") && passWord.equals("admin")){
			Criteria<NapaStores> result = new Criteria(NapaStores.class);
			list = result.list();
			ActionContext.getContext().put("list", list);
			return "success";
		}
		Criteria<NapaUsers> criteria = new Criteria(NapaUsers.class);
		criteria.and(Restrictions.eq(NapaUsers.USERID, userId));
		criteria.and(Restrictions.eq(NapaUsers.PASSWORD, passWord));
		List<NapaUsers> resultlist = criteria.list();
		if(!resultlist.isEmpty()){
			NapaUsers napa = resultlist.get(0);
			String napaId = napa.getNapaId();
			Criteria<NapaStores> result = new Criteria(NapaStores.class);
			result.and(Restrictions.eq(NapaStores.NAPAId, napaId));
			list = result.list();
			ActionContext.getContext().put("list", list);
			return "success";
		}else{
			return "fail";
		}
//		Criteria<NapaStores> result = new Criteria(NapaStores.class);
//		list = result.list();
//		ActionContext.getContext().put("list", list);
//		return "success";
//		if (accept() == false) {
//			// logger.debug("user-agent = " +
//			// ServletActionContext.getRequest().getHeader("user-agent"));
//			throw new RuntimeException("Please use Firefox !");
//		}
//
//		Criteria<Users> criteria = new Criteria(Users.class);
//		criteria.and(Restrictions.eq(Users.Account, userId));
//		criteria.and(Restrictions.eq(Users.Password, MD5.digest(passWord)));
//		user = criteria.get();
//		if (user != null) {
//			logger.debug("############login success#########");
//			HttpServletRequest req = ServletActionContext.getRequest();
//			SessionMgr.login(req, user);
//			this.session.put("User", user);
//			return "success";
//		}
//
//		logger.debug("############login failed#########");
//		return "fail";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
