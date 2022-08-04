/*
Program too create Movie Theater Management to store and display movie details.
by gunjan varshney
*/

// importing scanner utility to get input from user
import java.util.Scanner;

//main class
public class theater{
	
public static void main(String args[]){
	
	//creating scanner object named scan
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Movie name : ");
	String movieName = scan.nextLine();
	System.out.println("Enter start time :");
	int startTime = scan.nextInt();
	System.out.println("Enter end time : ");
	int endTime = scan.nextInt();
	System.out.println("Enter price : ");
	int price = scan.nextInt();
	
	//creating an object named show of class movie
	movie show = new movie();
	System.out.println("Choose the operation from following option :");
	System.out.println("to add details enter   : add \n to print details enter : print");
	String choice = scan.next();
	
	//using switch to perform user seleted operation
	switch(choice){
		//callng addDetail method of movie class using show object
		case "add": show.addDetail(movieName,startTime,endTime,price);
					break;
		
		//callng printDetail method of movie class using show object			
		case "print": show.printDetail(movieName,startTime,endTime,price);
					break;
		
		default : System.out.println("Invalid Selection!");
	}
	scan.close();
}
}

class movie{
	//creating instance variable
	String Name;
	int Start,End,Price;
	
	//creating method addDetail to store information of movie
	public void addDetail(String name,int start,int end,int price){
		Name= name;
		Start = start;
		End = end;
		Price = price;	
		System.out.println("Movie details successfully added.");
	}
	
	//Creating method printDetail to display information of movie
	public void printDetail(String movieName,int startTime,int endTime,int price){
		System.out.println("  TICKET  ");
		System.out.println("MOVIE  NAME  : "+movieName);
		System.out.println("Screen Time  : "+startTime+" - "+endTime+" ");
		System.out.println("TICKET PRICE : Rs."+price+" ");
	}
}