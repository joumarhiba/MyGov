package com.mygov.Repository;

import com.mygov.models.Transaction;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends ElasticsearchRepository<Transaction, String> {
    Iterable<Transaction> findByMinistere(String ministere);
}