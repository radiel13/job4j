package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("milk", 10);
        Product bread = new Product("bread", 4);
        Product egg = new Product("egg", 19);

        Product[] prods = new Product[3];

        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;

        for(int i = 0; i < prods.length; i++){
            Product pr = prods[i];
            System.out.println(pr.getName() + " - " + pr.getCount() );
        }

        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        prods[0] = oil;

        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }

        System.out.println("Shown only product.count > 10");
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            if (pr.getCount() > 10) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }
}
