package com.np.order.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 加盟店マスタ Model
 *
 * This class was autogenerated on:
 * [Mon Jan 11 18:47:34 JST 2016]
 *
 * [WARNING]
 * Don't edit this class directly, because it may be regenerated late.
 */
@Entity
@Table(name = "NAPA_USER_TBL")
public class NapaUsers {
	public static final String TABLE_NAME = "NAPA_USER_TBL";

	/*
	 * ---------------------- Public Field Names Definition
	 * ----------------------------
	 */
	public static final String NAPAId = "NapaId";
	public static final String USERID = "UserId";
	public static final String USERNAME = "UserName";
	public static final String PASSWORD = "PassWord";

	/*
	 * ---------------------- Private Fields Definition
	 * ----------------------------
	 */
	@Id
	/* 加盟店ID */
	@Column(name = "NAPAId", length = 64, nullable = false)
	private String NapaId;

	/* ユーザID  */
	@Column(name = "USERID", length = 64, nullable = true)
	private String UserId;

	/* ユーザ名 */
	@Column(name = "USERNAME", length = 64, nullable = true)
	private String UserName;

	/* パースワード  */
	@Column(name = "PASSWORD", length = 64, nullable = true)
	private String PassWord;


	


	public String getNapaId() {
		return NapaId;
	}




	public void setNapaId(String napaId) {
		NapaId = napaId;
	}







	public static String getTableName() {
		return TABLE_NAME;
	}




	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t");
		sb.append("UserId");
		sb.append("=");
		sb.append(UserId);
		sb.append("\n");
		sb.append("\t");
		sb.append("NapaId");
		sb.append("=");
		sb.append(NapaId);
		sb.append("\n");
		sb.append("\t");
		sb.append("UserName");
		sb.append("=");
		sb.append(UserName);
		sb.append("\n");
		sb.append("\t");
		sb.append("PassWord");
		sb.append("=");
		sb.append(PassWord);
		sb.append("\n");
		return sb.toString();
	}




	public String getUserId() {
		return UserId;
	}




	public void setUserId(String userId) {
		UserId = userId;
	}




	public String getUserName() {
		return UserName;
	}




	public void setUserName(String userName) {
		UserName = userName;
	}




	public String getPassWord() {
		return PassWord;
	}




	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

}
