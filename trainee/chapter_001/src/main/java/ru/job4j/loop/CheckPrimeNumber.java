package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        if (finish < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(finish); i++) {
            if (finish % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*  public static boolean check(int finish) {
        boolean prime = false;
        for (int i = 2; i <= finish; i++) {
            if (finish % i == 0 && i < finish) {
                break;
            } else {
                prime = true;
            }
        }

        return prime;
    }
*/

/* It doesn't work for 0 and 1
    boolean prime = true;
        for (int i = 2; i < finish; i++) {
        if (finish % i == 0) {
        prime = false;
        }
        }
        return prime;*/

