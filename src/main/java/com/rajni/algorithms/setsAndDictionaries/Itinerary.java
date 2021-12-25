package com.rajni.algorithms.setsAndDictionaries;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Itinerary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the no of tickets from input
        int n = in.nextInt();

        // map to store all the tickets
        Map<String, String> tickets = new HashMap<>();

        // Store the source and destination of the tickets to the map "tickets"
        for (int i = 0; i < n; i++) {
            tickets.put(in.next(), in.next());
            in.nextLine();
        }

        // write your code here
        Map<String, String> reverseTickets = new HashMap<>();
        for (Map.Entry<String, String > entrySet : tickets.entrySet()) {
            reverseTickets.put(entrySet.getValue(), entrySet.getKey());
        }
        // get the starting point
        String startingEntry = null;
        for (Map.Entry<String, String > entrySet : tickets.entrySet()) {
            String key = entrySet.getKey();
            if(!reverseTickets.containsKey(key)) {
                startingEntry = key;
                break;
            }
        }

        while (startingEntry != null) {
            System.out.print(startingEntry+" ");
            startingEntry = tickets.get(startingEntry);
        }


    }
}
