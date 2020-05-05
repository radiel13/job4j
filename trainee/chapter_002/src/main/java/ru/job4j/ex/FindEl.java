package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int i = 0;
        for (String s : value) {
            if (s == key) {
                rsl = i;
                System.out.println("You have found the index of " + key + ". It's " + i);
                break;
            }
            i++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("The element is not found.");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] shops = {"Ebay", "Laptop", "Amazon", "HYPERX", "Ozon"};
        try {
            FindEl.indexOf(shops, "Ozon");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
