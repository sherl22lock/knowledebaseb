package com.example.knowledebase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    public List<DocTypeArticle> getAllDoc(){
        List<DocTypeArticle> list = articleRepository.findAll();
        return list;
    }

    public DocTypeArticle saveIntoDB(DocTypeArticle docTypeArticle){
        docTypeArticle = articleRepository.save(docTypeArticle);
        return docTypeArticle;
    }

    public DocTypeArticle searchFromDB(DocTypeArticle docTypeArticle)
    {
        Optional<DocTypeArticle> docTpe= articleRepository.findById(docTypeArticle.getDocID());

        if(docTpe.isPresent()){
            DocTypeArticle newDoc= new DocTypeArticle();
            newDoc.setDocID(docTypeArticle.getDocID());
            newDoc.setTitle(docTypeArticle.getTitle());
            newDoc.setCategoryId(docTypeArticle.getCategoryId());
            return newDoc;
        }

        else{
            docTypeArticle = articleRepository.save(docTypeArticle);
            return docTypeArticle;
        }

    }


}
