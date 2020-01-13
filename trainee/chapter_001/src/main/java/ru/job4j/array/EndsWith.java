package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int i = word.length - 1, j = post.length - 1; j != 0; i--, j--) {
            if (word[i] != post[j]) {
                result = false;
                break;
            } else {
                result = true;

            }
        }
        return result;
    }

    public static boolean endsWith2(char[] word2, char[] post2) {
        boolean result = false;
        for (int i = word2.length - post2.length; i < word2.length; i++) {
            if (word2[i] != post2[i - (word2.length - post2.length)]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }


}
