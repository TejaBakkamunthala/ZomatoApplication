package com.zomato.app.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HelpSupport",schema="zomato")
public class HelpSupport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issue_id")
    private int issueId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @Column(name = "issue_description", columnDefinition = "TEXT")
    private String issueDescription;

    @Column(name = "issue_date")
    private LocalDate issueDate;

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public HelpSupport(int issueId, User user, String issueDescription, LocalDate issueDate) {
		super();
		this.issueId = issueId;
		this.user = user;
		this.issueDescription = issueDescription;
		this.issueDate = issueDate;
	}
	

	public HelpSupport() {
		super();
	}

	@Override
	public String toString() {
		return "HelpSupport [issueId=" + issueId + ", user=" + user + ", issueDescription=" + issueDescription
				+ ", issueDate=" + issueDate + "]";
	}

    
    
}
