package com.example.knowledebase;

import javax.persistence.*;

@Entity(name="Article_table")
public class DocTypeArticle {

    @GeneratedValue
    @Id
    private  int docID;

    @Column(name="docType")
    private String docType;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content ;

    @Column(name="category_id")
    private String categoryId;

//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name="docID")
//    private DocCateogoryWithOrm docCateogoryWithOrm;

    public int getDocID() {
        return docID;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent(String content) {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "DocTypeArticle{" +
                "docID=" + docID +
                ", docType='" + docType + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }
}
