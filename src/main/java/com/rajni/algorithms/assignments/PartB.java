package com.rajni.algorithms.assignments;

import java.util.LinkedList;
import java.util.Queue;

class SiteStats {
    private String url;
    private int numVisits;

    /**
     * Constructor for the SiteStats class
     *
     * @param url
     *            String that represents an URL that the user has visited
     * @param numVisits
     *            An int that represents the number of times that the user has
     *            visited the url
     */
    public SiteStats(String url, int numVisits) {
        this.url = url;
        this.numVisits = numVisits;
    }

    /**
     * This method returns the number of times that the user has visited the url.
     *
     * @return An int that represents the number of times that the user has visited
     *         the url
     */
    public int getNumVisits() {
        return this.numVisits;
    }

    /**
     * This method returns the url that we are currently tracking
     *
     * @return A String that represents the url that we are currently tracking
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * This method updates the number of times that we have visited the url
     *
     * @param an int that represents the number that we want to set numVisits to
     */
    public void setNumVisits(int updatedNumVisits) {
        this.numVisits = updatedNumVisits;
    }

    public String toString() {
        return this.url + " | " + this.numVisits;
    }

}

public class PartB {

    private static Queue<SiteStats> sites = new LinkedList<SiteStats>();


    // Main method to list top n visited sites
    public static void listTopVisitedSites(Queue<SiteStats> sites, int n) {
        // WRITE CODE HERE

        //sort the queue without using any extra space/DS - Complexity will be O(n^2).
        int size = sites.size();

        // use nested loops to compare each element.
        for (int i = 0; i < size; i++) {
            int maxIndex = 0;
            SiteStats maxValue = sites.peek();

            // compare with each element in the queue. Find the minimum value and its position in the queue.
            for (int j = 0 ; j < size; j++) {
                if(!sites.isEmpty()) {
                    SiteStats currentValue = sites.remove();

                    if(maxValue != null && currentValue.getNumVisits() > maxValue.getNumVisits() && j < (size - i)) {
                        maxValue = currentValue;
                        maxIndex = j;
                    }
                    // add this again
                    sites.add(currentValue);
                }


            }
            // Iterate all entries of queue and remove the minimum value based on its position which is stored in minIndex
            for (int j = 0; j < size; j++) {
                if(!sites.isEmpty()) {
                    SiteStats currValue = sites.remove();
                    if (j != maxIndex) {
                        sites.add(currValue);
                    }
                }

            }
            // Add min value to the end of the queue
            // In next iteration we will not touch this value.
            sites.add(maxValue);
        }


        int topNIterations = 0;
        for (SiteStats sortedSites : sites) {
            int count = sortedSites.getNumVisits();
            if(n > 0) {
                System.out.println(sortedSites.getUrl());
                n--;
            }
        }
    }

    // Method to find the website in the queue and increment the visited count by 1, adding new node in case website is not found
    public static void updateCount(String url) {
        // WRITE CODE HERE
        boolean found = false;
        for (SiteStats sitesL : sites) {
            if(sitesL.getUrl().equals(url)) {
                sitesL.setNumVisits(sitesL.getNumVisits() + 1);
                found = true;
                break;
            }
        }

        if(!found) {
            SiteStats newMode = new SiteStats(url, 1);
            sites.add(newMode);
        }

    }

    public static void main(String[] args) {
        String[] visitedSites = { "www.google.co.in", "www.google.co.in", "www.facebook.com", "www.upgrad.com", "www.google.co.in", "www.youtube.com",
                "www.facebook.com", "www.upgrad.com", "www.facebook.com", "www.google.co.in", "www.microsoft.com", "www.9gag.com", "www.netflix.com",
                "www.netflix.com", "www.9gag.com", "www.microsoft.com", "www.amazon.com", "www.amazon.com", "www.uber.com", "www.amazon.com",
                "www.microsoft.com", "www.upgrad.com" };

        for (String url : visitedSites) {
            updateCount(url);
        }
        listTopVisitedSites(sites, 5);

    }

}
