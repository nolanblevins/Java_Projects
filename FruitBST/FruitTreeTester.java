/*
 * Nolan Blevins
 * March 30 2022
 * CSCE 146 Fruit Tree Lab 06
 */
import java.util.*;
import java.io.*;
public class FruitTreeTester 
{
	public static final String DELIM = "\t";
	public static LinkedBST<Fruit> FruitTree = new LinkedBST<Fruit>();
	// default file ./src/fruitFile.txt
	public static void main(String[] args) 
	{
		Scanner kB = new Scanner(System.in);
		System.out.println("Welocme to the fruit tree!");
		System.out.println("Please Enter a Fruit File: ");
		String FruitFile = kB.nextLine();
		readFruitFile(FruitFile);
		System.out.println("---------" +"\n"+ "Fruit Tree has been populated" + "\n" + "---------"+ "\n");
		System.out.println("---------" +"\n"+ "Printing the in-order traversal" + "\n"+ "---------"+ "\n");
		FruitTree.printInorder();
		System.out.println("---------" +"\n"+ "Printing the pre-order traversal" + "\n"+ "---------"+ "\n");
		FruitTree.printPreorder();
		System.out.println("---------" +"\n"+ "Printing the Post-order traversal" + "\n"+ "---------"+ "\n");
		FruitTree.printPostorder();
		System.out.println("---------" +"\n"+ "Deleting Apple 0.4859853412170728" + "\n"+ "---------"+ "\n");
		Fruit remFruit = new Fruit("Apple",0.4859853412170728);
		FruitTree.remove(remFruit);
		System.out.println("---------" +"\n"+ "Printing the in-order traversal" + "\n"+ "---------"+ "\n");
		FruitTree.printInorder();

		
		
		
		
		
	}
	public static void readFruitFile(String aName)
	{

		try
		{
			Scanner fileScanner = new Scanner (new File(aName));
			
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String [] splitLines = fileLine.split(DELIM);
				if(splitLines.length == 2)
				{
					String type = splitLines[0];
					double weight = Double.parseDouble(splitLines[1]);
					Fruit aFruit = new Fruit(type,weight);
					FruitTree.add(aFruit);
					
					
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
