import java.util.Scanner;

/**
   This program measures how long it takes to sort an
   array of a user-specified size with the selection
   sort algorithm.

   Good discussion on selection sort
   https://www.youtube.com/watch?v=cqh8nQwuKNE
*/
public class Main
{  
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int n = in.nextInt();

      // Construct random array
   
      int[] a = ArrayUtil.randomIntArray(n, 100);
      
      // Use stopwatch to time selection sort
      
      StopWatch timer = new StopWatch();
      
      timer.start();
      SelectionSorter.sort(a);
      timer.stop();
      
      System.out.println("Elapsed time: " 
            + timer.getElapsedTime() + " milliseconds");
   }
}

   
