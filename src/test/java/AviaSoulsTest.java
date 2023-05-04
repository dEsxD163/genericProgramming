import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AviaSoulsTest {
    @Test
    public void testCompareTo() {
        Ticket ticket1 = new Ticket("Домодедово", "Адлер", 150, 1, 2);
        Ticket ticket2 = new Ticket("Домодедово", "Самара", 200, 3, 4);
        Ticket ticket3 = new Ticket("Домодедово", "Адлер", 100, 5, 6);
        Ticket ticket4 = new Ticket("Домодедово", "Москва", 400, 7, 8);
        Ticket ticket5 = new Ticket("Домодедово", "Адлер", 500, 9, 10);

        Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5};
        Arrays.sort(tickets);

        Ticket[] expected = {ticket3, ticket1, ticket2, ticket4, ticket5};
        Ticket[] actual = tickets;
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testComparator() {
        Ticket ticket1 = new Ticket("Домодедово", "Адлер", 150, 1, 2);
        Ticket ticket2 = new Ticket("Домодедово", "Самара", 200, 1, 4);
        Ticket ticket3 = new Ticket("Домодедово", "Адлер", 100, 1, 6);
        Ticket ticket4 = new Ticket("Домодедово", "Москва", 400, 1, 8);
        Ticket ticket5 = new Ticket("Домодедово", "Адлер", 500, 1, 4);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5};
        Arrays.sort(tickets, comparator);

        Ticket[] expected = {ticket1, ticket2, ticket5, ticket3, ticket4};
        Ticket[] actual = tickets;
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchMethodTestTicket3() {
        Ticket ticket1 = new Ticket("Домодедово", "Адлер", 150, 1, 2);
        Ticket ticket2 = new Ticket("Домодедово", "Самара", 200, 3, 4);
        Ticket ticket3 = new Ticket("Домодедово", "Адлер", 100, 5, 6);
        Ticket ticket4 = new Ticket("Домодедово", "Москва", 400, 7, 8);
        Ticket ticket5 = new Ticket("Домодедово", "Адлер", 500, 9, 10);

        AviaSouls avia = new AviaSouls();

        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);

        Ticket[] expected = {ticket3, ticket1, ticket5};
        Ticket[] actual = avia.search("Домодедово", "Адлер");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchMethodTestTicket1() {
        Ticket ticket1 = new Ticket("Домодедово", "Адлер", 150, 1, 2);
        Ticket ticket2 = new Ticket("Домодедово", "Самара", 200, 3, 4);
        Ticket ticket3 = new Ticket("Домодедово", "Адлер", 100, 5, 6);
        Ticket ticket4 = new Ticket("Домодедово", "Москва", 400, 7, 8);
        Ticket ticket5 = new Ticket("Домодедово", "Адлер", 500, 9, 10);

        AviaSouls avia = new AviaSouls();

        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);

        Ticket[] expected = {ticket4};
        Ticket[] actual = avia.search("Домодедово", "Москва");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchMethodTestTicket0() {
        Ticket ticket1 = new Ticket("Домодедово", "Адлер", 150, 1, 2);
        Ticket ticket2 = new Ticket("Домодедово", "Самара", 200, 3, 4);
        Ticket ticket3 = new Ticket("Домодедово", "Адлер", 100, 5, 6);
        Ticket ticket4 = new Ticket("Домодедово", "Москва", 400, 7, 8);
        Ticket ticket5 = new Ticket("Домодедово", "Адлер", 500, 9, 10);

        AviaSouls avia = new AviaSouls();

        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);

        Ticket[] expected = {};
        Ticket[] actual = avia.search("Домодедово", "Уфа");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchMethodTestComparatorTicket3() {
        Ticket ticket1 = new Ticket("Домодедово", "Адлер", 150, 1, 2);
        Ticket ticket2 = new Ticket("Домодедово", "Самара", 200, 1, 4);
        Ticket ticket3 = new Ticket("Домодедово", "Адлер", 100, 1, 6);
        Ticket ticket4 = new Ticket("Домодедово", "Москва", 400, 1, 8);
        Ticket ticket5 = new Ticket("Домодедово", "Адлер", 500, 1, 4);

        AviaSouls avia = new AviaSouls();

        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket1, ticket5, ticket3};
        Ticket[] actual = avia.searchAndSortBy("Домодедово", "Адлер", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchMethodTestComparatorTicket1() {
        Ticket ticket1 = new Ticket("Домодедово", "Адлер", 150, 1, 2);
        Ticket ticket2 = new Ticket("Домодедово", "Самара", 200, 1, 4);
        Ticket ticket3 = new Ticket("Домодедово", "Адлер", 100, 1, 6);
        Ticket ticket4 = new Ticket("Домодедово", "Москва", 400, 1, 8);
        Ticket ticket5 = new Ticket("Домодедово", "Адлер", 500, 1, 4);

        AviaSouls avia = new AviaSouls();

        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket2};
        Ticket[] actual = avia.searchAndSortBy("Домодедово", "Самара", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchMethodTestComparatorTicket0() {
        Ticket ticket1 = new Ticket("Домодедово", "Адлер", 150, 1, 2);
        Ticket ticket2 = new Ticket("Домодедово", "Самара", 200, 1, 4);
        Ticket ticket3 = new Ticket("Домодедово", "Адлер", 100, 1, 6);
        Ticket ticket4 = new Ticket("Домодедово", "Москва", 400, 1, 8);
        Ticket ticket5 = new Ticket("Домодедово", "Адлер", 500, 1, 4);

        AviaSouls avia = new AviaSouls();

        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = avia.searchAndSortBy("Домодедово", "Магадан", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }
}
