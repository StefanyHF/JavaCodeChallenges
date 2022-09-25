public class Sum {

    /*
Given two integers a and b, which can be positive or negative,
find the sum of all the integers between and including them and return it.
If the two numbers are equal return a or b.
 */

    public int getSumBetweenTwoInt(int a, int b) {
        int result = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            result += i;
        }
        return a == b ? a : result;
    }
}



// Other ways I did first
/*
 public int getSumBetweenTwoInt(int a, int b) {
        int result = 0;

        if (a == b) {
            result = b;
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                result += i;
            }
        } else {
            for (int i = a; b <= i; i--) {
                result += i;
            }
        }
        return result;
    }
 */