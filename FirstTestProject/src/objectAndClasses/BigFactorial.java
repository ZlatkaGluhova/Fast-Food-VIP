package objectAndClasses;

import java.math.BigInteger;

public class BigFactorial {
    public static void main(String[] args) {
//        int num = 5;
//        int factoriel = num;
//        int result = 0;
//        for (int i = num - 1; i > 0; i--) {
//            result = factoriel * i;
//            factoriel = result;
//        }

//        System.out.println(result);

        BigInteger num = new BigInteger(String.valueOf(5));
        BigInteger factoriel = num;
        BigInteger one = new BigInteger(String.valueOf(1));
        BigInteger result = new BigInteger(String.valueOf(0));
        for (BigInteger i = num.subtract(one); i.intValue() > 0; i = i.subtract(one)) {
            result = factoriel.multiply(i);
            factoriel = result;
        }

        System.out.println(result);


    }
}

