import java.util.Scanner;

/* 
 * Nolan Blevins
 * NBlevins@emai.sc.edu
 * November 2 2021
 * CSCE 145
 * Box Sorter
 */
public class BoxSorter {
	public static void main(String[] args) {
//		double Volume = 1;
		Box box = new Box();
		Scanner keyboard = new Scanner(System.in);
		boolean running = true;
		System.out.println("Welcome to Nolan Blevins Box Sorter \n");
		while(running) {
		System.out.println("Enter the num of boxes you would like to sort or -1 to quit the program.");
		int nOb = keyboard.nextInt();
		keyboard.nextLine();
		if(nOb >0) {
		Box Boxes[] = new Box [nOb];
		String LabelArr[]  = new String[nOb];
		double VolumeArr[] = new double [nOb];
		System.out.print("Enter the information about boxes and I'll sort them.\n");
		for(int i = 0; i < nOb; i++) {
			System.out.println("Enter the Label , Length , Width, and Height in feet of box " +i+ " and ill sort them");
			// input from user
			String label = keyboard.nextLine();
			double Length = keyboard.nextDouble();
			double Width = keyboard.nextDouble();
			double Height = keyboard.nextDouble();
			keyboard.nextLine();
			// using setters
			box.setLabel(label);
			box.setLength(Length);
			box.setWidth(Width);
			box.setHeight(Height);
			double Volume = box.getVolume();
			box.setVolume(Volume);
			// creating object
			Boxes[i] = new Box(label, Length, Width, Height, Volume);
			LabelArr[i] = label;
			VolumeArr[i] = Volume;
			System.out.println(Volume);
			}
			
			double tempVol;
			String tempLabel;
		
			for (int x = 0; x < VolumeArr.length; x++) // sorting alg that sets label arr equal to print together
			        {
			            for (int j = x + 1; j < VolumeArr.length; j++) 
			            {
			                if (VolumeArr[x] > VolumeArr[j]) 
			                {
			                	tempVol = VolumeArr [x];
			                	tempLabel = LabelArr[x];

			                    VolumeArr[x] = VolumeArr[j];
			                    LabelArr[x] = LabelArr[j];

			                    VolumeArr[j] = tempVol;
			                    LabelArr[j] = tempLabel;
			                }
			            }
			            System.out.println(LabelArr[x] +" "+ VolumeArr[x]);
			        }
		}
		else {
			if (nOb == -1) {
				running = false;
				System.out.println("thanks for using Nolan Blevins Box Sorter");
			}
		}
		}
}
}
			
			

	


			
			
		
		
		
			


