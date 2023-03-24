package com.boup.boup.model;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor
@Builder

@Entity
public class User {

	private Integer id;
	private String token;
	private String username;
	private String nameU;
	private String email;
	private String password;
	private String telephone;
	private List<Debt> debtlist;
	private List<PDebt> pDebtList;
}
