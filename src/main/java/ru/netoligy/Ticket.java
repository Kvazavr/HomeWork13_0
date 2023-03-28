package ru.netoligy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Ticket {
    private String from; // аэропорт откуда
    private String to; // аэропорт куда
    private int price; // цена
    private int timeFrom; // время вылета (по москве)
    private int timeTo; // время прилёта (по москве)

    public Ticket(String from, String to, int price, int timeFrom, int timeTo) {
        this.from = from;
        this.to = to;
        this.price = price;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int flyTime() {
        return timeTo - timeFrom;
    }

    public int getPrice() {
        return price;
    }

    public int getTimeFrom() {
        return timeFrom;
    }

    public int getTimeTo() {
        return timeTo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return price == ticket.price && timeFrom == ticket.timeFrom && timeTo == ticket.timeTo && from.equals(ticket.from) && to.equals(ticket.to);
    }
    Ticket ticket1 = new Ticket("Moscow","Saratov",3600,16,18);            ;
    Ticket ticket2 = new Ticket("Moscow", "Saint-Petersburg", 2100, 14, 16);
    Ticket ticket3 = new Ticket("Sakhalin", "Samara", 42_000, 7, 17);
    Ticket ticket4 = new Ticket("Samara", "Omsk", 7_500, 9, 14);


    @Override
    public int hashCode() {
        return Objects.hash(from, to, price, timeFrom, timeTo);
    }

    TicketTimeComparator timeComparator = new TicketTimeComparator();
    Ticket[] tickets = { ticket1, ticket2, ticket3, ticket4 };
            Arrays.sort (tickets,timeComparator);
}
