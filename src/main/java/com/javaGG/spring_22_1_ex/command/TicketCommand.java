package com.javaGG.spring_22_1_ex.command;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.javaGG.spring_22_1_ex.dao.TicketDao;
import com.javaGG.spring_22_1_ex.dto.TicketDto;

public class TicketCommand implements ITicketCommand {
   private TransactionTemplate transactionTemplate2;
   private TicketDao  ticketDao;

   public void setTicketDao(TicketDao ticketDao) {
      this.ticketDao = ticketDao;
   }
   
   public void setTransactionTemplate2(TransactionTemplate transactionTemplate2) {
	   this.transactionTemplate2 = transactionTemplate2;
   }

   @Override
   public void execute(final TicketDto ticketDto) {
      // TODO Auto-generated method stub
      transactionTemplate2.execute(new TransactionCallbackWithoutResult() {
         @Override
         protected void doInTransactionWithoutResult(TransactionStatus status) {
            // TODO Auto-generated method stub
            ticketDto.setAmount("1");
            ticketDao.buyTicket(ticketDto);
            ticketDto.setAmount("5");
            ticketDao.buyTicket(ticketDto);
         }
      });
   }
}