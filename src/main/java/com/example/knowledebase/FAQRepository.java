package com.example.knowledebase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FAQRepository extends JpaRepository<DocumentTypeFAQ,Integer> {
}
