package com.steepsalvador.saga.payment.repository;

import com.steepsalvador.saga.payment.entity.UserTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTransactionRepository extends JpaRepository<UserTransaction,Integer> {
}
