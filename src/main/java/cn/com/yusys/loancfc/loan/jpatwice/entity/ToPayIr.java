package cn.com.yusys.loancfc.loan.jpatwice.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The persistent class for the to_pay_ir database table.
 * 
 */
@Entity
@Table(name="to_pay_ir")
@NamedQuery(name="ToPayIr.findAll", query="SELECT t FROM ToPayIr t")
public class ToPayIr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TX_LOG_SEQ")
	private long txLogSeq;

	@Column(name="ACCT_BANK_CDE")
	private String acctBankCde;


	@Column(name="ACCT_BCH_CDE")
	private String acctBchCde;

	@Column(name="ACCT_BCH_NAM")
	private String acctBchNam;

	@Column(name="ACCT_CCY_CDE")
	private String acctCcyCde;

	public long getTxLogSeq() {
		return txLogSeq;
	}

	public void setTxLogSeq(long txLogSeq) {
		this.txLogSeq = txLogSeq;
	}

	public String getAcctBankCde() {
		return acctBankCde;
	}

	public void setAcctBankCde(String acctBankCde) {
		this.acctBankCde = acctBankCde;
	}

	public String getAcctBchCde() {
		return acctBchCde;
	}

	public void setAcctBchCde(String acctBchCde) {
		this.acctBchCde = acctBchCde;
	}

	public String getAcctBchNam() {
		return acctBchNam;
	}

	public void setAcctBchNam(String acctBchNam) {
		this.acctBchNam = acctBchNam;
	}

	public String getAcctCcyCde() {
		return acctCcyCde;
	}

	public void setAcctCcyCde(String acctCcyCde) {
		this.acctCcyCde = acctCcyCde;
	}

}