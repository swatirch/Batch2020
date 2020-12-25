package assignment_40_extendFlat;

public class TwoBHK extends OneBHK {
	float room2Area;
	
	
	public TwoBHK(float roomArea, float hallArea, float price, float room2Area) {
		super(roomArea, hallArea, price);
		this.room2Area = room2Area;
	}


	public TwoBHK() {
		this.room2Area = 00;
	}
	public void show()
	{
		System.out.println("Details of ");
		
		System.out.println();
		System.out.println("RommArea: "+roomArea);
		System.out.println("HallArea: "+hallArea);
		System.out.println("Price: 	  "+price);
		System.out.println("RommArea: "+room2Area);
		System.out.println();
		System.out.println();
		System.out.println("Total Amount "+OneBHK.tprice);
		
		
	}


	@Override
	public String toString() {
		return "TwoBHK [room2Area=" + room2Area + ", roomArea=" + roomArea + ", hallArea=" + hallArea + ", price="
				+ price + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
