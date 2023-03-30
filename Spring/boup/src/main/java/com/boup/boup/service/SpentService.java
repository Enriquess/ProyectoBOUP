package com.boup.boup.service;

import java.util.List;
import java.util.Optional;

import com.boup.boup.model.Spent;

public interface SpentService {
	public boolean insert(Spent s);
	public boolean update(Spent s);
	public boolean delete(Integer id);
	public List<Spent> findAll();
	public Optional<Spent> findById(Integer id);
}