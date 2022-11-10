package com.Hotel_Reservation.java;

public class Hotel {
	  public String hotelName;
	    public int weekdayRateForRegular;
	    public int weekendRateForRegular;
	    public int weekdayRateForRewarder;
	    public int weekendRateForRewarder;
	    public int hotelRatings;

	    public Hotel(String hotelName, int weekdayRateForRegular, int weekendRateForRegular, int weekdayRateForRewarder, int weekendRateForRewarder, int hotelRatings) {
	        this.hotelName = hotelName;
	        this.weekdayRateForRegular = weekdayRateForRegular;
	        this.weekendRateForRegular = weekendRateForRegular;
	        this.weekdayRateForRewarder = weekdayRateForRewarder;
	        this.weekendRateForRewarder= weekendRateForRewarder;
	        this.hotelRatings = hotelRatings;
	    }

	    public void setHotelName(String hotelName) {
	        this.hotelName = hotelName;
	    }

	    public String getHotelName() {
	        return hotelName;
	    }

	    public int getWeekdayRateForRegularCustomer() {
	        return weekdayRateForRegular;
	    }

	    public void setWeekdayRateForRegularCustomer(int weekdayRate) {
	        this.weekdayRateForRegular = weekdayRate;
	    }

	    public int getWeekendRateForRegularCustomer() {
	        return weekendRateForRegular;
	    }

	    public void setWeekendRateForRegularCustomer(int weekendRate) {
	        this.weekendRateForRegular = weekendRate;
	    }


	    public int getWeekdayRateForRewarder() {
	        return weekdayRateForRewarder;
	    }

	    public void setWeekdayRateForRewarder(int weekdayRateForRewarder) {
	        this.weekdayRateForRewarder = weekdayRateForRewarder;
	    }

	    public int getWeekendRateForRewarder() {
	        return weekendRateForRewarder;
	    }

	    public void setWeekendRateForRewarder(int weekendRateForRewarder) {
	        this.weekendRateForRewarder = weekendRateForRewarder;
	    }

	    public int getHotelRatings() {
	        return hotelRatings;
	    }

	    public void setHotelRatings(int hotelRatings) {
	        this.hotelRatings = hotelRatings;
	    }

	    @Override
	    public String toString() {
	        return "\n" + "Hotel{" +
	                "HotelName='" + hotelName + '\'' +
	                ", WeekdayRateForRegular=" + weekdayRateForRegular + '\'' +
	                ",WeekendRateForRewarder+" + weekendRateForRegular +
	                ", WeekdayRateForRegular=" + weekdayRateForRewarder + '\'' +
	                ",WeekendRateForRewarder+" + weekendRateForRewarder +
	                ",hotelRatings+" + hotelRatings +
	                '}';
	    }
}
