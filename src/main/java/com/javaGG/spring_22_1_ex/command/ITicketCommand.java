package com.javaGG.spring_22_1_ex.command;

import com.javaGG.spring_22_1_ex.dto.TicketDto;

public interface ITicketCommand {
   
   public void execute(TicketDto ticketDto);

}