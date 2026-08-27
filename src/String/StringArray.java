package String;

import java.util.*;
public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     List<String> str = new ArrayList<>();

        str.add("apple");
        str.add("carrot");
        str.add("banana");
        str.add("orange");
        Collections.sort(str,Collections.reverseOrder());
        System.out.println(str);
    }
}
