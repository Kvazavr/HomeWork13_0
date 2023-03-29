package ru.netoligy;

import java.util.Arrays;
import java.util.Comparator;

public interface AviaSoulsInterface {
     void add(Ticket ticket);

    Ticket[] findAll();


     Ticket[] search(String from, String to);

    Ticket[] searchAndSortBy(String from, String to, Comparator<Ticket> comparator);
}