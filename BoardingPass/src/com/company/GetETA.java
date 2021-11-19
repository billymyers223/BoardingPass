package com.company;

import java.util.Random;

public class GetETA {

    //I guess for the ETA we could just do a random number with a range of the departure time and like a 5 hour max
    //Since theres not really any criteria for it
    //So the range would be this HHMM like if the user were to type in 10:30

    public String getArrivalTime(String Departure){

        Random rTime = new Random();
        int randomTime = rTime.nextInt(5) + 1, newETA = 0;
        String[] timeSplit = Departure.split(":", 0);
        newETA = Integer.valueOf(timeSplit[0]) + randomTime;
        if(newETA > 23){
            newETA = newETA - 24;
        }
        timeSplit[0] = String.valueOf(newETA);

        String timeMeld = timeSplit[0] + ":" + timeSplit[1];

        System.out.println(timeMeld);

        return timeMeld;

    }


}
