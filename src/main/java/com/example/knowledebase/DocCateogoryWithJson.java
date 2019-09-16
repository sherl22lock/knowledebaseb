package com.example.knowledebase;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.nashorn.internal.runtime.options.Option;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class DocCateogoryWithJson {

    @JsonProperty(required = true)
    private int docCategoryId;

    @JsonProperty(required = false)
    private String cateogoryName;

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
