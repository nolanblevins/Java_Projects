/*
 * Nolan Blevins
 * CSCE 146 HW #5 Shape Tree
 * March 31 2022
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.*;
public class ShapeTreeFE 
{
	public static LinkedBST<Shape> shapeTree = new LinkedBST<Shape>();
	public static Shape shapeArea = new Shape();
	public static final String RECTANGLE = "Rectangle";
	public static final String CIRCLE = "Circle";
	public static final String TRIANGLE = "Right Triangle";
	public static final String DELIM = "\t";

	

	public static void main(String[] args) 
	{
		Scanner kB = new Scanner(System.in);
		boolean running = true;
		System.out.println("Welcome to Nolan Blevins Shape Tree");
		while(running)
		{
		System.out.println("Your options for the tree are:" + "\n"
		+ "----------------" + "\n"
		+ "Add a Shape (1)" +"\n"
		+ "Remove a Shape (2)" + "\n"
		+ "Search for a Shape (3)" + "\n"
		+ "Find the Shape with the Max Area (4)" +"\n"
		+ "Remove Shapes with an Area greater than your choice (5)" + "\n"
		+ "Reading a Shape File (6)" + "\n"
		+ "Writing to a Shape File (7)" + "\n"
		+ "Print the Shape Tree (8)" + "\n"
		+ "Quit (0)" + "\n"
		+ "----------------" + "\n");
		int choice = kB.nextInt();
		kB.nextLine();
		switch(choice)
		{
		// add shape
		case 1:
			System.out.println("What type of shape would you like to add?");
			System.out.println("The options are: " + "\n"
			+ "Circle (1)" + "\n"
			+ "Rectangle (2)" + "\n"
			+ "Right Triangle (3)");
			int addChoice = kB.nextInt();
			kB.nextLine();
			switch(addChoice)
			{
			// add circle
			case 1:
				System.out.println("Enter the radius of the circle you'd like to add: ");
				int circleRadius = kB.nextInt();
				kB.nextLine();
				double circleArea = shapeArea.cirlceArea(circleRadius);
				Shape circle = new Shape(CIRCLE, circleArea);
				if(shapeTree.search(circle) == true)
				{
					System.out.println("duplicate shape, not adding to tree");
					break;
				}
				shapeTree.add(circle);
				System.out.println("Circle added to tree");
				break;
			// add rectangle
			case 2:
				System.out.println("Enter the length of the Rectangle you'd like to add: ");
				int rectLength = kB.nextInt();
				kB.nextLine();
				System.out.println("Enter the Width of the Rectangle you'd like to add: ");
				int rectWidth = kB.nextInt();
				kB.nextLine();
				double rectArea = shapeArea.rectangleArea(rectLength, rectWidth);
				Shape rectangle = new Shape(RECTANGLE, rectArea);
				if(shapeTree.search(rectangle) == true)
				{
					System.out.println("duplicate shape, not adding to tree");
					break;
				}
				shapeTree.add(rectangle);
				System.out.println("Rectangle added to tree");
				break;
			// add right Triangle
			case 3:
				System.out.println("Enter the base of the Right Triangle you'd like to add: ");
				int triBase = kB.nextInt();
				kB.nextLine();
				System.out.println("Enter the height of the Right Triangle you'd like to add: ");
				int triHeight = kB.nextInt();
				kB.nextLine();
				double triArea = shapeArea.triangleArea(triBase, triHeight);
				Shape rightTriangle = new Shape(TRIANGLE, triArea);
				if(shapeTree.search(rightTriangle) == true)
				{
					System.out.println("duplicate shape, not adding to tree");
					break;
				}
				shapeTree.add(rightTriangle);
				System.out.println("Right Triangle added to tree");
				break;
				}
			break;
			
		// remove shape
		case 2:
			System.out.println("What type of shape would you like to remove?");
			System.out.println("The options are: " + "\n"
			+ "Circle (1)" + "\n"
			+ "Rectangle (2)" + "\n"
			+ "Right Triangle (3)");
			int remChoice = kB.nextInt();
			kB.nextLine();
			switch(remChoice)
			{
			//remove circle
			case 1:
				System.out.println("Enter the radius of the circle you'd like to remove: ");
				int circleRadius = kB.nextInt();
				kB.nextLine();
				double circleArea = shapeArea.cirlceArea(circleRadius);
				Shape circle = new Shape(CIRCLE, circleArea);
				shapeTree.remove(circle);
				System.out.println("Circle removed from tree");
				break;
			//remove rectangle
			case 2:
				System.out.println("Enter the length of the Rectangle you'd like to remove: ");
				int rectLength = kB.nextInt();
				kB.nextLine();
				System.out.println("Enter the Width of the Rectangle you'd like to remove: ");
				int rectWidth = kB.nextInt();
				kB.nextLine();
				double rectArea = shapeArea.rectangleArea(rectLength, rectWidth);
				Shape rectangle = new Shape(RECTANGLE, rectArea);
				shapeTree.remove(rectangle);
				System.out.println("Rectangle removed from tree");
				break;
			//remove right triangle
			case 3:
				System.out.println("Enter the base of the Right Triangle you'd like to remove: ");
				int triBase = kB.nextInt();
				kB.nextLine();
				System.out.println("Enter the height of the Right Triangle you'd like to remove: ");
				int triHeight = kB.nextInt();
				kB.nextLine();
				double triArea = shapeArea.triangleArea(triBase, triHeight);
				Shape rightTriangle = new Shape(TRIANGLE, triArea);
				shapeTree.remove(rightTriangle);
				System.out.println("Right Triangle removed from tree");
				break;
			}
			break;
			
		// search for shape
		case 3:
			System.out.println("What type of shape would you like to search for?");
			System.out.println("The options are: " + "\n"
			+ "Circle (1)" + "\n"
			+ "Rectangle (2)" + "\n"
			+ "Right Triangle (3)");
			int searchChoice = kB.nextInt();
			kB.nextLine();
			switch(searchChoice)
			{
			// search for circle
			case 1:
				System.out.println("Enter the radius of the circle you'd like to search for: ");
				int circleRadius = kB.nextInt();
				kB.nextLine();
				double circleArea = shapeArea.cirlceArea(circleRadius);
				Shape circle = new Shape(CIRCLE, circleArea);
				boolean searchForCircle = shapeTree.search(circle);
				if(searchForCircle == true)
				{
					System.out.println("Circle found in Shape Tree");
				}
				else 
				{
					System.out.println("Circle not found in Shape Tree");
				}
				break;
			// search for rectangle
			case 2: 
				System.out.println("Enter the length of the Rectangle you'd like to search for: ");
				int rectLength = kB.nextInt();
				kB.nextLine();
				System.out.println("Enter the Width of the Rectangle you'd like to search for: ");
				int rectWidth = kB.nextInt();
				kB.nextLine();
				double rectArea = shapeArea.rectangleArea(rectLength, rectWidth);
				Shape rectangle = new Shape(RECTANGLE, rectArea);
				boolean searchForRectangle = shapeTree.search(rectangle);
				if(searchForRectangle == true)
				{
					System.out.println("Rectangle found in Shape Tree");
				}
				else 
				{
					System.out.println("Rectangle not found in Shape Tree");
				}
				break;
			// search for right triangle
			case 3:
				System.out.println("Enter the base of the Right Triangle you'd like to search for: ");
				int triBase = kB.nextInt();
				kB.nextLine();
				System.out.println("Enter the height of the Right Triangle you'd like to search for: ");
				int triHeight = kB.nextInt();
				kB.nextLine();
				double triArea = shapeArea.triangleArea(triBase, triHeight);
				Shape rightTriangle = new Shape(TRIANGLE, triArea);
				boolean searchForTri = shapeTree.search(rightTriangle);
				if(searchForTri == true)
				{
					System.out.println("Right Triangle found in Shape Tree");
				}
				else 
				{
					System.out.println("Right Triangle not found in Shape Tree");
				}
				break;
			}
			break;
		// find max
		case 4:
			Shape maxShape = shapeTree.findMax();
			System.out.println("Max Value in Shape Tree: ");
			System.out.println(maxShape);
			break;
			
		// remove shapes greater than
		case 5:
			/*
			System.out.println("Enter the area that you would like to remove all shapes with a greater area");
			double greaterThan = kB.nextDouble();
			Shape greater = new Shape (CIRCLE, greaterThan);
			shapeTree.removeGreater(greater);
			*/
			break;
			
		// read shape tree file
		case 6:
			System.out.println("Enter a shape file: ");
			String shapeFile = kB.nextLine();
			try
			{
				Scanner fileScanner = new Scanner (new File(shapeFile));
				
				while(fileScanner.hasNextLine())
				{
					String fileLine = fileScanner.nextLine();
					String [] splitLines = fileLine.split(DELIM);
					
					
					//circle
					if(splitLines.length == 2)
					{
						String circleName = splitLines[0];
						int circleRadius = Integer.parseInt(splitLines[1]);
						double circleArea = shapeArea.cirlceArea(circleRadius);
						Shape circle = new Shape(CIRCLE, circleArea);
						shapeTree.add(circle);
					}
					if(splitLines.length == 3)
					{
						String shapeName = splitLines[0];
						int baseOrLength = Integer.parseInt(splitLines[1]);
						int heightOrWidth = Integer.parseInt(splitLines[2]);
						if(shapeName.equalsIgnoreCase(RECTANGLE))
						{
							double rectArea = shapeArea.rectangleArea(baseOrLength, heightOrWidth);
							Shape rectangle = new Shape(RECTANGLE, rectArea);
							shapeTree.add(rectangle); 
						}
						if(shapeName.equalsIgnoreCase(TRIANGLE))
						{
							double triArea = shapeArea.triangleArea(baseOrLength, heightOrWidth);
							Shape rightTriangle = new Shape(TRIANGLE, triArea);
							shapeTree.add(rightTriangle);
						}
					}
				}
				System.out.println("Shapes added to tree");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
		// Write to Shape file
		case 7:
			
			/*
			 * try
			{
				
				PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aName));
				while(shapeTree.returnBST())
				{
					VideoGame aVG = SearchVg.getCurrent();
					fileWriter.println(aVG.getName() +DELIM+ aVG.getConsole());
					SearchVg.goToNext();
				}
				fileWriter.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			*/
				
			break;
		// print BST
		case 8:
			System.out.println("What type of order would you print?");
			System.out.println("The options are: " + "\n"
			+ "pre-order (1)" + "\n"
			+ "in-order (2)" + "\n"
			+ "post-order (3)");
			int printType = kB.nextInt();
			kB.nextLine();
			// preorder
			if(printType == 1)
			{
				shapeTree.printPreorder();
			}
			// inorder
			if(printType == 2)
			{
				shapeTree.printInorder();
			}
			// postorder
			if(printType == 3)
			{
				shapeTree.printPostorder();
			}
			break;
			
		// quit
		case 0:
			System.out.println("Thank you for using Nolan Blevins Shape Tree");
			running = false;
			break;
		}
		}
	}

}
