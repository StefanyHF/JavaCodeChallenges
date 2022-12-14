//Write a simple parser that will parse and run Deadfish.
//
//        Deadfish has 4 commands, each 1 character long:
//
//        i increments the value (initially 0)
//        d decrements the value
//        s squares the value
//        o outputs the value into the return array
//        Invalid characters should be ignored.
//
//        Deadfish.parse("iiisdoso") =- new int[] {8, 64};

import java.util.ArrayList;

public class DeadFish {
    public static int[] parse(String data) {
        char[] arr = data.toCharArray();
        int number = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (char c : arr) {
            switch (c) {
                case 'i':
                    number++;
                    break;
                case 'd':
                    number--;
                    break;
                case 's':
                    number = number * number;
                    break;
                case 'o':
                    numbers.add(number);
                    break;
            }
        }
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
