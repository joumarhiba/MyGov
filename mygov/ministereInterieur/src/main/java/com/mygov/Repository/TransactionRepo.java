package com.mygov.Repository;

import com.mygov.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
}
