package VideoHw;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        // the list has way more information on how to perform certain operations
        //with your collection or your list
        /*
        -Allows duplicates
        -Not fixed in size like arrays
        -Fast for data retrivals
        -Various implementations

         */
        List<String> colorsUnmodifiable = List.of(
                "blue",
                "yellow"
        );
        List<String> colors = new ArrayList<>();
        // adding values
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        //printing the list
        System.out.println(colors);
        // checking the size
        System.out.println(colors.size());
        // check what it contains
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));

        //Looping thorugh array
        for(String color : colors){
            System.out.println(color);
        }
        //for each
        colors.forEach(System.out::println);

        // for loop
        for(int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }


    }
}
