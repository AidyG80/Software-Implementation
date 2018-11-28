package ie.lyit.flight;
import java.util.ArrayList;

public class Booking {
	private Flight outbound;
	private Flight inbound;
	private double totalPrice;
	private static int count = 0;
	
	//initialising the array for passengers
	private ArrayList<Passenger> passengers;
	
	
	
	//default constructor
	public Booking() {
		this.inbound = new Flight();
		this.outbound = new Flight();
		this.passengers = new ArrayList<Passenger>();
		this.totalPrice = 0;
		count = count++;
	}
	
	//constructor
	public Booking(Flight dept, Flight ariv, ArrayList<Passenger> p) {
	outbound = dept;
	inbound = ariv;
	totalPrice = 0;
	count++;
	passengers =p;
	}
	
	//overriding to string
	@Override
	public String toString() {
		return "Outbound: " + outbound + " " + "Inbound: " + inbound + " " + "Total Price: " +totalPrice + "Passenger Name: " + passengers + " ";
 	}
	
	//override
	@Override
	public boolean equals(Object obj) {
		Booking Object;
		if(obj instanceof Booking)
			Object = (Booking)obj;
		else
			return false;
		
		return this.outbound.equals(Object.outbound)&&
				this.inbound.equals(Object.inbound)&&
				this.passengers.equals(Object.passengers);
	}
	
	//find passenger
	public boolean findPassenger(Passenger psngr, ArrayList<Passenger>passengers) {
		return passengers.contains(psngr);
	}
	
	//calculate price
	public double calculatePrice() {
		return totalPrice = (inbound.getPrice()+outbound.getPrice())*passengers.size();
	}
	
	// getters & setters
	
	//outbound flight
	public void setOutbound(Flight obound) {
		this.outbound=obound;
	}
	
	public Flight getOutbound() {
		return outbound;
	}
	
	//inbound flight
	public void setInbound(Flight ibound) {
		this.inbound= ibound;
	}
	
	public Flight getInbound() {
		return inbound;
	}
	
	
	
	//set total price
	public void setTotalPrice ( ) {
		this.totalPrice = calculatePrice();
	}
	
	//get total price
	public double getTotalPrice() {
		return totalPrice;
	}
	
	//passenger 
	public ArrayList<Passenger>getPassengers(){
		return passengers;
	}
	
	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	

}
