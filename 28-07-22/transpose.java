// program for Transpose Matrix
//Created by @Gunjan varshney  
import java.util.Scanner;
public class transpose
{
public static void main(String args [])
{
int i,j;
System.out.println("enter no. of rows and columns");
 Scanner s = new Scanner(System.in); //getting user value
 int row = s.nextInt();
 int column = s.nextInt();
 int arr[][]= new int[row][column];
 System.out.println("Enter elements of matrix"); //geting elements of array
     for(i=0;i<row;i++)
      {
        for(j=0;j<column;j++)
          {
           arr[i][j]= s.nextInt(); 
          }
      }
System.out.println("orginal array"); //Printing Original Matrix
 for(i=0;i<row;i++)
      {
        for(j=0;j<column;j++)
          {
           System.out.print(arr[i][j]+" ") ; 
          }
       System.out.println(" ");
      }
System.out.println("The transpose matrix"); //Printing Transpose Matrix
    
     for (i=0;i<column;i++)
       {
         for(j=0;j<row;j++)
           {
           System.out.print(arr[j][i]+" ");           
           }
         System.out.println(" ");
       }
}
}