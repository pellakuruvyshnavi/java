package day11;
import java.util.Arrays;
class Sale{
      int[] items={1200,999,8999,599,499,399,199,12999};
      public void discount(){
            System.out.println("5% discount");
           Arrays.steam(items).map(each->each-=each(each*0.050)).forEach(System.out.println);}
}
class BigBillionDay extends Sale{
         public void discount(){
            System.out.println("Flat 30 % discount");
            Arrays.steam(iteams).map(each->each-=(each*0.300)).forEach(system.out::println);
}
}
public class DemoRuntimePoly{
               public static void main(String[] arr){ 
          BigBillionDay big =new BigBillionDay();
         big.discount();
}
} 