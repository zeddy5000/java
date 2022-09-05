package functionalInterfacesInbuilt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class StreamApis {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);
        numbers.forEach((number)-> System.out.println(number));
         numbers.stream().filter((number)->number%20 != 0).forEach((number)-> System.out.println(number));
         Map<String,Integer> map = new HashMap<>();
         map.put("zed",20);
         map.put("Helen",12);
         map.forEach((name,age)-> System.out.println("my name is "+name+" i am "+age+" years old"));


    }
}
