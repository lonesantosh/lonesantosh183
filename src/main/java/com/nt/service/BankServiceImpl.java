package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.repo.IAccountRepo;

import jakarta.transaction.Transactional;

@Service("BankService")
public class BankServiceImpl implements IBankService {

	@Autowired
	private IAccountRepo repo;
	
	@Override
	@Transactional
	public String transferMoney(long srcAcno, long destAcno, double amount) {
		int result1=repo.withdrawMoney(srcAcno, amount);
		int result2=repo.depositeAmount(destAcno, amount);
		if(result1==0||result2==0) {
			throw new RuntimeException("Problem in transfer money");
		}else
		{
			return "Money Trasnfer from "+srcAcno+" to "+destAcno+" Amount "+amount;
		}
		
	}

}
