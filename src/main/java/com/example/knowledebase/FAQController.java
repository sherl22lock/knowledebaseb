package com.example.knowledebase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/save")
public class FAQController {
    @Autowired
    FAQService faqService;

    @PostMapping("/faqDoc")
    public ResponseEntity<DocumentTypeFAQ> saveDocument(@RequestBody DocumentTypeFAQ documentTypeFAQ){
        DocumentTypeFAQ doc = faqService.saveIntoDB(documentTypeFAQ);

        return new ResponseEntity<DocumentTypeFAQ>(doc,new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<DocumentTypeFAQ>> findAll(){
       List<DocumentTypeFAQ> doc = faqService.getAllDoc();

        return new ResponseEntity<List<DocumentTypeFAQ>>(doc,new HttpHeaders(), HttpStatus.OK);
    }
}



////



//{
//        "docType": "FAQ",
//        "question": "How do i reset my username ?",
//        "ans": "Do Forgot pin and generate pin",
//        "categorry":[
//
//                ]
//        }
//
        /////