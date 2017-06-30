package com.np.order.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import com.np.order.Money;

/*
 * $table.ViewName Model
 *
 * This class was autogenerated on:
 * [Mon Jan 11 18:47:34 JST 2016]
 *
 * [WARNING]
 * Don't edit this class directly, because it may be regenerated late.
 */
@Entity
@Table(name = "PACKING_LIST_TBL")
public class PackingList {
	public static final String TABLE_NAME = "PACKING_LIST_TBL";

	/*
	 * ---------------------- Public Field Names Definition
	 * ----------------------------
	 */
	public static final String PackingListId = "PackingListId";
	public static final String InvoiceId = "InvoiceId";
	public static final String CustomerId = "CustomerId";
	public static final String CustomerName = "CustomerName";
	public static final String Address1 = "Address1";
	public static final String Address2 = "Address2";
	public static final String Address3 = "Address3";
	public static final String Tel = "Tel";
	public static final String Fax = "Fax";
	public static final String Title = "Title";
	public static final String Amount = "Amount";
	public static final String DeliveryType = "DeliveryType";
	public static final String ShippingType = "ShippingType";
	public static final String PackingNumber = "PackingNumber";
	public static final String Currency = "Currency";
	public static final String OrderNo = "OrderNo";
	public static final String ReceiptNo = "ReceiptNo";
	public static final String Receiver = "Receiver";
	public static final String ShippingDate = "ShippingDate";
	public static final String ShippingCompany = "ShippingCompany";
	public static final String ShippingFrom = "ShippingFrom";
	public static final String ShippingTo = "ShippingTo";
	public static final String IssueDate = "IssueDate";
	public static final String Notify = "Notify";
	public static final String Marks = "Marks";
	public static final String Quantity = "Quantity";
	public static final String Unit = "Unit";
	public static final String Nw = "Nw";
	public static final String Gw = "Gw";
	public static final String M3 = "M3";
	public static final String PalletQuantity = "PalletQuantity";
	public static final String RegTime = "RegTime";
	public static final String UpdTime = "UpdTime";

	/*
	 * ---------------------- Private Fields Definition
	 * ----------------------------
	 */
	@Id
	/*  */
	@Column(name = "PACKING_LIST_ID", length = 0, nullable = false)
	private Long packingListId;

	/*  */
	@Column(name = "INVOICE_ID", length = 0, nullable = false)
	@JoinTable(name = "InvoiceSheet")
	@JoinColumn(name = "InvoiceId")
	private Long invoiceId;

	/*  */
	@Column(name = "CUSTOMER_ID", length = 0, nullable = false)
	@JoinTable(name = "Customer")
	@JoinColumn(name = "CustomerId")
	private Long customerId;

	/*  */
	@Column(name = "CUSTOMER_NAME", length = 64, nullable = true)
	private String customerName;

	/*  */
	@Column(name = "ADDRESS1", length = 64, nullable = true)
	private String address1;

	/*  */
	@Column(name = "ADDRESS2", length = 64, nullable = true)
	private String address2;

	/*  */
	@Column(name = "ADDRESS3", length = 64, nullable = true)
	private String address3;

	/*  */
	@Column(name = "TEL", length = 64, nullable = true)
	private String tel;

	/*  */
	@Column(name = "FAX", length = 64, nullable = true)
	private String fax;

	/*  */
	@Column(name = "TITLE", length = 64, nullable = true)
	private String title;

	/*  */
	@Column(name = "AMOUNT", length = 0, nullable = true)
	private Money amount;

	/*  */
	@Column(name = "DELIVERY_TYPE", length = 64, nullable = true)
	private String deliveryType;

	/*  */
	@Column(name = "SHIPPING_TYPE", length = 64, nullable = true)
	private String shippingType;

	/*  */
	@Column(name = "PACKING_NUMBER", length = 0, nullable = true)
	private Integer packingNumber;

	/*  */
	@Column(name = "CURRENCY", length = 64, nullable = true)
	private String currency;

	/*  */
	@Column(name = "ORDER_NO", length = 32, nullable = true)
	private String orderNo;

	/*  */
	@Column(name = "RECEIPT_NO", length = 32, nullable = true)
	private String receiptNo;

	/*  */
	@Column(name = "RECEIVER", length = 32, nullable = true)
	private String receiver;

	/*  */
	@Column(name = "SHIPPING_DATE", length = 8, nullable = true)
	private String shippingDate;

	/*  */
	@Column(name = "SHIPPING_COMPANY", length = 64, nullable = true)
	private String shippingCompany;

	/*  */
	@Column(name = "SHIPPING_FROM", length = 64, nullable = true)
	private String shippingFrom;

	/*  */
	@Column(name = "SHIPPING_TO", length = 64, nullable = true)
	private String shippingTo;

	/*  */
	@Column(name = "ISSUE_DATE", length = 8, nullable = true)
	private String issueDate;

	/*  */
	@Column(name = "NOTIFY", length = 64, nullable = true)
	private String notify;

	/*  */
	@Column(name = "MARKS", length = 64, nullable = true)
	private String marks;

	/*  */
	@Column(name = "QUANTITY", length = 0, nullable = true)
	private Integer quantity;

	/*  */
	@Column(name = "UNIT", length = 64, nullable = true)
	private String unit;

	/*  */
	@Column(name = "NW", length = 64, nullable = true)
	private String nw;

	/*  */
	@Column(name = "GW", length = 64, nullable = true)
	private String gw;

	/*  */
	@Column(name = "M3", length = 64, nullable = true)
	private String m3;

	/*  */
	@Column(name = "PALLET_QUANTITY", length = 64, nullable = true)
	private String palletQuantity;

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
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Long getPackingListId() {
		return packingListId;
	}

	/*
	 * Set the value of
	 * 
	 * @param packingListId the new value for $col.ViewName
	 */
	public void setPackingListId(Long packingListId) {
		this.packingListId = packingListId;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Long getInvoiceId() {
		return invoiceId;
	}

	/*
	 * Set the value of
	 * 
	 * @param invoiceId the new value for $col.ViewName
	 */
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Long getCustomerId() {
		return customerId;
	}

	/*
	 * Set the value of
	 * 
	 * @param customerId the new value for $col.ViewName
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/*
	 * Set the value of
	 * 
	 * @param customerName the new value for $col.ViewName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	public String getDeliveryType() {
		return deliveryType;
	}

	/*
	 * Set the value of
	 * 
	 * @param deliveryType the new value for $col.ViewName
	 */
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getShippingType() {
		return shippingType;
	}

	/*
	 * Set the value of
	 * 
	 * @param shippingType the new value for $col.ViewName
	 */
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Integer getPackingNumber() {
		return packingNumber;
	}

	/*
	 * Set the value of
	 * 
	 * @param packingNumber the new value for $col.ViewName
	 */
	public void setPackingNumber(Integer packingNumber) {
		this.packingNumber = packingNumber;
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
	public String getOrderNo() {
		return orderNo;
	}

	/*
	 * Set the value of
	 * 
	 * @param orderNo the new value for $col.ViewName
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getReceiptNo() {
		return receiptNo;
	}

	/*
	 * Set the value of
	 * 
	 * @param receiptNo the new value for $col.ViewName
	 */
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getReceiver() {
		return receiver;
	}

	/*
	 * Set the value of
	 * 
	 * @param receiver the new value for $col.ViewName
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getShippingDate() {
		return shippingDate;
	}

	/*
	 * Set the value of
	 * 
	 * @param shippingDate the new value for $col.ViewName
	 */
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getShippingCompany() {
		return shippingCompany;
	}

	/*
	 * Set the value of
	 * 
	 * @param shippingCompany the new value for $col.ViewName
	 */
	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getShippingFrom() {
		return shippingFrom;
	}

	/*
	 * Set the value of
	 * 
	 * @param shippingFrom the new value for $col.ViewName
	 */
	public void setShippingFrom(String shippingFrom) {
		this.shippingFrom = shippingFrom;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getShippingTo() {
		return shippingTo;
	}

	/*
	 * Set the value of
	 * 
	 * @param shippingTo the new value for $col.ViewName
	 */
	public void setShippingTo(String shippingTo) {
		this.shippingTo = shippingTo;
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
	public String getNotify() {
		return notify;
	}

	/*
	 * Set the value of
	 * 
	 * @param notify the new value for $col.ViewName
	 */
	public void setNotify(String notify) {
		this.notify = notify;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getMarks() {
		return marks;
	}

	/*
	 * Set the value of
	 * 
	 * @param marks the new value for $col.ViewName
	 */
	public void setMarks(String marks) {
		this.marks = marks;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/*
	 * Set the value of
	 * 
	 * @param quantity the new value for $col.ViewName
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getUnit() {
		return unit;
	}

	/*
	 * Set the value of
	 * 
	 * @param unit the new value for $col.ViewName
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getNw() {
		return nw;
	}

	/*
	 * Set the value of
	 * 
	 * @param nw the new value for $col.ViewName
	 */
	public void setNw(String nw) {
		this.nw = nw;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getGw() {
		return gw;
	}

	/*
	 * Set the value of
	 * 
	 * @param gw the new value for $col.ViewName
	 */
	public void setGw(String gw) {
		this.gw = gw;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getM3() {
		return m3;
	}

	/*
	 * Set the value of
	 * 
	 * @param m3 the new value for $col.ViewName
	 */
	public void setM3(String m3) {
		this.m3 = m3;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getPalletQuantity() {
		return palletQuantity;
	}

	/*
	 * Set the value of
	 * 
	 * @param palletQuantity the new value for $col.ViewName
	 */
	public void setPalletQuantity(String palletQuantity) {
		this.palletQuantity = palletQuantity;
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
		sb.append("PackingListId");
		sb.append("=");
		sb.append(packingListId);
		sb.append("\n");
		sb.append("\t");
		sb.append("InvoiceId");
		sb.append("=");
		sb.append(invoiceId);
		sb.append("\n");
		sb.append("\t");
		sb.append("CustomerId");
		sb.append("=");
		sb.append(customerId);
		sb.append("\n");
		sb.append("\t");
		sb.append("CustomerName");
		sb.append("=");
		sb.append(customerName);
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
		sb.append("DeliveryType");
		sb.append("=");
		sb.append(deliveryType);
		sb.append("\n");
		sb.append("\t");
		sb.append("ShippingType");
		sb.append("=");
		sb.append(shippingType);
		sb.append("\n");
		sb.append("\t");
		sb.append("PackingNumber");
		sb.append("=");
		sb.append(packingNumber);
		sb.append("\n");
		sb.append("\t");
		sb.append("Currency");
		sb.append("=");
		sb.append(currency);
		sb.append("\n");
		sb.append("\t");
		sb.append("OrderNo");
		sb.append("=");
		sb.append(orderNo);
		sb.append("\n");
		sb.append("\t");
		sb.append("ReceiptNo");
		sb.append("=");
		sb.append(receiptNo);
		sb.append("\n");
		sb.append("\t");
		sb.append("Receiver");
		sb.append("=");
		sb.append(receiver);
		sb.append("\n");
		sb.append("\t");
		sb.append("ShippingDate");
		sb.append("=");
		sb.append(shippingDate);
		sb.append("\n");
		sb.append("\t");
		sb.append("ShippingCompany");
		sb.append("=");
		sb.append(shippingCompany);
		sb.append("\n");
		sb.append("\t");
		sb.append("ShippingFrom");
		sb.append("=");
		sb.append(shippingFrom);
		sb.append("\n");
		sb.append("\t");
		sb.append("ShippingTo");
		sb.append("=");
		sb.append(shippingTo);
		sb.append("\n");
		sb.append("\t");
		sb.append("IssueDate");
		sb.append("=");
		sb.append(issueDate);
		sb.append("\n");
		sb.append("\t");
		sb.append("Notify");
		sb.append("=");
		sb.append(notify);
		sb.append("\n");
		sb.append("\t");
		sb.append("Marks");
		sb.append("=");
		sb.append(marks);
		sb.append("\n");
		sb.append("\t");
		sb.append("Quantity");
		sb.append("=");
		sb.append(quantity);
		sb.append("\n");
		sb.append("\t");
		sb.append("Unit");
		sb.append("=");
		sb.append(unit);
		sb.append("\n");
		sb.append("\t");
		sb.append("Nw");
		sb.append("=");
		sb.append(nw);
		sb.append("\n");
		sb.append("\t");
		sb.append("Gw");
		sb.append("=");
		sb.append(gw);
		sb.append("\n");
		sb.append("\t");
		sb.append("M3");
		sb.append("=");
		sb.append(m3);
		sb.append("\n");
		sb.append("\t");
		sb.append("PalletQuantity");
		sb.append("=");
		sb.append(palletQuantity);
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