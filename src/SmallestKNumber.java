/*
Create a function that will take parameters:
a) integer k
b) list of integers
return the smallest kth integer
 */

import java.util.Arrays;

public class SmallestKNumber {

    public static int smallestKNumber(int k, int[] listOfInt) {

        if (k > listOfInt.length) return 0;

        if (k == 0) return 0;

        if (listOfInt.length == 0) return 0;

        for (int i = 0; i < listOfInt.length; i++) {
            for (int j = i + 1; j < listOfInt.length; j++) {
                if (listOfInt[i] > listOfInt[j]) {
                    int savedValue = listOfInt[i];
                    listOfInt[i] = listOfInt[j];
                    listOfInt[j] = savedValue;
                }
            }
        }

        // System.out.print(Arrays.toString(listOfInt) + " ");

        for (int s = 0; s < k; s++) {
            if (listOfInt[s] == listOfInt[s + 1]) {
                k++;
            }
        }
        return listOfInt[k - 1];
    }


    /*

    problema:
    ordenar lista menor p maior:
       - encontrar primeiro menor
       - encontrar segundo...

     problema 2:
     retornar o k numero
     quando tem repetido ver o prox
     -[0, 1, 1, 2, 3, 7, 10, 12, 15, 22] 2

       // checar so os que tao p tras, nao na frente. exemplo:
        //3 menor    k =4, k =5 -> k-1 -> 4
        // 0,1,1,1,3,4,6,7,3 -> 3
        // 0 1 2 3 4 5


















     */


}
