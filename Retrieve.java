package day10;
import java.util.Arrays;
public class Retrieve{
        Loan[]hdfc=new Loan[5];
        public Retrieve(){
              hdfc[0]=new Loan(987654364869445L,41526542,19.5f);  
              hdfc[1]=new Loan(988254445L,5673000,12.4f);  
              hdfc[2]=new Loan(988546227155L,526888,15.4f);  
              hdfc[3]=new Loan(875461369445L,1200000,11.2f);  
              hdfc[4]=new Loan(45632178965445L,3452004551,8.7f); 
}
public void read(float user){
       System.out.println(user+"roi matches records");
      Arrays.stream(hdfc).filter(each->each.getRoi()>=user).forEach(obj->
System.out.println(obj));
}
public void read(long number){
      System.out.println(number+"loan records");
      Arrays.stream(hdfc).filter(each->each.getLoanNo()==number).forEach(obj->System.out.println(obj));
}
public void read(int amount){
      System.out.println("loan records less than "+amount);
      Arrays.stream(hdfc).filter(each->each.getPrinciple()<=amount).forEach(obj->System.out.println(obj));
}
    public static void main(String[]arr){
    Retrieve ret = new Retrieve();
    ret.read(15.0f);
    ret .read(22635465L);
    ret.read(120000);
}
}



 
              
