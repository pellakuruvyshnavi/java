package day13;


import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedExceptions {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int distance = 0, avg = 0; float eta=0; 
         try {
            System.out.println("the distance to travel");
            distance = scan.nextInt();
            System.out.println("the averge speed");
            avg = scan.nextInt();
            eta = distance/avg;
            eta = (float)distance/avg;
            System.out.println("ETA : "+eta);
         }
         
         catch(ArithmeticException ae){
            try{

            
            System.out.println("Valid speed / Non zero");
            avg = scan.nextInt();
            eta = distance/avg;
            eta = (float)distance/avg;
            System.out.println("ETA: "+eta);
         }
         catch(InputMismatchException in ){
            Scanner newscan=new Scanner(System.in);
            System.out.println("speed Non zero number");
            avg = newscan.nextInt(); eta = distance/avg;
            eta =(float)distance/avg;
            System.out.println("ETA:"+eta);
         }
         catch(Exception e)
         {
            System.out.println("Uncaught handled here");
         }
         scan.close();
    }
    
}
}