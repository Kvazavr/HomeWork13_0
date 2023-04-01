package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netoligy.AviaSouls;
import ru.netoligy.Ticket;
import ru.netoligy.TicketTimeComparator;

import java.util.Arrays;

public class AviaSoulsTest {
    Ticket ticket1 = new Ticket("Moscow", "Saratov", 3600, 16, 18);
    Ticket ticket2 = new Ticket("Moscow", "Saint-Petersburg", 2100, 14, 16);
    Ticket ticket3 = new Ticket("Sakhalin", "Samara", 42_000, 7, 17);
    Ticket ticket4 = new Ticket("Samara", "Omsk", 7_500, 9, 14);
    Ticket ticket5 = new Ticket("Moscow", "Saratov", 3600, 16, 17);
    Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4};

    @Test
    public void compareToTest() {
        Arrays.sort(tickets);
        Ticket[] expected = new Ticket[]{ticket2, ticket1, ticket4, ticket3};
        Ticket[] actual = tickets;
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchTicketTest() {
        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        Ticket[] actual = aviaSouls.search("Samara", "Omsk");
        Ticket[] expected = new Ticket[]{ticket4};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchTwoTicketsTest() {
        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        Ticket[] actual = aviaSouls.search("Moscow", "Saratov");
        Ticket[] expected = new Ticket[]{ticket1, ticket5};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchNoOneTicketTest() {
        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        Ticket[] actual = aviaSouls.search("Moscow", "Anapa");
        Ticket[] expected = new Ticket[]{};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ticketTimeComparatorTest() {
        TicketTimeComparator ticketTimeComparator = new TicketTimeComparator();
        int expected = -1;
        int actual = ticketTimeComparator.compare(ticket1, ticket3);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void searchAndSortBy() {
        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        Ticket[] expected = new Ticket[]{ticket5, ticket1};
        Ticket[] actual = aviaSouls.searchAndSortBy("Moscow", "Saratov", new TicketTimeComparator());
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchAndSortByNoOneTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        Ticket[] expected = new Ticket[]{};
        Ticket[] actual = aviaSouls.searchAndSortBy("Moscow", "Anapa", new TicketTimeComparator());
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchAndSortByOneTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        Ticket[] expected = new Ticket[]{ticket2};
        Ticket[] actual = aviaSouls.searchAndSortBy("Moscow", "Saint-Petersburg", new TicketTimeComparator());
        Assertions.assertArrayEquals(expected, actual);

    }
}
