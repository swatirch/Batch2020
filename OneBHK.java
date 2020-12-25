package assignment_40_extendFlat;

//40. Create class OneBHK with instance variable roomArea , hallArea and price
//a. Create default and parameterized constructor;
//b. Method show(): to print OneBHK data member information;
//Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
//a. Create default and parameterized constructor;
//b. Method show(): to print all data member information;
//Write main function in another class(Say XYZ) and store three TwoBHK flat’s information  and print  information using show method. Also print total amount of all flats.


public class OneBHK {
	float roomArea, hallArea,price;
	static float tprice=0;
		
	public OneBHK(float roomArea, float hallArea, float price) {
		
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price=price;
	tprice += price;
	}

	public OneBHK() {

		this.roomArea = 00;
		this.hallArea = 00;
		this.price = 00;
	}
	public void show()
	{
		
		System.out.println("RommArea: "+roomArea);
		System.out.println("HallArea: "+hallArea);
		System.out.println("Price: "+price);
		
	}
	public static void main(String[] args) {
		

	}

}
