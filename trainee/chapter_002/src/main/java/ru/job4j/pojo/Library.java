package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book a = new Book("HarryPotter", 10);
        Book b = new Book("Shamal", 1);
        Book c = new Book("451 Fahrengeit", 2);
        Book CleanCode = new Book("Clean Code", 100);

        Book[] books = new Book[4];
        books[0] = a;
        books[1] = b;
        books[2] = c;
        books[3] = CleanCode;

        for (int i = 0; i < books.length; i++) {
            Book bb = books[i];
            System.out.println(bb.getName() + " - " + bb.getAmount());
        }

        Book e= books[0];
        books[0] = books[3];
        books[3] = e;

        for (int i = 0; i < books.length; i++) {
            Book bb = books[i];
            System.out.println(bb.getName() + " - " + bb.getAmount());
        }

        for (int i = 0; i < books.length; i++) {
            Book bb = books[i];
            if (bb.getName().equals("Clean Code")) {
                System.out.println(bb.getName() + " - " + bb.getAmount());
            }
        }
    }
}
