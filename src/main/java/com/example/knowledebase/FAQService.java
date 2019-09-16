package com.example.knowledebase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FAQService {
    @Autowired
    FAQRepository faqRepository;

    public List<DocumentTypeFAQ> getAllDoc(){
        List<DocumentTypeFAQ> list = faqRepository.findAll();
        return list;
    }

    public DocumentTypeFAQ saveIntoDB(DocumentTypeFAQ documentTypeFAQ){
        documentTypeFAQ = faqRepository.save(documentTypeFAQ);
        return documentTypeFAQ;
    }

    public DocumentTypeFAQ searchFromDB(DocumentTypeFAQ documentTypeFAQ)
    {
        Optional<DocumentTypeFAQ> docTpe= faqRepository.findById(documentTypeFAQ.getDocID());

        if(docTpe.isPresent()){
            DocumentTypeFAQ newDoc= new DocumentTypeFAQ();
            newDoc.setDocID(documentTypeFAQ.getDocID());
            newDoc.setAnswers(documentTypeFAQ.getAnswers());
            newDoc.setDocType(documentTypeFAQ.getDocType());
            newDoc.setQuestion(documentTypeFAQ.getQuestion());
            newDoc.setCategoryId(documentTypeFAQ.getCategoryId());
            return newDoc;
        }

        else{
            documentTypeFAQ = faqRepository.save(documentTypeFAQ);
            return documentTypeFAQ;
        }

    }


}

