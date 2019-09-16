package com.example.knowledebase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/save")
public class ArticleController {

@Autowired
ArticleService articleService;

    @PostMapping("/articleDoc")
    public ResponseEntity<DocTypeArticle> saveDocument(@RequestBody DocTypeArticle docTypeArticle){
        DocTypeArticle doc = articleService.saveIntoDB(docTypeArticle);

        return new ResponseEntity<DocTypeArticle>(doc,new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/findAllArticle")
    public ResponseEntity<List<DocTypeArticle>> findAll(){
        List<DocTypeArticle> doc = articleService.getAllDoc();

        return new ResponseEntity<List<DocTypeArticle>>(doc,new HttpHeaders(), HttpStatus.OK);
    }
    
}

