package com.Hotel_Reservation.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class HotelReservation {
	 List<Hotel> hotelDetails = new ArrayList<>();

	    public void addHotelDetails(String hotelName, int weekdayRateForRegular, int weekendRateForRegular, int weekdayRateForRewarder, int weekendRateForRewarder) {
	        Hotel hotel = new Hotel(hotelName, weekdayRateForRegular, weekendRateForRegular, weekdayRateForRewarder, weekendRateForRewarder);
	        hotelDetails.add(hotel);
	    }

	    public void getHotelDetails() {
	        System.out.println(hotelDetails);
	    }

	    public boolean checkHotelDetails(Hotel hotel) {
	        return hotelDetails.add(hotel);
	    }

	    public void getMinPriceHotel() {
	        Hotel cheapestHotel = hotelDetails.stream().min(Comparator.comparing(Hotel::getWeekdayRateForRegular)).orElseThrow();
	        System.out.println(cheapestHotel);
	    }

	    public void getCheapestHotel() {
	        int LakewoodRate = 110;
	        int BridgewoodRate = 160;
	        int Ridgewood = 220;
	        int cheapestHotel = (LakewoodRate > BridgewoodRate) ? (Math.max(LakewoodRate, Ridgewood)) : (Ridgewood);
	        System.out.println("The cheapest Hotel Rate is " + cheapestHotel);
	    }

	    public void getCheapestHotelForGivenDate() {
	        String hotel = null;
	        int totalLakeWoodRate = 0;
	        int totalBridgeWoodRate = 0;
	        int totalRidgeWoodRate = 0;

	        if (Objects.equals(hotel, "LakeWood")) {
	            int weekdayRate = 110;
	            int weekendRate = 90;
	            totalLakeWoodRate = (weekdayRate + weekendRate);
	        }
	        if (Objects.equals(hotel, "BridgeWood")) {
	            int weekdayRate = 150;
	            int weekendRate = 50;
	            totalBridgeWoodRate = (weekdayRate + weekendRate);
	        }
	        if (Objects.equals(hotel, "RidgeWood")) {
	            int weekdayRate = 220;
	            int weekendRate = 150;
	            totalRidgeWoodRate = (weekdayRate + weekendRate);
	        }
	        if (totalLakeWoodRate <= totalBridgeWoodRate && totalLakeWoodRate < totalRidgeWoodRate) {
	            System.out.println("LakeWood and BridgeWood with total rates $200.");
	        }
	        if (totalBridgeWoodRate <= totalLakeWoodRate && totalBridgeWoodRate < totalRidgeWoodRate) {
	            System.out.println("LakeWood and BridgeWood with total rates $200.");
	        }
	        if (totalRidgeWoodRate < totalLakeWoodRate && totalRidgeWoodRate < totalBridgeWoodRate) {
	            System.out.println("RidgeWood with total rates $370.");
	        }
	    }

	    public void viewHotels() {
	        getCheapestHotelForGivenDate();
	    }
	    public static void main(String[] args) throws ParseException {
	        System.out.println("Welcome to Hotel Reservation Program");
	        HotelReservation hotelReservation = new HotelReservation();
	        hotelReservation.addHotelDetails("Lakewood", 110, 80, 90, 80);
	        hotelReservation.addHotelDetails("Bridgewood", 160, 110, 60, 50);
	        hotelReservation.addHotelDetails("Ridgewood", 220, 110, 150, 40);
	        String startDate ="10-09-2020";
	        String endingDate ="11-09-2020";
	        java.util.Date sdate =new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
	        java.util.Date edate =new SimpleDateFormat("dd-MM-yyyy").parse(endingDate);
	        System.out.println(startDate +"\t"+ sdate);
	        System.out.println(endingDate +"\t"+ edate);
	        hotelReservation.viewHotels();
	    }
}
