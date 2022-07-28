// to find the duplicate element 
//created by@ Gunjan varshney

import java.util.Scanner;
public class DuplicateElement 
{    
	public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in);//getting user input for length
         System.out.println("Entre the length of the array");
        int len = sc.nextInt();                                    
	int [] ar = new int[len];   
         int count =0; 
        System.out.println("enter array values");// getting element from user
          for(int i=0;i < ar.length; i++)
            {
              ar[i]=sc.nextInt();         
 		}
       
        System.out.println("Duplicate elements in given array");   //calculating duplicate element in array 
        for(int i = 0; i < ar.length; i++) 
	{  
            for(int j = i+1; j < ar.length; j++) 
		{  
                if(ar[i] == ar[j])  
                    ++count;  
       		} 
            
    	 } 
        System.out.println(count); //printing number of duplicate element
 
    }  
}