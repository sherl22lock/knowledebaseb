package com.example.knowledebase;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity(name="Doc-Cateogory")
public class DocCateogoryWithOrm {

    @GeneratedValue
    @Id
    private int docCategoryId;

    @Column(name="catogory_name")
    private String cateogoryName;

    //@ManyToOne
    //private DocumentTypeFAQ documentTypeFAQ;

    //@ManyToOne
  //  private DocTypeArticle docTypeArticle;

    public int getDocCategoryId() {
        return docCategoryId;
    }

    public void setDocCategoryId(int docCategoryId) {
        this.docCategoryId = docCategoryId;
    }

    public String getCateogoryName() {
        return cateogoryName;
    }

    public void setCateogoryName(String cateogoryName) {
        this.cateogoryName = cateogoryName;
    }

    @Override
    public String toString() {
        return "DocCateogory{" +
                "docCategoryId=" + docCategoryId +
                ", cateogoryName='" + cateogoryName + '\'' +
                '}';
    }
}
