package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {

        ArrayList<Person> result = new ArrayList<>();

        Predicate<Person> containsName = Person -> Person.getName().contains(key);
        Predicate<Person> containsSurname = Person -> Person.getSurname().contains(key);
        Predicate<Person> containsPhone = Person -> Person.getPhone().contains(key);
        Predicate<Person> containsAddress = Person -> Person.getAddress().contains(key);

        Predicate<Person> combine = containsName.or(containsSurname).or(containsPhone).or(containsAddress);

        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
