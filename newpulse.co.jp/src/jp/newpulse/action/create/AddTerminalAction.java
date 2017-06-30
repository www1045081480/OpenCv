package jp.newpulse.action.create;

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
public class AddTerminalAction extends BaseJsonAction {
	private static Log logger = LogFactory.getLog(AddTerminalAction.class);
	private String TerminalID;
	private String NapaID;
	private String TerminalKind;
	private String TerminalIP;
	private NapaTerminal napaTerminal;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String execute() throws Exception {
		logger.debug("############adduser#########");
		Criteria<NapaUsers> criteria = new Criteria(NapaTerminal.class);
		System.out.println(TerminalID);
		System.out.println(NapaID);
		System.out.println(TerminalKind);
		System.out.println(TerminalIP);
		napaTerminal = new NapaTerminal();
		napaTerminal.setTerminalID(TerminalID);
		napaTerminal.setNapaId(NapaID);
		napaTerminal.setTerminalKind(TerminalKind);
		napaTerminal.setTerminalIP(TerminalIP);
		TxMgr.insert(napaTerminal);
		Map result = new HashMap();
		result.put("success", "success");
		response(result);
		return "success";
	}

	public String getTerminalID() {
		return TerminalID;
	}

	public void setTerminalID(String terminalID) {
		TerminalID = terminalID;
	}

	public String getNapaID() {
		return NapaID;
	}

	public void setNapaID(String napaID) {
		NapaID = napaID;
	}

	public String getTerminalKind() {
		return TerminalKind;
	}

	public void setTerminalKind(String terminalKind) {
		TerminalKind = terminalKind;
	}

	public String getTerminalIP() {
		return TerminalIP;
	}

	public void setTerminalIP(String terminalIP) {
		TerminalIP = terminalIP;
	}

}
