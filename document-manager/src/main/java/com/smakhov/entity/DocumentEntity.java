package com.smakhov.entity;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName="document", type = "document")
public class DocumentEntity {
	
	@Field(analyzer = "english", searchAnalyzer = "english", type = FieldType.String)
	private String content;
	@Field(analyzer = "english", searchAnalyzer = "english", type = FieldType.String)
	private String title;
	private String download;
	
	private String id;
	
	public DocumentEntity() {
	}

	public DocumentEntity(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public DocumentEntity(String id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public DocumentEntity(String id, String title, String content, String download) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.download = download;
	}

	public String getContent() {
		return content;
	}

	public String getDownload() {
		return download;
	}
	
	public String getId() {
		return id;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setDownload(String download) {
		this.download = download;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
