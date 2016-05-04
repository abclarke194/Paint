import java.util.Scanner;

public class PaintSystem {

	public static void main(String[] args) 
	{		
		//Room Area
		String answer;
		answer = "N";
		
		double roomArea;
		double windowArea;
		double doorArea;
		double floorPaint = 0;
		double ceilingPaint = 0;
		
		do
	{
				
		Scanner s1 = new Scanner (System.in);
		double length;
		double width;
		double height;
		
		System.out.println("Enter the length of your room in metres");
		length = s1.nextDouble();
		
		System.out.println("Enter the width of your room in metres");
		width = s1.nextDouble();
		
		System.out.println("Enter the height of your room in metres");
		height = s1.nextDouble();
		
		roomArea = (length * width * height);
		
		System.out.println("The area of your room is:" + " " + roomArea);
		
		System.out.println(" ");
		
		System.out.println("Are your measurements correct? Enter Y or N");
			
		Scanner yn = new Scanner (System.in);
		answer = yn.next();
		
		while (!answer.toUpperCase().equals("Y") && !answer.toUpperCase().equals("N")) 
		{
			System.out.println("Please enter Y or N"); 
			
			Scanner yn1 = new Scanner (System.in);
			answer = yn1.next();
		}
		
				
	}	 while (answer.toUpperCase().equals("N"));
		
		
		//Ceiling
		String ceilingAnswer;
		ceilingAnswer = "N";
		
		Scanner ceil2 = new Scanner(System.in);
		double lengthCeiling;
		double widthCeiling;		
		
		System.out.println("Do you want to paint the ceiling? Enter Y or N");
	
		Scanner ceil = new Scanner (System.in);
		ceilingAnswer = ceil.next();
		
						
		while (!ceilingAnswer.toUpperCase().equals("Y") && !ceilingAnswer.toUpperCase().equals("N"))
		{ 		
			System.out.println("Please enter Y or N"); 
			
			Scanner ceil1 = new Scanner (System.in);
			ceilingAnswer = ceil1.next();				
		}
					
		
		if (ceilingAnswer.toUpperCase().equals("Y"))
		{			
			System.out.println("Enter the length of your ceiling in metres");
			lengthCeiling = ceil2.nextDouble();
			
			System.out.println("Enter the width of your ceiling in metres");
			widthCeiling = ceil2.nextDouble();	
			
			ceilingPaint = lengthCeiling * widthCeiling;
			
			System.out.println("The area of your ceiling is:" + " " + ceilingPaint);
		}
		
		System.out.println(" ");	
		
		
		//Floor
		String floorAnswer;
		floorAnswer = "N";
		
		Scanner floor2 = new Scanner (System.in);
		double lengthFloor;
		double widthFloor;
		
		Scanner floor = new Scanner (System.in);
		
		System.out.println("Do you want to paint the floor? Enter Y or N");
		floorAnswer = floor.next();
		
		
		while  (!floorAnswer.toUpperCase().equals("Y") && !floorAnswer.toUpperCase().equals("N"))
		{ 
			System.out.println("Please enter Y or N"); 
			
			Scanner floor1 = new Scanner (System.in);
			floorAnswer = floor1.next();
		}
		
				
		if (floorAnswer.toUpperCase().equals("Y"))
		{			
			System.out.println("Enter the length of your floor in metres");
			lengthFloor = floor2.nextDouble();
			
			System.out.println("Enter the width of your floor in metres");
			widthFloor = floor2.nextDouble();	
			
			floorPaint = lengthFloor * widthFloor;
			
			System.out.println("The area of your floor equals:" + " " + floorPaint);
		}
					
		System.out.println(" ");	
		
		
		//Windows
		String answerWindowNumber;
		answerWindowNumber = "Y";
		
		String answer2;
		answer2 = "Y";
				
		Scanner s2 = new Scanner (System.in);
		int windowNumber;
		double windowLength;
		double windowHeight;
		double sumWindow = 0;
		
		System.out.println("How many windows do you have?");
		windowNumber = s2.nextInt();
					
		System.out.println("Are they all the same size? Enter Y or N");
		
		Scanner ynWindow = new Scanner (System.in);
		answerWindowNumber = ynWindow.next();	
		
		
		while (!answerWindowNumber.toUpperCase().equals("Y") && !answerWindowNumber.toUpperCase().equals("N")) 
		{ 
			System.out.println("Please enter Y or N"); 
			
			Scanner yn12 = new Scanner (System.in);
			answerWindowNumber = yn12.next();
		}
		
		
		
		if (answerWindowNumber.toUpperCase().equals("Y"))
		{
			System.out.println("Enter the length of one window in metres");
			windowLength = s2.nextDouble();
				
			System.out.println("Enter the height of one window in metres");
			windowHeight = s2.nextDouble();
		
			double windowDimension = (windowLength * windowHeight);
			
			windowArea = (windowDimension * windowNumber);
			System.out.println("The area of your window(s) is" + " " + (windowDimension * windowNumber));
			
			System.out.println(" ");
		}
		
		else {
		
		do
	{
		System.out.println("Enter the length of your window in metres");
		windowLength = s2.nextDouble();
			
		System.out.println("Enter the height of your window in metres");
		windowHeight = s2.nextDouble();
	
		double windowDimension = (windowLength * windowHeight);
		
		sumWindow = sumWindow + windowDimension;
		
		System.out.println("Do you have more windows? Enter Y or N");
		
		Scanner yn2 = new Scanner (System.in);
		answer2 = yn2.next();
		
		while (!answer2.toUpperCase().equals("Y") && !answer2.toUpperCase().equals("N"))
		{ 
			System.out.println("Please enter Y or N"); 
			
			Scanner yn13 = new Scanner (System.in);
			answer2 = yn13.next();
		}
		
	}	while (answer2.toUpperCase().equals("Y"));
		
		windowArea = (sumWindow * windowNumber); 
		System.out.println("The area of your window(s) is:" + " " + (sumWindow * windowNumber));
		
		System.out.println(" ");
	}	
		
		
		
		//Doors
		String answerDoorNumber;
		answerDoorNumber = "Y";
		
		String answer3;
		answer3 = "Y";
				
		Scanner s3 = new Scanner (System.in);
		int doorNumber;
		double doorLength;
		double doorHeight;
		double sumDoor = 0;
		
		System.out.println("How many doors do you have?");
		doorNumber = s2.nextInt();
					
		System.out.println("Are they all the same size? Enter Y or N");
		
		Scanner ynDoor = new Scanner (System.in);
		answerDoorNumber = ynDoor.next();
		
		
		while  (!answerDoorNumber.toUpperCase().equals("Y") && !answerDoorNumber.toUpperCase().equals("N"))
		{ 
			System.out.println("Please enter Y or N"); 
			
			Scanner yn14 = new Scanner (System.in);
			answerDoorNumber = yn14.next();
		}
				
				
		if (answerDoorNumber.toUpperCase().equals("Y"))
		{
			System.out.println("Enter the length of your door in metres");
			doorLength = s3.nextDouble();
				
			System.out.println("Enter the height of your door in metres");
			doorHeight = s3.nextDouble();
		
			double doorDimension = (doorLength * doorHeight);
			
			doorArea = (doorDimension * doorNumber);
			System.out.println("The area of your door(s) is" + " " + (doorDimension * doorNumber));
			
			System.out.println(" ");
		}
		
		else {
		
		do
	{
		System.out.println("Enter the length of your door in metres");
		doorLength = s3.nextDouble();
			
		System.out.println("Enter the height of your door in metres");
		doorHeight = s3.nextDouble();
	
		double doorDimension = (doorLength * doorHeight);
		
		sumDoor = sumDoor + doorDimension;
		
		System.out.println("Do you have more doors? Enter Y or N");
		
		Scanner yn3 = new Scanner (System.in);
		answer3 = yn3.next();
		
		
		while (!answer3.toUpperCase().equals("Y") && !answer3.toUpperCase().equals("N"))
		{ 
			System.out.println("Please enter Y or N"); 
			
			Scanner yn15 = new Scanner (System.in);
			answer3 = yn15.next();
		}
		
		
		
	}	while (answer3.toUpperCase().equals("Y"));
		
		doorArea = (sumDoor * doorNumber);
		System.out.println("The area of your door(s) is:" + " " + (sumDoor * doorNumber));
		
		System.out.println(" ");
		
	}	
		
		
		double paintArea = (roomArea + floorPaint + ceilingPaint - (windowArea + doorArea));
		
		System.out.println("The area of your room that requires paint is:" + " " + paintArea);		
		System.out.println(" ");
					
			
		
		int maxCover = 11;
		int maxTin = 20;
		double maxPrice = 19.99;
		int maxCoverage = (maxCover * maxTin);
		double maxCan = Math.ceil(paintArea / maxCoverage);
		double maxTotal = (maxPrice * maxCan);
		
		int joeCover = 14;
		int joeTin = 15;
		double joePrice = 19.99;
		int joeCoverage = (joeCover * joeTin);
		double joeCan = Math.ceil(paintArea / joeCoverage);
		double joeTotal = (joePrice * joeCan);
		
		int duluxCover = 17;
		int duluxTin = 10;
		double duluxPrice = 19.99;
		int duluxCoverage = (duluxCover * duluxTin);
		double duluxCan = Math.ceil(paintArea / duluxCoverage);
		double duluxTotal = (duluxPrice * duluxCan);
		
		
		System.out.println("Quantity of CheapoMax cans required" + " " + "=" + " " + maxCan);
		System.out.println(" ");
		System.out.println("Cost of CheapoMax" + " " + "=" + " " + maxTotal);
		System.out.println(" ");
		System.out.println("Quantity of AverageJoes cans required" + " " + "=" + " " + joeCan);
		System.out.println(" ");
		System.out.println("Cost of AverageJoes" + " " + "=" + " " + joeTotal);
		System.out.println(" ");
		System.out.println("Quantity of DuluxorousPaints cans required" + " " + "=" + " " + duluxCan);
		System.out.println(" ");
		System.out.println("Cost of DuluxorousPaints" + " " + "=" + " " + duluxTotal);
		
	}

}
