package BusTicketSystem.Utility;

// public class TicketNoGenerator
// {
//     static int i;
//     public int generateTicketNo(int busNo)
//     {
//        i++;
//        return i;
//     }
// }
import java.util.HashMap;
import java.util.Map;

public class TicketNoGenerator {
    private Map<Integer, Integer> ticketCounters = new HashMap<>();

    public int generateTicketNo(int busNo) {
        ticketCounters.put(busNo, ticketCounters.getOrDefault(busNo, 0) + 1);
        return ticketCounters.get(busNo);
    }
}
