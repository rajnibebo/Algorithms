package com.rajni.algorithms.assignments;

import java.util.Queue;
import java.util.Stack;

public class PartA {
    private static Stack<String> history = new Stack<String>();

    public static Boolean isBrowsingHistoryEmpty() {
        // Add CODE BELOW
        return history.isEmpty();
    }

    public static String mostRecentlyVisitedSite() {
        // Add CODE BELOW
        return history.peek();
    }

    public static void addSiteToHistory(String url) {
        // Add CODE BELOW
        history.push(url);
    }

    public static void goBackInTime(int n) {
        // Add CODE BELOW
        int count = n;
        if(n <= history.size() - 1) {
            while (count > 0) {
                history.pop();
                count--;
            }
        }
    }

    public static void printBrowsingHistory() {
        // Add CODE BELOW
        Stack<String> browseHistory = new Stack<>();
        while (!history.isEmpty()) {
            String historyItem = history.pop();
            browseHistory.push(historyItem);
        }

        while (!browseHistory.isEmpty()) {
            history.push(browseHistory.pop());
        }

        System.out.println(history);
    }

    public static void main(String[] args) {
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        addSiteToHistory("www.google.co.in"); // Navigating to Google
        addSiteToHistory("www.facebook.com"); // Navigating to Facebook
        addSiteToHistory("www.upgrad.com"); // Navigating to UpGrad
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad)
        addSiteToHistory("www.youtube.com"); // Navigating to Youtube
        goBackInTime(2); // Going back by 2 sites
        addSiteToHistory("www.yahoo.com"); // Navigating to UpGrad platform site
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad Learn Platform)
        printBrowsingHistory(); // Printing browsing history

    }

}
