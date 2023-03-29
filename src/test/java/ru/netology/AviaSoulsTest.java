package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netoligy.AviaSouls;
import ru.netoligy.Ticket;

public class AviaSoulsTest {
    Ticket ticket1 = new Ticket("Moscow", "Saratov", 3600, 16, 18);
    Ticket ticket2 = new Ticket("Moscow", "Saint-Petersburg", 2100, 14, 16);
    Ticket ticket3 = new Ticket("Sakhalin", "Samara", 42_000, 7, 17);
    Ticket ticket4 = new Ticket("Samara", "Omsk", 7_500, 9, 14);
    Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4};

    @Test
    public void compareToTest(){
        ticket.compareTo();
        Ticket[] expected = new Ticket[] {ticket2, ticket1, ticket4, ticket3};
        Ticket[] actual = tickets.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }


}
