package USpopulation;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class USpopulation
{
    public static void main(String [] args) throws IOException
    {
	     int[] populationarray = new int [101];
	
	     File popfile = new File("USPopulationTEST.txt");
	     try (Scanner inputFile = new Scanner(popfile)) 
	     {
		     int counter= 0;
		     while(inputFile.hasNext())
		     {
			
			     int tempval = inputFile.nextInt();
			     if (tempval != 0) {
			    	 populationarray[counter] = tempval;
			
			    counter++;
			     }
		     }
		
		    int num1;
		    int num2;
		    int[] difference= new int[101];
		
		    for(int N = 1; N < counter;N ++)
		{
		    num1 = populationarray[N-1];
		    num2 = populationarray[N];
		    difference[N-1] = (num2-num1);
		
		}
		
		    System.out.println("GrowthRate every 10 years: " + (sum(difference)/populationarray.length));
		    System.out.println(Maxyear(difference)+" is the year with the greatest increase");
		    System.out.println(Minyear(difference)+" is the year with the smallest increase");
	        }
	    }
	
	public static int sum(int[] array) {
	     int sum = 0;
	     for(int i = 0 ;i < array.length; i++) {
	     sum+= array[i];
	     }
	     return sum;
	
	    }
	
		public static int Maxyear (int[] array) {
	     int maxyear = 1960;
	     int currentMax = array[0];
	     for(int i = 1;i < array.length; i++) {
	     if (currentMax < array[i]) {
	     currentMax = array[i];
	     maxyear = 1960;
	     }
	     }
	     return maxyear;
	    }
	    public static int Minyear(int[] array) {
	     int minyear = 0;
	     int currentMin = array[0];
	     for(int i = 1;i < array.length; i++) {
	     if (currentMin > array[i]) {
	     currentMin = array[i];
	     minyear = 1960; 
	     }
	     }
	     return minyear;
	    }
}