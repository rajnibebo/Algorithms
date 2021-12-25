package com.rajni.algorithms.setsAndDictionaries;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com","rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com","phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};

        String NewEmail="monica.geller@xyz.com";

        int i;
        boolean found = false;
        for (i = 0 ; i < emails.length; i++) {
            if(emails[i].equals(NewEmail)) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println(i);
        } else {
            System.out.println("-1");
        }
    }
}
