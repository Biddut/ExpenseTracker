package com.expensetracker.online.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expensetracker.online.model.Expense;
import com.expensetracker.online.services.ExpenseService;

@RestController
@RequestMapping("/api/v1")
public class Expensecontroller {

	private static final Logger logger = LoggerFactory.getLogger(Expensecontroller.class);

	@Autowired
	ExpenseService expenseService;

	@RequestMapping("/expenses")
	public ResponseEntity<List<Expense>> get() {

		List<Expense> expenses = expenseService.findAll();

		return new ResponseEntity<List<Expense>>(expenses, HttpStatus.OK);

	}

	@RequestMapping("/expenses2")
	public String getsingle() {

		List<Expense> expenses = expenseService.findAll();
		String result = expenses.stream().map(n -> String.valueOf(n)).collect(Collectors.joining("-", "{", "}"));
		// System.out.println(result);
		// System.out.println(StringUtils.join(expenses, "|"));
		// StringUtils.join(expenses);
		// String joined = TextUtils.join(", ", expenses);
		return result;

	}

}
