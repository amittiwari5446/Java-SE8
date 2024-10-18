import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Vinayak"); list.add("Samraat"); list.add("Ishu");
        list.add("Arjit"); list.add("Damodar"); list.add("Rishabh");
        list.add("Harminder"); list.add("Chandrachud"); list.add("Ramnaresh");

        list.stream().sorted().forEach(System.out::println);
        System.out.println("....................");

        list.stream().map(str->str.toUpperCase()).forEach(System.out::println);
        System.out.println("....................");

        list.stream().map(str->str.toUpperCase()).sorted().forEach(System.out::println);
        System.out.println("....................");

        list.stream().filter(str->str.length()==7).forEach(System.out::println);
        System.out.println("....................");

        list.stream().filter(str->(str.length()>=4 && str.length()<=7)).map(str->str.toUpperCase()).forEach(System.out::println);
        System.out.println("....................");

        list.stream().filter(str->str.length()==7).map(str->str.toCharArray().length).forEach(System.out::println);
        System.out.println("....................");

        list.stream().filter(str->(str.length()>=4 && str.length()<=8)).forEach(str->System.out.println(str+" - "+str.length()));
        System.out.println("....................");

        String s1="12345";
        list.stream().map(str->str+s1).forEach(System.out::println);
        System.out.println("....................");

        list.stream().map(str->str.charAt(3)).forEach(System.out::println);
        System.out.println("....................");

        List<String> list2=List.of("Mayank","Jainaresh","Riya","Kamla","Samriddhi");


    }
}