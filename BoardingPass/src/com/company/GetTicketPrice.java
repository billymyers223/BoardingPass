package com.company;

public class GetTicketPrice {
    //Generates the ticket price based on age and gender, standard price is $100 dollars people over 60 get 60% off, people under 12 get 50% off.
    //If the gender entered is female they get 25% off as well regardless of age and compounds with existing discounts.
    public int generatePrice(int age, String gender){
        int price = 100;
        if(age <= 12){
            price = (int) (price * 0.5);
        }
        else if(age >= 60){
            price = (int) (price * 0.4);
        }

        if(gender.equals("F")){
            price = (int) (price * 0.75);
        }

        return price;
    }

}
