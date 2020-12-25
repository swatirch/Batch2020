package assignment_40_extendFlat;

import java.util.Scanner;

public class Xyz {

	public static void main(String[] args) {
		TwoBHK tt[] = new TwoBHK[3];
		
		Scanner s = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter 1--> RoomArea 2--> HallArea 3--> Price 4-->RoomArea2 ");
			float ra=s.nextFloat();
			float ha=s.nextFloat();
			float pr=s.nextFloat();
			float ra2=s.nextFloat();
	
			tt[i]= new TwoBHK(ra, ha, pr, ra2);
		}
		for(int i=0;i<3;i++)
		{
			tt[i].show();
		}
	s.close();
	}

}
