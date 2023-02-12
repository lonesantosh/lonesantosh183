package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
public class Account {

	@Id
	private Long acno;
	private String holdername;
	private Double amount;
	
	
}
