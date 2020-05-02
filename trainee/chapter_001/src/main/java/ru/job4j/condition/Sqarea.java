package ru.job4j.condition;

public class Sqarea {
    public static double square(int p, int k) {

        return (p / 2 * k) / (k + 1) * (p / 2) / (1 + k);
    }

    public static void main(String[] args) {
        double result1 = Sqarea.square(6, 2);
        System.out.println("p = 4, k = 1, s = 1, real  = " + result1);
    }
}

//s = L * h;
//L=h*k
// p = 2 (h*k+h)
//L =
//p = 2 * (L + h)
//L + h = p/2
//L = p/2-L/k
//L+L/k = p/2
// L*k + L = p/2*k
// L(K+1) = p/2 * k
// L = (p/2*k) / (K+1)
/* h =
    L + h = p/2
    h = p/2 - L
    h = p/2 - h*k
    h + h*k = p/2
    h(1+k) = p/2
    h= (p/2) / (1+k)
 */