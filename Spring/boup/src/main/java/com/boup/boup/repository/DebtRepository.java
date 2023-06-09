package com.boup.boup.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boup.boup.model.Debt;
import com.boup.boup.model.User;

public interface DebtRepository extends JpaRepository<Debt, Integer> {

	public List<Debt> findByReceiver(User u);
	public List<Debt> findByDebtor(User u);
}
