package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.model.Account;

public interface IAccountRepo extends JpaRepository<Account, Integer> {

	@Query("update Account set amount=amount-:amt where acno=:srcAcno")
	@Modifying
	public int withdrawMoney(long srcAcno,double amt);
	
	@Query("update Account set amount=amount+:amt where acno=:destAcno")
	@Modifying
	public int depositeAmount(long destAcno,double amt);
}
