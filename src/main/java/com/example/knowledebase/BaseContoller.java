//package com.example.knowledebase;
//
//import org.aspectj.weaver.AbstractReferenceTypeDelegate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/save")
//public class BaseContoller {
//
//    @Autowired
//    ArticleController articleController;
//
//    @Autowired
//    FAQController faqController;
//
//    @PostMapping("/{docType}")
//    public void getDocType(@PathVariable String docType , @RequestBody DocTypeArticle docTypeArticle) {
//
//
//        if (docType.equalsIgnoreCase("articleDoc")) {
//            articleController.saveDocument(docTypeArticle);
//
//        }
//        if (docType.equalsIgnoreCase("faqDoc")) {
//
//        }
//
//    }
//
//    public void ArticleDOCRequest(){}
//
//    public void FAQDocRequest(){}
//
//
//
//}
