package org.id.bankspringbatch.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class BankTransaction {
	@Id
	private long id;
	private long accountID;
	private String transactionDate;
	@Transient
	private String strTransactionDate;
	private String transactionType;
	private String amount;
	
	
	
	
	public BankTransaction() {
		super();
	}
	
	public BankTransaction(long id, long accountID, String transactionDate, String strTransactionDate,
			String transactionType, String amount) {
		super();
		this.id = id;
		this.accountID = accountID;
		this.transactionDate = transactionDate;
		this.strTransactionDate = strTransactionDate;
		this.transactionType = transactionType;
		this.amount = amount;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAccountID() {
		return accountID;
	}
	public void setAccountID(long accountID) {
		this.accountID = accountID;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getStrTransactionDate() {
		return strTransactionDate;
	}
	public void setStrTransactionDate(String strTransactionDate) {
		this.strTransactionDate = strTransactionDate;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	
	

}
