package IntroductionToSelenium_05;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntroductionToSelenium_01_Test {
    @Test
    public void regular() {
        //count the number of names starting with 'A' in list
        System.out.println("Regular");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
        names.add("Ram");
        int counter = 0;
        for(int i = 0; i < names.size(); i++) {
            String actual = names.get(i);
            if(actual.startsWith("A")){
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println("-------------------------");
    }
    @Test
    public void streamFilter(){
        System.out.println("streamFilter");
        //count the number of names starting with 'A' in list
        List<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
        names.add("Ram");
        /*There is no life for intermediate op if there is no terminal op
        * terminal operation will execute only if inter op(filter) returns true
        * we can create stream
        * how to use filter in Stream API*/
        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);
        System.out.println(names.get(1));
        System.out.println("--------------------------------------------");

        //It is the same
        long d = Stream.of("Abhijeet", "Don","Alekhya", "Adam", "Ram").filter(s -> {
            s.startsWith("A");
            return true;
        }).count();
        System.out.println(d);
        System.out.println("-------------------------------");

        //print all the names
        names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
        System.out.println("-----------------------------");
    }
    @Test
    public void streamMap(){
        System.out.println("streamMap");
        //print names ending with "a" with uppercase
        Stream.of("Abhijeet", "Don","Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        System.out.println("------------------------------");
        //print names starting with "a" with uppercase sorted
        List<String> names = Arrays.asList("Azbhijeet", "Don","Alekhya", "Adam", "Rama");
        names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));
    }
    @Test
    public void streamMap2(){
        System.out.println("streamMap2");
        ArrayList<String> names = new ArrayList<String>();
        names.add("man");
        names.add("Don");
        names.add("women");

        //print names ending with "a" with uppercase
        Stream.of("Abhijeet", "Don","Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        System.out.println("------------------------------");
        //print names starting with "a" with uppercase sorted
        List<String> names1 = Arrays.asList("Azbhijeet", "Don","Alekhya", "Adam", "Rama");
        names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));
        System.out.println("\n----------------------------");

        //merging 2 different lists
        Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
        //newStream.sorted().forEach(s -> System.out.println(s));   //it is modified so you cant again write on this stream

        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
        System.out.println(flag);
        Assert.assertTrue(flag);
        System.out.println("--------------------------");
    }
    @Test
    public void  streamCollect(){
        System.out.println("streamCollect");
        //list -> new list -> new list
        List<String> ls = Stream.of("Abhijeet", "Don","Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a"))
                .map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(ls.get(0));
        System.out.println("-----------------------");

        List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
        //print unique numbers
        //sort the array
        //values.stream().distinct().forEach(s -> System.out.println(s));
        //3rd index
        List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li.get(2));
    }
}
