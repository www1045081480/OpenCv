package com.np.order.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

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
@Table(name = "DEBT_TBL")
public class Debt {
	public static final String TABLE_NAME = "DEBT_TBL";

	/*
	 * ---------------------- Public Field Names Definition
	 * ----------------------------
	 */
	public static final String DebtId = "DebtId";
	public static final String DetailId = "DetailId";
	public static final String PaymentDate = "PaymentDate";
	public static final String DebtAmount = "DebtAmount";
	public static final String RegTime = "RegTime";
	public static final String UpdTime = "UpdTime";

	/*
	 * ---------------------- Private Fields Definition
	 * ----------------------------
	 */
	@Id
	/*  */
	@Column(name = "DEBT_ID", length = 0, nullable = false)
	private Long debtId;

	/*  */
	@Column(name = "DETAIL_ID", length = 0, nullable = false)
	@JoinTable(name = "OrderDetail")
	@JoinColumn(name = "DetailId")
	private Long detailId;

	/*  */
	@Column(name = "PAYMENT_DATE", length = 64, nullable = true)
	private String paymentDate;

	/*  */
	@Column(name = "DEBT_AMOUNT", length = 64, nullable = true)
	private String debtAmount;

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
	public Long getDebtId() {
		return debtId;
	}

	/*
	 * Set the value of
	 * 
	 * @param debtId the new value for $col.ViewName
	 */
	public void setDebtId(Long debtId) {
		this.debtId = debtId;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Long getDetailId() {
		return detailId;
	}

	/*
	 * Set the value of
	 * 
	 * @param detailId the new value for $col.ViewName
	 */
	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getPaymentDate() {
		return paymentDate;
	}

	/*
	 * Set the value of
	 * 
	 * @param paymentDate the new value for $col.ViewName
	 */
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public String getDebtAmount() {
		return debtAmount;
	}

	/*
	 * Set the value of
	 * 
	 * @param debtAmount the new value for $col.ViewName
	 */
	public void setDebtAmount(String debtAmount) {
		this.debtAmount = debtAmount;
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
		sb.append("DebtId");
		sb.append("=");
		sb.append(debtId);
		sb.append("\n");
		sb.append("\t");
		sb.append("DetailId");
		sb.append("=");
		sb.append(detailId);
		sb.append("\n");
		sb.append("\t");
		sb.append("PaymentDate");
		sb.append("=");
		sb.append(paymentDate);
		sb.append("\n");
		sb.append("\t");
		sb.append("DebtAmount");
		sb.append("=");
		sb.append(debtAmount);
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
