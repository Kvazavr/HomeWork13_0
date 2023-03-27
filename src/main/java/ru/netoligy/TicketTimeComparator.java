package ru.netoligy;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {
    Ticket ticket = new Ticket(
            "Moscow",
            "Saratov",
            3600,
            1600,
            1800;
    )

    @Override
    public int compare(Ticket t1, Ticket t2) {
        if (t1.getFlyTime() < t2.getFlyTime()) {
            return -1;
        } else if (t1.getFlyTime() > t2.getFlyTime()) {
            return 1;
        } else {
            return 0;
        }
    }
}
