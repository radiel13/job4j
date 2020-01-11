package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = false;
        int cnt = 0;
        for (int i = 1; i <= finish; i++) {
            if (finish % i == 0) {
                cnt++;
            }
        }

        if (cnt == 2) {
            prime = true;
        }
        return prime;
    }
}
/* It doesn't work for 0 and 1
    boolean prime = true;
        for (int i = 2; i < finish; i++) {
        if (finish % i == 0) {
        prime = false;
        }
        }
        return prime;*/