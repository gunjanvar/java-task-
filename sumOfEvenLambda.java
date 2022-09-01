import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumOfEvenLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int cycle = 0;
		
		while(cycle<2) {
			
			System.out.println("\n1 - Print Sum of Even values \n2 - Exit \nEnter : ");
			cycle = scan .nextInt();
			if(cycle>1)
				System.exit(0);
			System.out.println("Enter No of Elements : ");
			int no = scan .nextInt();
		
			//Creating Array List to store elements
			ArrayList<Integer> number = new ArrayList<Integer>();
			for(int i = 1;i<=no;i++) {
			
			//Passing i in the ArrayList to store numbers in list
			number.add(i);
			}
			
			// demonstration of filter method and collect method
			// to collect and print all the even value from Array List
			List<Integer> evenList = number.stream().filter(x->x%2==0).collect(Collectors.toList());
			System.out.println("\nEven Values b/w  1-"+no+" : "+evenList);
			
			// demonstration of filter method and reduce method
			// to print sum of the even value from Array List
			int result = number.stream().filter(x->x%2==0).reduce(0,(y,x)-> y+x);
			System.out.println("\nSum of Even values : "+result);
			}
		// closing scanner object
		scan.close();
	}

}

