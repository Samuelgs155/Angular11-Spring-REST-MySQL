package com.expense.tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expense.tracker.model.Expense;
import com.expense.tracker.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}

	@Override
	@Transactional
	public Expense save(Expense expense) {
		expenseRepository.save(expense);
		return expense;
	}

	@Override
	@Transactional(readOnly = true)
	public Expense findById(Long id) {
		Expense expense = expenseRepository.findById(id).orElse(null);
		return expense;
	}

	@Override
	@Transactional
	public void delete(Long id) {
		Expense expense = findById(id);
		expenseRepository.delete(expense);		
	}

}
