package com.paul.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="COMMENTS")
public class Comment implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_name")
//	@SequenceGenerator(name = "sequence_name", sequenceName = "sequence_name", allocationSize = 1, initialValue = 1)
	private int id;
	
	@Column(name="TITLE", nullable=false)
	private String title;
	
	@Column(name="CONTENT", nullable=false)
	private String content;
	
	@Basic
	@Column(name="TIMESTAMP", insertable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;
	
	public Comment() {}
	
	public Comment(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public Comment(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
	
	public Comment(int id, String title, String content, Date timestamp) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.timestamp = timestamp;
	}

	@PrePersist
	protected void onCreate() {
		timestamp = new Date();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString() {
		return "ID: " + id
				+ ", Title: " + title
				+ ", Content: " + content
				+ ", Timestamp: " + timestamp;
	}
}
