/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.
 */


public class UniqueNumber {

    public static double findUniqueNumber(double arr[]) {
        double first = arr[0];

        if (first != arr[1] && first != arr[2]) return first;

        for (double item : arr) {
            if (item != first) return item;
        }
        return 0.0;
    }
}
