// Donark Patel
// Lab 1d
// Simple Program

public class Lab1d

{
	public static void main (String [] args)
	{
		// Variables
		float isoBase,isoHight,rightBase,rightHight;
		float blueHight,blueBase,redHight,redBase;
		float area1, area2, area3, area4;
		// assiments
		isoBase=2.5f;
		isoHight=3.6f;

		rightBase=5.5f;
		rightHight=7.5f;

		blueHight=5.0f;
		blueBase=6.25f;

		redHight=8.5f;
		redBase=9.25f;

		// Calculation
		area1=isoBase*isoHight/2;
		area2=rightBase*rightHight/2;

		area3=blueHight*blueBase;
		area4=redHight*redBase;

		// Output
		System.out.println ( "Iso Triangle Base = "+isoBase);
		System.out.println ( "Iso Triangle Height = "+isoHight);
		System.out.println ( "Aria Of Iso Triangle  = " +area1 + "\n\n");

		System.out.println ( "Right Angle Triangle Base = "+rightBase);
		System.out.println ( "Right Angle Triangle Height = "+rightHight);
		System.out.println ( "Aria of Right Angle Triangle = " +area2 + "\n\n");

		System.out.println ( "Blue Rectangle Base = "+blueHight);
		System.out.println ( "Blue Rectangle Height = "+blueBase);
		System.out.println ( "Aria of Blue Rectangle = " +area3 + "\n\n");

		System.out.println ( "Red Rectangle Base = "+redHight);
		System.out.println ( "Red Rectangle Height = "+redBase);
		System.out.println ( "Aria of Red Rectangle = " +area4 + "\n\n");

	}
}