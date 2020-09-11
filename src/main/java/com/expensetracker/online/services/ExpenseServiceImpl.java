package com.expensetracker.online.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.expensetracker.online.model.Expense;
import com.expensetracker.online.repository.ExpenseRepository;

@Component
public class ExpenseServiceImpl implements ExpenseService {

	private static final Logger logger = LoggerFactory.getLogger(ExpenseServiceImpl.class);

	@Autowired
	ExpenseRepository expenseRepository;

	@Override
	public List<Expense> findAll() {

		return expenseRepository.findAll();
	}

}
