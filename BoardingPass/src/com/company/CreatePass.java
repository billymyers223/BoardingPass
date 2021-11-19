package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CreatePass {

    public void MakePass(int IDNum, String Date, String Origin, String Destination, String ETA,
                           String departTime, String Name, String Email, String PhoneNum, String Gender, int Age, int Price){

        //The application should generate a boarding pass ticket using the boarding pass details.
        // The generated ticket should contain the following information:
        //•	Boarding Pass Number, Date, Origin, Destination, Estimated time of arrival (ETA), Departure Time
        //•	Name, Email, Phone Number, Gender, Age
        //•	Total Ticket Price

        File ticketFile = new File("C:\\GenSpark\\TeamProject\\GitFork\\BoardingPass\\BoardingPass\\src\\com\\Tickets.txt");

        String thePass = "ID #: " + IDNum + "  Name: " + Name + "  Gender: " + Gender + "  Age: " + Age + "  " + "Date: " + Date +
                "\n" + "Phone #: " + PhoneNum + "  Email: " + Email + "\n" + "Origin: " + Origin +
                "  Destination: " + Destination + "\n" +
                "Departure Time: " + departTime + "  Arrival Time: " + ETA + "  Price: " + Price;

        try{
            FileReader reader = new FileReader(ticketFile);
            int readSize = reader.read();
            Scanner findID = new Scanner(ticketFile);

            FileWriter fw = new FileWriter(ticketFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if(readSize > -1){
                bw.newLine();
                bw.newLine();
            }

            bw.write(thePass);
            bw.close();
            fw.close();

        } catch (Exception fileRead){
            System.out.println("Couldn't read the file");
        }

        System.out.println(thePass);
    }

}
