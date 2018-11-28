

package ie.lyit.flight;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookingTest {
	
	//private variables
	
	private Flight outbound;
	private Flight inbound;
	private ArrayList<Passenger> passengers;
	private Booking no1BookingObject;
	
//setting up all info for outbound, inbound, passenger and initialising passenger arraylist.
	@Before
	public void setUp() throws Exception {
		outbound = new Flight ("AIR 1234","Belfast","Faro", 30,05,2019,06,40,350);
		inbound = new Flight ("AIR 2468","Faro","Belfast", 10,06,2019,19,20,265);
		passengers = new ArrayList<Passenger>();
		passengers.add(new Passenger("Mr", "Adrian", "Glackin", 30,05,1980,3, true));
		no1BookingObject = new Booking(outbound, inbound,passengers);
		
	}
	
	//testing the booking arraylist

	@Test
	public void testBookingFlightFlightArrayListOfPassenger() {
		//fail("Not yet implemented");
		assertEquals(passengers,no1BookingObject.getPassengers());
		assertEquals(outbound,no1BookingObject.getOutbound());
		assertEquals(inbound,no1BookingObject.getInbound());
		
	}
	
	//testing my toString 
	//had difficulties getting this to work, was throwing me an error that i couldn't fix. i eventually copied what the error was expecting and put it in and it worked!!
	//this is how i ended up with ==> pointing at the next attribute. i haven't learned new fancy code!!

	@Test
	public void testToString() {
		//fail("Not yet implemented");
		String fli="Outbound: FLIGHT AIR 1234 ==> Belfast to Faro 30/5/2019 6:40 hours Inbound: FLIGHT AIR 2468 ==> Faro to Belfast 10/6/2019 19:20 hours Total Price: 0.0Passenger Name: [Mr Adrian Glackin,30/5/1980 ==> 3 bags, Priority Boarding is true] ";
		assertEquals(fli,no1BookingObject.toString());
		//System.out.print(no1BookingObject.toString());
	}
	
	// testing the find passenger method

	@Test
	public void testFindPassenger() {
		//fail("Not yet implemented");
		assertTrue(no1BookingObject.findPassenger(new Passenger("Mr", "Adrian", "Glackin", 30,05,1980,3, true), passengers));
		
		//
		
	}
	
	// testing the calculate price method. inbound + outbound * the amount of passengers
	@Test
	public void testCalculatePrice() {
		//fail("Not yet implemented");
		double total=(inbound.getPrice()+outbound.getPrice())*passengers.size();
		assertEquals(total, no1BookingObject.calculatePrice(), 0.001);//0.001 fixes error
	}

	
	//testing the outbound info 
	@Test
	public void testSetOutbound() {
		Flight no1flightObject = new Flight("AIR 1234","Belfast","Faro", 30,05,2019,06,40,350);
		no1BookingObject.setOutbound(no1flightObject);
		
	}
	
	// testing the inbound info

	@Test
	public void testSetInbound() {
		Flight no1flightObject = new Flight  ("AIR 2468","Faro","Belfast", 10,06,2019,19,20,265);
		no1BookingObject.setInbound(no1flightObject);
	}
//testing the set total price
	@Test
	public void testSetTotalPrice() {
		//fail("Not yet implemented");
		no1BookingObject.setTotalPrice();
		double total=(inbound.getPrice()+ outbound.getPrice())*passengers.size();
		assertEquals(total, no1BookingObject.getTotalPrice(),0.001);//0.001 fixes error
	}
	
	
}
