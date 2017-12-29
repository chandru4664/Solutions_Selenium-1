package selenium1.exam1;

import java.sql.Date;

public class Issue {

	public Issue() {
		super();
	}

	public Issue(int issueId, Date issueGeneratedDate, String issueCategory, String issueDescription) {
		super();
		this.issueId = issueId;
		this.issueGeneratedDate = issueGeneratedDate;
		this.issueCategory = issueCategory;
		this.issueDescription = issueDescription;
	}

	private int issueId;
	private Date issueGeneratedDate;
	private String issueCategory;
	private String issueDescription;
	
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	public Date getIssueGeneratedDate() {
		return issueGeneratedDate;
	}
	public void setIssueGeneratedDate(Date issueGeneratedDate) {
		this.issueGeneratedDate = issueGeneratedDate;
	}
	public String getIssueCategory() {
		return issueCategory;
	}
	public void setIssueCategory(String issueCategory) {
		this.issueCategory = issueCategory;
	}
	public String getIssueDescription() {
		return issueDescription;
	}
	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueGeneratedDate=" + issueGeneratedDate + ", issueCategory="
				+ issueCategory + ", issueDescription=" + issueDescription + "]";
	}
	
	
}
