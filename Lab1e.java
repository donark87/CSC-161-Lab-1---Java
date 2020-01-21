// Donark Patel
// Lab 1e
// Finding area

public class Lab1e

{
	public static void main (String [] args)
	{
		// Variables
		int base;
		int height;
		int tallBase,ShortBase,tallHeight,shortHeight;
		int area1,area2, area3, area4;

		// assiments
		base=10;
		height=10;
		tallBase=5;
		shortHeight=5;

		// Calculation
		ShortBase=base-tallBase;
		tallHeight=height-shortHeight;

		area1=base*shortHeight + tallBase*tallHeight;  	//Horizontal Rectangle
		area2=tallBase*height + ShortBase*shortHeight;		//Vertical Rectangle
		area3= 3*tallBase*shortHeight;		//Three square
		area4=base*height-ShortBase*tallHeight;		// large/small Square

		// Output
		System.out.println("Donark patel");
		System.out.println("Lab1e");
		System.out.println("---------\n\n");

		System.out.println("Horizontal Rectangle =" + area1);
		System.out.println("Vertical Rectangle   =" + area2);
		System.out.println("Three square         =" + area3);
		System.out.println("Large/small Square   =" + area4);

		System.out.println("\n\n");
	}
}