package com.company;

import java.util.Scanner;
public class BoardingPass {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //Gets and stores passenger details
        GetDetails details = new GetDetails();
        //Generates ticket price based off Age and Gender
        GetTicketPrice price = new GetTicketPrice();
        //Generates a random ID number, checks if number was previously used
        GetID passengerID = new GetID();
        //Gets estimated arrival time based on take off time.
        GetETA arrivalTime = new GetETA();
        //uses all previous details to create the ticket and write it to file.
        CreatePass boardingTicket = new CreatePass();

        //Creation of boarding pass by scanning fields
        System.out.println("Welcome to Pyramid Airlines please provide me with your name to get started!");
        details.setName(scan.nextLine());
        System.out.println(details.getName());
        System.out.println("Email:");
        details.setEmail(scan.nextLine());
        System.out.println("Phone number:");
        details.setPhNumber(scan.nextLine());
        System.out.println("Gender (M or F):");
        details.setGender(scan.nextLine());
        System.out.println("Age:");
        details.setAge(scan.nextInt());
        System.out.println("Date (MM-DD-YY):");
        details.setDate(scan.next());
        System.out.println("Origin city?");
        details.setOrigin(scan.next());
        System.out.println("Destination:");
        details.setDest(scan.next());
        System.out.println("Departure time (HH:MM):");
        details.setDeparture(scan.next());

        //gets the age and gender, sets the price
        details.setPrice(price.generatePrice(details.getAge(), details.getGender()));

        details.setId(passengerID.GetAnID());

        details.setArrival(arrivalTime.getArrivalTime(details.getDeparture()));

        //Creates the ticket based off all previous Details given by passenger
        //using the details, price, id, and ETA methods. Prints to system
        //and to file
        boardingTicket.MakePass(details.getId(), details.getDate(), details.getOrigin(), details.getDest(), details.getArrival(),
                details.getDeparture(), details.getName(), details.getEmail(), details.getPhNumber(), details.getGender(),
                details.getAge(), details.getPrice());
    }
}
