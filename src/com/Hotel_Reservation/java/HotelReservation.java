package com.Hotel_Reservation.java;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	List<Hotel> hotelDetails = new ArrayList<>();
    public void addHotelDetails(String hotelName, int weekdayRateForRegular, int weekendRateForRegular, int weekdayRateForRewarder, int weekendRateForRewarder) {
        Hotel hotel= new Hotel(hotelName, weekdayRateForRegular, weekendRateForRegular, weekdayRateForRewarder, weekendRateForRewarder);
        hotelDetails.add(hotel);
    }
    public void getHotelDetails(){
        System.out.println(hotelDetails);
    }
    public boolean checkHotelDetails(Hotel hotel) {
        return hotelDetails.add(hotel);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotelDetails("Lakewood", 110, 80, 90, 80);
        hotelReservation.addHotelDetails("Bridgewood", 160, 110, 60, 50);
        hotelReservation.addHotelDetails("Ridgewood", 220, 110, 150, 40);

        hotelReservation.getHotelDetails();
    }
}
