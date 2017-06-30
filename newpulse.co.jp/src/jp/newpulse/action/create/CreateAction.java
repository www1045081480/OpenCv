package jp.newpulse.action.create;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.np.base.orm.Criteria;
import com.np.order.models.NapaStores;

import jp.newpulse.action.BaseJsonAction;

@SuppressWarnings("serial")
public class CreateAction extends BaseJsonAction  {
	private static Log logger = LogFactory.getLog(CreateAction.class);
	private String NapaId;
	private String Security;
	private NapaStores napastores;
	private Map<String, Object> session;
	private List<NapaStores> list = new ArrayList<NapaStores>();
	private List<Integer> listsort = new ArrayList<Integer>();
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String execute() throws Exception {
		
		logger.debug("############login#########");
		Criteria<NapaStores> criteria = new Criteria(NapaStores.class);
		list = criteria.list();
		for (NapaStores napaStores : list) {
			listsort.add(Integer.parseInt(napaStores.getNapaId()));
		}
		Collections.sort(listsort);
		for (NapaStores napaStores1 : list) {
			if(napaStores1.getNapaId().equals(listsort.get(listsort.size()-1).toString())){
				NapaId = ""+(Integer.parseInt(napaStores1.getNapaId()) + 1);
				Security = getRandomString(15);
			}
		}
		Map result = new HashMap();
		result.put("NapaId", NapaId);
		result.put("Security", Security);
		response(result);
		//登陆画面需要重新做
		return "success";
	}
	
	public String getRandomString(int length) { //length表示生成字符串的长度
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";   
	    Random random = new Random();   
	    StringBuffer sb = new StringBuffer();   
	    for (int i = 0; i < length; i++) {   
	        int number = random.nextInt(base.length());   
	        sb.append(base.charAt(number));   
	    }   
	    return sb.toString();   
	 }  

	public static Log getLogger() {
		return logger;
	}

	public static void setLogger(Log logger) {
		CreateAction.logger = logger;
	}

}
