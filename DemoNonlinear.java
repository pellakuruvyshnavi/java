package day3;

import java.util.Scanner;

public class DemoNonlinear {
    public static void main(String[] args) {
        
    
    int mbalance =20000,count=0;
    Scanner scanner =new Scanner(System.in);
    int required =0;
    while(mbalance>=500){
        System.out.println("Required amount: ");
        required = scanner.nextInt();
        if(required<=mbalance){
            if(required<=mbalance){
                if(required%500 = 0){
                    mbalance-=required;
                    System.out.println(required+"dispensed");
                    count++;

                }
                else 
                    System.out.println("Invalid denom");

            }
            else
                System.out.println("insufficient balance");

        }
    }
}
    

