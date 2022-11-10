package com.Hotel_Reservation.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

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
	    public void getMinPriceHotel() {
	        Hotel cheapestHotel = hotelDetails.stream().min(Comparator.comparingInt(Hotel::getWeekdayRateForRegular)).orElseThrow();
	        System.out.println(cheapestHotel);
	    }

	    public void getCheapestHotel(){
	        int LakewoodRate = 110; int BridgewoodRate = 160; int Ridgewood = 220;
	        int cheapestHotel = (LakewoodRate>BridgewoodRate) ? (Math.max(LakewoodRate, Ridgewood)) : (LakewoodRate) ;
	        System.out.println("The cheapest Hotel Rate is " +cheapestHotel);
	    }

	    public void viewHotels() {
	        getMinPriceHotel();
	        getCheapestHotel();
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to Hotel Reservation Program");
	        HotelReservation hotelReservation = new HotelReservation();
	        hotelReservation.addHotelDetails("Lakewood", 110, 80, 90, 80);
	        hotelReservation.addHotelDetails("Bridgewood", 160, 110, 60, 50);
	        hotelReservation.addHotelDetails("Ridgewood", 220, 110, 150, 40);
	        hotelReservation.getHotelDetails();
	        System.out.println(".........................................................");
	        System.out.println("Cheapest hotel :");
	        hotelReservation.viewHotels();
	        hotelReservation.getCheapestHotel();
	    }
}
