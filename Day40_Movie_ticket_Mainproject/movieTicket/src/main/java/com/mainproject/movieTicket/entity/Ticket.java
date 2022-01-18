package com.mainproject.movieTicket.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {
    @Id
    private Long ticketId;
    @Column(nullable = false)
    private Double ticketAmount=180.0;

//    @JsonIgnore
//    @ManyToOne
//    private Movie movie;

    public Ticket(Long ticketId, Double ticketAmount) {
        this.ticketId = ticketId;
        this.ticketAmount = ticketAmount;
    }

    public Ticket(){

    }
    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Double getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(Double ticketAmount) {
        this.ticketAmount = ticketAmount;
    }
}
