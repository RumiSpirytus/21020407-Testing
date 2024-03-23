// package com.example;
// 
// import static org.junit.Assert.*;
// 
// import org.junit.Test;
// 
// public class TicketTest 
// {
//     @Test
//     public void testcase1() {
//         Ticket ticket = new Ticket("Ngày thường", -1);
//         assertEquals("Invalid Input", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase2() {
//         Ticket ticket = new Ticket("Ngày thường", 0);
//         assertEquals("50000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase3() {
//         Ticket ticket = new Ticket("Ngày thường", 1);
//         assertEquals("50000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase4() {
//         Ticket ticket = new Ticket("Ngày thường", 11);
//         assertEquals("50000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase5() {
//         Ticket ticket = new Ticket("Ngày thường", 21);
//         assertEquals("50000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase6() {
//         Ticket ticket = new Ticket("Ngày thường", 22);
//         assertEquals("50000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase7() {
//         Ticket ticket = new Ticket("Ngày thường", 23);
//         assertEquals("100000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase8() {
//         Ticket ticket = new Ticket("Ngày thường", 100);
//         assertEquals("100000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase9() {
//         Ticket ticket = new Ticket("Ngày thường", null);
//         assertEquals("Invalid Input", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase10() {
//         Ticket ticket = new Ticket("Ngày cuối tuần", -1);
//         assertEquals("Invalid Input", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase11() {
//         Ticket ticket = new Ticket("Ngày cuối tuần", 0);
//         assertEquals("60000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase12() {
//         Ticket ticket = new Ticket("Ngày cuối tuần", 1);
//         assertEquals("60000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase13() {
//         Ticket ticket = new Ticket("Ngày cuối tuần", 11);
//         assertEquals("60000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase14() {
//         Ticket ticket = new Ticket("Ngày cuối tuần", 21);
//         assertEquals("60000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase15() {
//         Ticket ticket = new Ticket("Ngày cuối tuần", 22);
//         assertEquals("60000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase16() {
//         Ticket ticket = new Ticket("Ngày cuối tuần", 23);
//         assertEquals("120000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase17() {
//         Ticket ticket = new Ticket("Ngày cuối tuần", 100);
//         assertEquals("120000VND", ticket.priceOfTicket());
//     }
// 
//     @Test
//     public void testcase18() {
//         Ticket ticket = new Ticket("Ngày cuối tuần", null);
//         assertEquals("Invalid Input", ticket.priceOfTicket());
//     }
// }
