package com.example; 

import static org.junit.Assert.*;

import org.junit.Test;

public class WhiteBoxTesting 
{
    @Test
    public void testcase1() {
        Ticket ticket = new Ticket("Ngày thường", 10);
        assertEquals("50000", ticket.priceOfTicket());
    }
    @Test
    public void testcase2() {
        Ticket ticket = new Ticket("Ngày thường", 50);
        assertEquals("100000", ticket.priceOfTicket());
    }

    @Test
    public void testcase3() {
        Ticket ticket = new Ticket("Ngày thường", 201);
        assertEquals("Invalid Input", ticket.priceOfTicket());
    }

    @Test
    public void testcase4() {
        Ticket ticket = new Ticket("Ngày cuối tuần", 10);
        assertEquals("60000", ticket.priceOfTicket());
    }
    @Test
    public void testcase5() {
        Ticket ticket = new Ticket("Ngày cuối tuần", 50);
        assertEquals("120000", ticket.priceOfTicket());
    }

    @Test
    public void testcase6() {
        Ticket ticket = new Ticket("Ngày cuối tuần", 201);
        assertEquals("Invalid Input", ticket.priceOfTicket());
    }
}
