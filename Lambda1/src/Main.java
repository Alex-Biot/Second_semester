import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        final String hello1 = "Hello ";

        Function<String, String> hello = name -> hello1 + name;
        System.out.println(hello.apply("Vasja"));
        Function<String, String> hello2 = new Function<String, String>() {
            @Override
            public String apply(String name) {
                final String hello1 = "Hello ";
                return hello1 + name;
            }
        };
        //hello2.apply("Vasja");

        //String[] strings = {"aaaaaa", "aaaaaa", "acaaaa", "bbbbb"};
        String[] strings = new String[10];
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            list.add(string);
        }
        //Set <String>set ;
        Function<List, List> listSetFunction = a -> Arrays.asList(((new HashSet(list)).toArray()));
        //System.out.println(listSetFunction.apply(list));
    }



}

