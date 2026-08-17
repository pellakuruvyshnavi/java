public class Objective{
 public static void main(String[] args){
            String beta = null;
       try {
              System.out.println(beta.length());
  }
 catch(NullpointerException obj){
         obj.printStackTrace();//System.out.printl(obj);
        beta ="Razak";
       System.out.println(beta.length());
}
System.out.println("Length printed Successfully");
 }
}