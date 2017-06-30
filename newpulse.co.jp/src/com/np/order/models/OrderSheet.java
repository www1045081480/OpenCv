package com.np.order.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import com.np.order.Money;

/*
 * 注文 Model
 *
 * This class was autogenerated on:
 * [Mon Jan 11 18:47:34 JST 2016]
 *
 * [WARNING]
 * Don't edit this class directly, because it may be regenerated late.
 */
@Entity
@Table(name = "ORDER_SHEET_TBL")
public class OrderSheet {
	public static final String TABLE_NAME = "ORDER_SHEET_TBL";

	/*
	 * ---------------------- Public Field Names Definition
	 * ----------------------------
	 */
	public static final String OrderId = "OrderId";
	public static final String OrderCd = "OrderCd";
	public static final String SupplierId = "SupplierId";
	public static final String SupplierName = "SupplierName";
	public static final String Address1 = "Address1";
	public static final String Address2 = "Address2";
	public static final String Address3 = "Address3";
	public static final String Tel = "Tel";
	public static final String Fax = "Fax";
	public static final String Title = "Title";
	public static final String Amount = "Amount";
	public static final String DiscountAmount = "DiscountAmount";
	public static final String IssueDate = "IssueDate";
	public static final String StaffName = "StaffName";
	public static final String PostCode = "PostCode";
	public static final String Note = "Note";
	public static final String SupplierDept = "SupplierDept";
	public static final String SupplierStaff = "SupplierStaff";
	public static final String LangFlg = "LangFlg";
	public static final String DeliveryAddress = "DeliveryAddress";
	public static final String DeliveryDate = "DeliveryDate";
	public static final String PaymentCondition = "PaymentCondition";
	public static final String PaymentMethord = "PaymentMethord";
	public static final String DeliveryMethod = "DeliveryMethod";
	public static final String Currency = "Currency";
	public static final String Country = "Country";
	public static final String ValidDate = "ValidDate";
	public static final String PackageMethod = "PackageMethod";
	public static final String UserId = "UserId";
	public static final String RegTime = "RegTime";
	public static final String UpdTime = "UpdTime";

	/*
	 * ---------------------- Private Fields Definition
	 * ----------------------------
	 */
	@Id
	/* 注文ID */
	@Column(name = "ORDER_ID", length = 0, nullable = false)
	private Long orderId;

	/* 踩番规约 */
	@Column(name = "ORDER_CD", length = 64, nullable = false)
	private String orderCd;

	/*  */
	@Column(name = "SUPPLIER_ID", length = 0, nullable = false)
	@JoinTable(name = "Supplier")
	@JoinColumn(name = "SupplierId")
	private Long supplierId;

	/*  */
	@Column(name = "SUPPLIER_NAME", length = 32, nullable = true)
	private String supplierName;

	/*  */
	@Column(name = "ADDRESS1", length = 64, nullable = true)
	private String address1;

	/*  */
	@Column(name = "ADDRESS2", length = 65, nullable = true)
	private String address2;

	/*  */
	@Column(name = "ADDRESS3", length = 64, nullable = true)
	private String address3;

	/*  */
	@Column(name = "TEL", length = 16, nullable = true)
	private String tel;

	/*  */
	@Column(name = "FAX", length = 16, nullable = true)
	private String fax;

	/*  */
	@Column(name = "TITLE", length = 64, nullable = true)
	private String title;

	/*  */
	@Column(name = "AMOUNT", length = 0, nullable = true)
	private Money amount;

	/*  */
	@Column(name = "DISCOUNT_AMOUNT", length = 0, nullable = true)
	private Money discountAmount;

	/*  */
	@Column(name = "ISSUE_DATE", length = 8, nullable = true)
	private String issueDate;

	/*  */
	@Column(name = "STAFF_NAME", length = 64, nullable = true)
	private String staffName;

	/*  */
	@Column(name = "POST_CODE", length = 64, nullable = true)
	private String postCode;

	/*  */
	@Column(name = "NOTE", length = 64, nullable = true)
	private String note;

	/*  */
	@Column(name = "SUPPLIER_DEPT", length = 64, nullable = true)
	private String supplierDept;

	/*  */
	@Column(name = "SUPPLIER_STAFF", length = 64, nullable = true)
	private String supplierStaff;

	/*  */
	@Column(name = "LANG_FLG", length = 64, nullable = true)
	private String langFlg;

	/*  */
	@Column(name = "DELIVERY_ADDRESS", length = 64, nullable = true)
	private String deliveryAddress;

	/*  */
	@Column(name = "DELIVERY_DATE", length = 8, nullable = true)
	private String deliveryDate;

	/*  */
	@Column(name = "PAYMENT_CONDITION", length = 64, nullable = true)
	private String paymentCondition;

	/*  */
	@Column(name = "PAYMENT_METHORD", length = 64, nullable = true)
	private String paymentMethord;

	/*  */
	@Column(name = "DELIVERY_METHOD", length = 64, nullable = true)
	private String deliveryMethod;

	/*  */
	@Column(name = "CURRENCY", length = 64, nullable = true)
	private String currency;

	/*  */
	@Column(name = "COUNTRY", length = 64, nullable = true)
	private String country;

	/* 注文有效期 */
	@Column(name = "Valid_Date", length = 64, nullable = true)
	private String validDate;

	/* 包装要求 */
	@Column(name = "Package_Method", length = 64, nullable = true)
	private String packageMethod;

	/* ユーザーID */
	@Column(name = "USER_ID", length = 0, nullable = true)
	private Long userId;

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
	 * Get the 注文ID
	 * 
	 * @return the value of 注文ID
	 */
	public Long getOrderId() {
		return orderId;
	}

	/*
	 * Set the value of 注文ID
	 * 
	 * @param orderId the new value for 注文ID
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/*
	 * Get the 踩番规约
	 * 
	 * @return the value of 踩番规约
	 */
	public String getOrderCd() {
		return orderCd;
	}

	/*
	 * Set the value of 踩番规约
	 * 
	 * @param orderCd the new value for 踩番规约
	 */
	public void setOrderCd(String orderCd) {
		this.orderCd = orderCd;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Long getSupplierId() {
		return supplierId;
	}

	/*
	 * Set the value of
	 * 
	 * @param supplierId the new value for $col.ViewName
	 */
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/*
	 * Set the value of
	 * 
	 * @param supplierName the new value for $col.ViewName
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getAddress2() {
		return address2;
	}

	/*
	 * Set the value of
	 * 
	 * @param address2 the new value for $col.ViewName
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
	public String getTel() {
		return tel;
	}

	/*
	 * Set the value of
	 * 
	 * @param tel the new value for $col.ViewName
	 */
	public void setTel(String tel) {
		this.tel = tel;
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
	public String getTitle() {
		return title;
	}

	/*
	 * Set the value of
	 * 
	 * @param title the new value for $col.ViewName
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Money getAmount() {
		return amount;
	}

	/*
	 * Set the value of
	 * 
	 * @param amount the new value for $col.ViewName
	 */
	public void setAmount(Money amount) {
		this.amount = amount;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Money getDiscountAmount() {
		return discountAmount;
	}

	/*
	 * Set the value of
	 * 
	 * @param discountAmount the new value for $col.ViewName
	 */
	public void setDiscountAmount(Money discountAmount) {
		this.discountAmount = discountAmount;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getIssueDate() {
		return issueDate;
	}

	/*
	 * Set the value of
	 * 
	 * @param issueDate the new value for $col.ViewName
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getStaffName() {
		return staffName;
	}

	/*
	 * Set the value of
	 * 
	 * @param staffName the new value for $col.ViewName
	 */
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getPostCode() {
		return postCode;
	}

	/*
	 * Set the value of
	 * 
	 * @param postCode the new value for $col.ViewName
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getNote() {
		return note;
	}

	/*
	 * Set the value of
	 * 
	 * @param note the new value for $col.ViewName
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getSupplierDept() {
		return supplierDept;
	}

	/*
	 * Set the value of
	 * 
	 * @param supplierDept the new value for $col.ViewName
	 */
	public void setSupplierDept(String supplierDept) {
		this.supplierDept = supplierDept;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getSupplierStaff() {
		return supplierStaff;
	}

	/*
	 * Set the value of
	 * 
	 * @param supplierStaff the new value for $col.ViewName
	 */
	public void setSupplierStaff(String supplierStaff) {
		this.supplierStaff = supplierStaff;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getLangFlg() {
		return langFlg;
	}

	/*
	 * Set the value of
	 * 
	 * @param langFlg the new value for $col.ViewName
	 */
	public void setLangFlg(String langFlg) {
		this.langFlg = langFlg;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/*
	 * Set the value of
	 * 
	 * @param deliveryAddress the new value for $col.ViewName
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getDeliveryDate() {
		return deliveryDate;
	}

	/*
	 * Set the value of
	 * 
	 * @param deliveryDate the new value for $col.ViewName
	 */
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getPaymentCondition() {
		return paymentCondition;
	}

	/*
	 * Set the value of
	 * 
	 * @param paymentCondition the new value for $col.ViewName
	 */
	public void setPaymentCondition(String paymentCondition) {
		this.paymentCondition = paymentCondition;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getPaymentMethord() {
		return paymentMethord;
	}

	/*
	 * Set the value of
	 * 
	 * @param paymentMethord the new value for $col.ViewName
	 */
	public void setPaymentMethord(String paymentMethord) {
		this.paymentMethord = paymentMethord;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	/*
	 * Set the value of
	 * 
	 * @param deliveryMethod the new value for $col.ViewName
	 */
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getCurrency() {
		return currency;
	}

	/*
	 * Set the value of
	 * 
	 * @param currency the new value for $col.ViewName
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
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
	 * Get the 注文有效期
	 * 
	 * @return the value of 注文有效期
	 */
	public String getValidDate() {
		return validDate;
	}

	/*
	 * Set the value of 注文有效期
	 * 
	 * @param validDate the new value for 注文有效期
	 */
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

	/*
	 * Get the 包装要求
	 * 
	 * @return the value of 包装要求
	 */
	public String getPackageMethod() {
		return packageMethod;
	}

	/*
	 * Set the value of 包装要求
	 * 
	 * @param packageMethod the new value for 包装要求
	 */
	public void setPackageMethod(String packageMethod) {
		this.packageMethod = packageMethod;
	}

	/*
	 * Get the ユーザーID
	 * 
	 * @return the value of ユーザーID
	 */
	public Long getUserId() {
		return userId;
	}

	/*
	 * Set the value of ユーザーID
	 * 
	 * @param userId the new value for ユーザーID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
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
		sb.append("OrderId");
		sb.append("=");
		sb.append(orderId);
		sb.append("\n");
		sb.append("\t");
		sb.append("OrderCd");
		sb.append("=");
		sb.append(orderCd);
		sb.append("\n");
		sb.append("\t");
		sb.append("SupplierId");
		sb.append("=");
		sb.append(supplierId);
		sb.append("\n");
		sb.append("\t");
		sb.append("SupplierName");
		sb.append("=");
		sb.append(supplierName);
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
		sb.append("Tel");
		sb.append("=");
		sb.append(tel);
		sb.append("\n");
		sb.append("\t");
		sb.append("Fax");
		sb.append("=");
		sb.append(fax);
		sb.append("\n");
		sb.append("\t");
		sb.append("Title");
		sb.append("=");
		sb.append(title);
		sb.append("\n");
		sb.append("\t");
		sb.append("Amount");
		sb.append("=");
		sb.append(amount);
		sb.append("\n");
		sb.append("\t");
		sb.append("DiscountAmount");
		sb.append("=");
		sb.append(discountAmount);
		sb.append("\n");
		sb.append("\t");
		sb.append("IssueDate");
		sb.append("=");
		sb.append(issueDate);
		sb.append("\n");
		sb.append("\t");
		sb.append("StaffName");
		sb.append("=");
		sb.append(staffName);
		sb.append("\n");
		sb.append("\t");
		sb.append("PostCode");
		sb.append("=");
		sb.append(postCode);
		sb.append("\n");
		sb.append("\t");
		sb.append("Note");
		sb.append("=");
		sb.append(note);
		sb.append("\n");
		sb.append("\t");
		sb.append("SupplierDept");
		sb.append("=");
		sb.append(supplierDept);
		sb.append("\n");
		sb.append("\t");
		sb.append("SupplierStaff");
		sb.append("=");
		sb.append(supplierStaff);
		sb.append("\n");
		sb.append("\t");
		sb.append("LangFlg");
		sb.append("=");
		sb.append(langFlg);
		sb.append("\n");
		sb.append("\t");
		sb.append("DeliveryAddress");
		sb.append("=");
		sb.append(deliveryAddress);
		sb.append("\n");
		sb.append("\t");
		sb.append("DeliveryDate");
		sb.append("=");
		sb.append(deliveryDate);
		sb.append("\n");
		sb.append("\t");
		sb.append("PaymentCondition");
		sb.append("=");
		sb.append(paymentCondition);
		sb.append("\n");
		sb.append("\t");
		sb.append("PaymentMethord");
		sb.append("=");
		sb.append(paymentMethord);
		sb.append("\n");
		sb.append("\t");
		sb.append("DeliveryMethod");
		sb.append("=");
		sb.append(deliveryMethod);
		sb.append("\n");
		sb.append("\t");
		sb.append("Currency");
		sb.append("=");
		sb.append(currency);
		sb.append("\n");
		sb.append("\t");
		sb.append("Country");
		sb.append("=");
		sb.append(country);
		sb.append("\n");
		sb.append("\t");
		sb.append("ValidDate");
		sb.append("=");
		sb.append(validDate);
		sb.append("\n");
		sb.append("\t");
		sb.append("PackageMethod");
		sb.append("=");
		sb.append(packageMethod);
		sb.append("\n");
		sb.append("\t");
		sb.append("UserId");
		sb.append("=");
		sb.append(userId);
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
