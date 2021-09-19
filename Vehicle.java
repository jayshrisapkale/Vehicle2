public class Vehicle {
	
	public int noOfSeats;
	public int noOfWheels;
       public void setBike(int noOfSeats, int noOfWheels) {
    	   this.noOfSeats= noOfSeats;
    	   this.noOfWheels= noOfWheels;
       }
   
    public void Bike() {
    	System.out.print("Bike "+" NoOfSeats "+ noOfSeats );
    	System.out.print(" NoOfWheels "+ noOfWheels);
    }
    public void Car() {
    	System.out.print("Car "+" NoOfSeats "+ noOfSeats );
    	System.out.print(" NoOfWheels "+ noOfWheels);
    }
     public static void main(String args[]) {
    	 Vehicle car = new Vehicle();
    	 Vehicle bike = new Vehicle();
    	 car.setBike(4, 4);
    	 bike.setBike(2, 2);
    	 bike.Bike();
    	 System.out.println();
    	 car.Car();
    	 
     }
	
}