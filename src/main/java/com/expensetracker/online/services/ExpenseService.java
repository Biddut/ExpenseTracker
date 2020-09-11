package com.expensetracker.online.services;

import java.util.List;

import com.expensetracker.online.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();
}
