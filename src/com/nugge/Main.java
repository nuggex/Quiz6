package com.nugge;

public class Main {

    public static void main(String[] args) {
        // 'j' är faktorn x //
        for (int j = 2; j < 10; j++) {
            // 'k' är YiYi-1 //
            for (int k = 1; k < 91; k++) {
                // test är summan av dessa tal //
                int test = j * k;
                String derp = String.valueOf(test);
                // kollar att resultat är över 100//
                if (test > 100) {
                    String YiYi = String.valueOf(k);
                    String x = String.valueOf(j);
                    // gemför YiYi-1 siffra vid position 0 och 1 mot siffra vid position 0 och 2 i test //
                    if (derp.charAt(0) == YiYi.charAt(0) && derp.charAt(2) == YiYi.charAt(1) && derp.charAt(1) == '0') {
                        System.out.println(YiYi + "*" + x + "=" + derp);
                    }
                }
            }
        }
    }
}
