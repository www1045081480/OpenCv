package jp.newpulse.action.user;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.np.base.db.TxMgr;
import com.np.base.orm.Criteria;
import com.np.order.models.NapaTerminal;
import com.np.order.models.NapaUsers;

import jp.newpulse.action.BaseJsonAction;

@SuppressWarnings("serial")
public class AddUserAction extends BaseJsonAction {
	private static Log logger = LogFactory.getLog(AddUserAction.class);
	private String UserID;
	private String NapaID;
	private String UserName;
	private String Password;
	private NapaUsers napaUsers;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String execute() throws Exception {
		logger.debug("############adduser#########");
		Criteria<NapaUsers> criteria = new Criteria(NapaUsers.class);
		System.out.println(UserID);
		System.out.println(NapaID);
		System.out.println(UserName);
		System.out.println(Password);
		napaUsers = new NapaUsers();
		napaUsers.setUserId(UserID);
		napaUsers.setNapaId(NapaID);
		napaUsers.setUserName(UserName);
		napaUsers.setPassWord(Password);
		TxMgr.insert(napaUsers);
		Map result = new HashMap();
		result.put("success", "success");
		response(result);
		return "success";
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getNapaID() {
		return NapaID;
	}

	public void setNapaID(String napaID) {
		NapaID = napaID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
