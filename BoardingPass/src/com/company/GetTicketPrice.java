package com.company;

public class GetTicketPrice {

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
