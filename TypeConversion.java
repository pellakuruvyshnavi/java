package day3;

public class TypeConversion {
    public static void main(String[] args) {
       /*  String contactName = "Vyshnavi";
        System.out.println(contactName.toLowerCase());
        Object obj1 = contactName;//upcasting
     //since Object doesn't have upper case method
      //System.out.println(obj1.toupperCase());
      System.out.println(obj1);
      obj1 = 14.5;//upcasting
      System.out.println(obj1); 
      obj1 =14.5;//upcasting 
      System.out.println(obj1);
      Object obj2 = false;
      Boolean data = (Boolean )obj2;
      System.out.println(data);
      // type casting 
     long vyshu =88L; char assi ='\0';
      assi = (char)vyshu;//type casting long to char
     System.out.println(assi);
     short micro  =92; int fella=0;
     fella = micro;
     float seek = 0.0F;seek =micro;
     byte sigma = 0;sigma =(byte)micro;*/
     char vyshu = 'g', ram ='k';
     vyshu = (char)(vyshu^ram);
     ram = (char)(vyshu^ram);
     vyshu =(char)(vyshu^ram);
     System.out.println(vyshu+" "+ram);







    }
    
}
