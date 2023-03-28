package ru.netoligy;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {
    Ticket ticket3 = new Ticket("Moscow","Saratov",3600,16,18);            ;
    Ticket ticket1 = new Ticket("Moscow", "Saint-Petersburg", 2100, 14, 16);
    Ticket ticket2 = new Ticket("Sakhalin", "Samara", 42_000, 7, 17);
    Ticket ticket4 = new Ticket("Samara", "Omsk", 7_500, 9, 14);

    @Override
    public int compare(Ticket t1, Ticket t2) {
        if (t1.flyTime() < t2.flyTime()) {
            return -1;
        } else if (t1.flyTime() > t2.flyTime()) {
            return 1;
        } else {
            return 0;
        }
    }

}
