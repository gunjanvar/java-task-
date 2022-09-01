import java.util.ArrayList;
import java.util.Scanner;


public class mobileStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No of Products : ");
		int no = scan.nextInt();
		
		//Creating Array List to store Product data/Product Object
		ArrayList <MobileModel> productList = new ArrayList<MobileModel>();
		
		//For loop to take input product data until all product object is not stored
		for(int i = 1;i<=no;i++) {
			System.out.println("Enter "+i+" Company Name : ");
			String company = scan.next();
			System.out.println("Enter "+i+" Type of Product(Laptop/Phone/TV) : ");
			String model = scan.next();
			System.out.println("Enter "+i+" Model Name : ");
			String name = scan.next();
			System.out.println("Enter "+i+" Electronic Id : ");
			int id = scan.nextInt();
			System.out.println("Enter "+i+" Product Price : ");
			int price = scan.nextInt();
			
			//Creating object of MobileModel to store electronic product data
			MobileModel product = new MobileModel(id,price,name,company,model);
			product.setePrice(price);
			productList.add(product);//Passing product object in the ArrayList to store data in list
		}
		
		// demonstration of filter method and forEach method
		// Sorting array list based on product price
		// to print all the Laptop products under 30000 from Array List
		System.out.println("\nPRODUCT LIST");
		productList.stream().filter(x->x.ePrice<=30000).filter(x->x.eModel.equals("laptop")||x.eModel.equals("Laptop")).sorted((x, y) -> x.getePrice()-y.getePrice())
		.forEach(x->System.out.println("\nProduct : "+x.eCompany+" "+x.eName+"\nRs : "+x.ePrice));
		
		//closing Scanner object
		scan.close();
	}

}

