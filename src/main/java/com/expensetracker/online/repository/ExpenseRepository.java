package com.expensetracker.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expensetracker.online.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
