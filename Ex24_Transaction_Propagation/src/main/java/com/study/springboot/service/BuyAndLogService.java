package com.study.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.study.springboot.dao.ITransaction1Dao;
import com.study.springboot.dao.ITransaction2Dao;
@Service
public class BuyAndLogService {
	
	@Autowired
	BuyTicketService buyTicket;
	@Autowired
	LogWriteService logWrite;
	
	
//	@Autowired
//	PlatformTransactionManager transactionManager;
//	@Autowired
//	TransactionDefinition definition;
	

	@Autowired
	TransactionTemplate transactionTemplate;
	

	
	public int buy(String consumerId, int amount, String error) {
		
		//TransactionStatus status = transactionManager.getTransaction(definition);
		
		try {
			transactionTemplate.execute(new TransactionCallbackWithoutResult() {

				@Override
				protected void doInTransactionWithoutResult(TransactionStatus status) {
					buyTicket.buy(consumerId, amount, error);
					
					//의도적 에러 예제를 위해 어쩔수없이..
					if(error.equals("2")) {int n = 10/0;}
					
					logWrite.write(consumerId, amount);
					
				}
				
			});
	
			
			//transactionManager.commit(status);
			
			
			return 1;
		
		}catch(Exception e) {
			System.out.println("Rollback!!!!!!");
			//transactionManager.rollback(status);
			return 0;
		}
		
	}

}
