package com.expensetracker.online.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_expense")
@Setter
@Getter
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String expenseName;
	private String description;
	private BigDecimal amount;

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append("id{id=").append(id).append(", expenseName=").append(expenseName).append(", description=")
				.append(description).append(", amount=").append(amount).append("}");

		return builder.toString();
	}

}
