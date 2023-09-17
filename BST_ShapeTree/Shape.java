
/*
 * Nolan Blevins
 * CSCE 146 HW #5 Shape Tree
 * March 31 2022
 */
import java.lang.Math.*;

public class Shape implements Comparable<Shape> {
	private String type;
	private double area;

	public Shape() {
		this.type = "Rectangle";
		this.area = 25;
	}

	public Shape(String aT, double aA) {
		this.setType(aT);
		this.setArea(aA);
	}

	public String getType() {
		return this.type;
	}

	public double getArea() {
		return this.area;
	}

	public void setType(String aT) {
		if (aT != null && aT.equalsIgnoreCase("Circle") || aT.equalsIgnoreCase("Rectangle")
				|| aT.equalsIgnoreCase("Right Triangle")) {
			this.type = aT;
		} else {
			this.type = "Circle";
		}
	}

	public void setArea(double aA) {
		if (aA > 0.0) {
			this.area = aA;
		} else {
			this.area = 10;
		}
	}

	// calc rect area
	public double rectangleArea(double length, double width) {
		double area = length * width;
		return area;

	}

	// calc circle area
	public double cirlceArea(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}

	// calc tri area
	public double triangleArea(double base, double height) {
		double area = (base / 2) * height;
		return area;
	}

	public String toString() {
		return "Type: " + this.type + " Area: " + this.area;
	}

	/*
	 * Compares based on area
	 * if area is the same compares type
	 * 
	 */
	public int compareTo(Shape aS) {
		if (this.area > aS.area)
			return 1;
		if (this.area < aS.area)
			return -1;
		if (this.area == aS.area)
			if (this.type.compareTo(aS.type) > 0)
				return -1;
		if (this.type.compareTo(aS.type) < 0)
			return 1;
		if (this.type.compareTo(aS.type) == 0)
			return 0;
		else
			return -1;
	}

}
