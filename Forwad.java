package day13;

import java.util.Scanner;

public class Forwad {
    public static void read(){
        Scanner scan = new Scanner(System.in);
        int start =0,end=0;
        String text ="vyshnavi is a good girl";
        try{
            System.out.println("start ,end pos to extract");
            start =scan.nextInt();
            end= scan.nextInt();
            System.out.println(text.substring(start,end));
        } catch(StringIndexOutOfBoundsException sin ){
        System.out.println("Not handled in method");
        throw sin;
        }
        scan.close();
    }
    public static void main(String[] args) {
        try{
            read();
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e+" at main ");
            main(args);
        }
    }
    
}
