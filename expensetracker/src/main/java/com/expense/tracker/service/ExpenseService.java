package com.expense.tracker.service;

import java.util.List;

import com.expense.tracker.model.Expense;

public interface ExpenseService {

	public List<Expense> findAll();
	public Expense save(Expense expense);
	public Expense findById(Long id);
	void delete(Long id);

}
