package day14;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
public class HandsOnImmutableList {
    public static void main(String[]args){
List list1 = Stream.of(6.7,"FastAPI",3,"ASP.Net",5.6) 
                     .collect(Collectors.toList());//Mutble
                     list1.remove("ASP.Net");
                     System.out.println(list1);
                     List list2 =Stream.of("Selenium",false,"Jira",7,"cucumber").toList();
                     list2.set(1,"Mockito");
                     System.out.println(list2);
                     List<Character> list3 = List.of('D','I','M','P','L','E');
                     list3.add('W'); System.out.println(list3);
    }
}