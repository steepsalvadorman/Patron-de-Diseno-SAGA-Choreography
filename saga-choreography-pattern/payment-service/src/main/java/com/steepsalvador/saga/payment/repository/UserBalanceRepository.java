package com.steepsalvador.saga.payment.repository;

import com.steepsalvador.saga.payment.entity.UserBalance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBalanceRepository extends JpaRepository<UserBalance,Integer> {
}
