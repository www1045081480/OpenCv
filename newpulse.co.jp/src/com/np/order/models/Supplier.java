package com.np.order.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 仕入先マスタ Model
 *
 * This class was autogenerated on:
 * [Mon Jan 11 18:47:34 JST 2016]
 *
 * [WARNING]
 * Don't edit this class directly, because it may be regenerated late.
 */
@Entity
@Table(name = "SUPPLIER_TBL")
public class Supplier {
	public static final String TABLE_NAME = "SUPPLIER_TBL";

	/*
	 * ---------------------- Public Field Names Definition
	 * ----------------------------
	 */
	public static final String SupplierId = "SupplierId";
	public static final String EnName = "EnName";
	public static final String EnShortName = "EnShortName";
	public static final String JpName = "JpName";
	public static final String CnName = "CnName";
	public static final String Country = "Country";
	public static final String PostCd = "PostCd";
	public static final String Address1 = "Address1";
	public static final String Address2 = "Address2";
	public static final String Address3 = "Address3";
	public static final String EnAddress1 = "EnAddress1";
	public static final String EnAddress2 = "EnAddress2";
	public static final String EnAddress3 = "EnAddress3";
	public static final String Tel1 = "Tel1";
	public static final String Tel2 = "Tel2";
	public static final String Fax = "Fax";
	public static final String RegTime = "RegTime";
	public static final String UpdTime = "UpdTime";

	/*
	 * ---------------------- Private Fields Definition
	 * ----------------------------
	 */
	@Id
	/* 仕入先ID */
	@Column(name = "SUPPLIER_ID", length = 0, nullable = false)
	private Long supplierId;

	/* 仕入先名 */
	@Column(name = "EN_NAME", length = 64, nullable = true)
	private String enName;

	/* 郵便番号 */
	@Column(name = "EN_SHORT_NAME", length = 64, nullable = true)
	private String enShortName;

	/* 住所1 */
	@Column(name = "JP_NAME", length = 64, nullable = true)
	private String jpName;

	/* 住所2 */
	@Column(name = "CN_NAME", length = 64, nullable = true)
	private String cnName;

	/*  */
	@Column(name = "COUNTRY", length = 64, nullable = true)
	private String country;

	/* 郵便番号 */
	@Column(name = "POST_CD", length = 64, nullable = true)
	private String postCd;

	/*  */
	@Column(name = "ADDRESS1", length = 64, nullable = true)
	private String address1;

	/* メール */
	@Column(name = "ADDRESS2", length = 64, nullable = true)
	private String address2;

	/*  */
	@Column(name = "ADDRESS3", length = 64, nullable = true)
	private String address3;

	/*  */
	@Column(name = "EN_ADDRESS1", length = 64, nullable = true)
	private String enAddress1;

	/*  */
	@Column(name = "EN_ADDRESS2", length = 64, nullable = true)
	private String enAddress2;

	/*  */
	@Column(name = "EN_ADDRESS3", length = 64, nullable = true)
	private String enAddress3;

	/*  */
	@Column(name = "TEL1", length = 16, nullable = true)
	private String tel1;

	/*  */
	@Column(name = "TEL2", length = 16, nullable = true)
	private String tel2;

	/*  */
	@Column(name = "FAX", length = 16, nullable = true)
	private String fax;

	/*  */
	@Column(name = "REG_TIME", length = 0, nullable = true)
	private Long regTime;

	/*  */
	@Column(name = "UPD_TIME", length = 0, nullable = true)
	private Long updTime;

	/*
	 * ---------------------- Getter / Setter Methods
	 * ----------------------------
	 */

	/*
	 * Get the 仕入先ID
	 * 
	 * @return the value of 仕入先ID
	 */
	public Long getSupplierId() {
		return supplierId;
	}

	/*
	 * Set the value of 仕入先ID
	 * 
	 * @param supplierId the new value for 仕入先ID
	 */
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	/*
	 * Get the 仕入先名
	 * 
	 * @return the value of 仕入先名
	 */
	public String getEnName() {
		return enName;
	}

	/*
	 * Set the value of 仕入先名
	 * 
	 * @param enName the new value for 仕入先名
	 */
	public void setEnName(String enName) {
		this.enName = enName;
	}

	/*
	 * Get the 郵便番号
	 * 
	 * @return the value of 郵便番号
	 */
	public String getEnShortName() {
		return enShortName;
	}

	/*
	 * Set the value of 郵便番号
	 * 
	 * @param enShortName the new value for 郵便番号
	 */
	public void setEnShortName(String enShortName) {
		this.enShortName = enShortName;
	}

	/*
	 * Get the 住所1
	 * 
	 * @return the value of 住所1
	 */
	public String getJpName() {
		return jpName;
	}

	/*
	 * Set the value of 住所1
	 * 
	 * @param jpName the new value for 住所1
	 */
	public void setJpName(String jpName) {
		this.jpName = jpName;
	}

	/*
	 * Get the 住所2
	 * 
	 * @return the value of 住所2
	 */
	public String getCnName() {
		return cnName;
	}

	/*
	 * Set the value of 住所2
	 * 
	 * @param cnName the new value for 住所2
	 */
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getCountry() {
		return country;
	}

	/*
	 * Set the value of
	 * 
	 * @param country the new value for $col.ViewName
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * Get the 郵便番号
	 * 
	 * @return the value of 郵便番号
	 */
	public String getPostCd() {
		return postCd;
	}

	/*
	 * Set the value of 郵便番号
	 * 
	 * @param postCd the new value for 郵便番号
	 */
	public void setPostCd(String postCd) {
		this.postCd = postCd;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getAddress1() {
		return address1;
	}

	/*
	 * Set the value of
	 * 
	 * @param address1 the new value for $col.ViewName
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/*
	 * Get the メール
	 * 
	 * @return the value of メール
	 */
	public String getAddress2() {
		return address2;
	}

	/*
	 * Set the value of メール
	 * 
	 * @param address2 the new value for メール
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getAddress3() {
		return address3;
	}

	/*
	 * Set the value of
	 * 
	 * @param address3 the new value for $col.ViewName
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getEnAddress1() {
		return enAddress1;
	}

	/*
	 * Set the value of
	 * 
	 * @param enAddress1 the new value for $col.ViewName
	 */
	public void setEnAddress1(String enAddress1) {
		this.enAddress1 = enAddress1;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getEnAddress2() {
		return enAddress2;
	}

	/*
	 * Set the value of
	 * 
	 * @param enAddress2 the new value for $col.ViewName
	 */
	public void setEnAddress2(String enAddress2) {
		this.enAddress2 = enAddress2;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getEnAddress3() {
		return enAddress3;
	}

	/*
	 * Set the value of
	 * 
	 * @param enAddress3 the new value for $col.ViewName
	 */
	public void setEnAddress3(String enAddress3) {
		this.enAddress3 = enAddress3;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getTel1() {
		return tel1;
	}

	/*
	 * Set the value of
	 * 
	 * @param tel1 the new value for $col.ViewName
	 */
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getTel2() {
		return tel2;
	}

	/*
	 * Set the value of
	 * 
	 * @param tel2 the new value for $col.ViewName
	 */
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getFax() {
		return fax;
	}

	/*
	 * Set the value of
	 * 
	 * @param fax the new value for $col.ViewName
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Long getRegTime() {
		return regTime;
	}

	/*
	 * Set the value of
	 * 
	 * @param regTime the new value for $col.ViewName
	 */
	public void setRegTime(Long regTime) {
		this.regTime = regTime;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Long getUpdTime() {
		return updTime;
	}

	/*
	 * Set the value of
	 * 
	 * @param updTime the new value for $col.ViewName
	 */
	public void setUpdTime(Long updTime) {
		this.updTime = updTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t");
		sb.append("SupplierId");
		sb.append("=");
		sb.append(supplierId);
		sb.append("\n");
		sb.append("\t");
		sb.append("EnName");
		sb.append("=");
		sb.append(enName);
		sb.append("\n");
		sb.append("\t");
		sb.append("EnShortName");
		sb.append("=");
		sb.append(enShortName);
		sb.append("\n");
		sb.append("\t");
		sb.append("JpName");
		sb.append("=");
		sb.append(jpName);
		sb.append("\n");
		sb.append("\t");
		sb.append("CnName");
		sb.append("=");
		sb.append(cnName);
		sb.append("\n");
		sb.append("\t");
		sb.append("Country");
		sb.append("=");
		sb.append(country);
		sb.append("\n");
		sb.append("\t");
		sb.append("PostCd");
		sb.append("=");
		sb.append(postCd);
		sb.append("\n");
		sb.append("\t");
		sb.append("Address1");
		sb.append("=");
		sb.append(address1);
		sb.append("\n");
		sb.append("\t");
		sb.append("Address2");
		sb.append("=");
		sb.append(address2);
		sb.append("\n");
		sb.append("\t");
		sb.append("Address3");
		sb.append("=");
		sb.append(address3);
		sb.append("\n");
		sb.append("\t");
		sb.append("EnAddress1");
		sb.append("=");
		sb.append(enAddress1);
		sb.append("\n");
		sb.append("\t");
		sb.append("EnAddress2");
		sb.append("=");
		sb.append(enAddress2);
		sb.append("\n");
		sb.append("\t");
		sb.append("EnAddress3");
		sb.append("=");
		sb.append(enAddress3);
		sb.append("\n");
		sb.append("\t");
		sb.append("Tel1");
		sb.append("=");
		sb.append(tel1);
		sb.append("\n");
		sb.append("\t");
		sb.append("Tel2");
		sb.append("=");
		sb.append(tel2);
		sb.append("\n");
		sb.append("\t");
		sb.append("Fax");
		sb.append("=");
		sb.append(fax);
		sb.append("\n");
		sb.append("\t");
		sb.append("RegTime");
		sb.append("=");
		sb.append(regTime);
		sb.append("\n");
		sb.append("\t");
		sb.append("UpdTime");
		sb.append("=");
		sb.append(updTime);
		sb.append("\n");
		return sb.toString();
	}

}
