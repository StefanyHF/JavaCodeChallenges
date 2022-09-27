import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        int exp = binary.size()-1;
        for (Integer integer : binary) {
            if (integer == 1) result += Math.pow(2, exp);
            exp--;
        }
        return result;
    }
}

