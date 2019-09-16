package com.example.knowledebase;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity(name="Faq_Table")
public class DocumentTypeFAQ {

    @GeneratedValue
    @Id
   private  int docID;

    @Column(name="docType")
    private String docType;

    @Column(name="Question")
    private String Question ;

    @Column(name="Answers")
    private String Answers;

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

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswers() {
        return Answers;
    }

    public void setAnswers(String answers) {
        Answers = answers;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "DocumentTypeFAQ{" +
                "docID=" + docID +
                ", docType='" + docType + '\'' +
                ", Question='" + Question + '\'' +
                ", Answers='" + Answers + '\'' +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }
}

