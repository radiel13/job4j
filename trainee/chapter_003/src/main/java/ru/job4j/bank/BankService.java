package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс содержит перечень клиентов
 * А также методы для работы банковского счета
 */
public class BankService {
    /**
     * Хранение клиентов осуществляется в коллекции типа Map
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод проверяет, есть ли клиент в списке
     * И если нет - добавляет
     * @param user клиент, который добавляется в список
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет клиенту банковский счет
     * @param passport для поиска клиента принимает паспортные данные
     * @param account принимает номер счета для его добавляения
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (!users.get(user).contains(account)) {
            users.get(user).add(account);
        }

    }

    /**
     * Метод осуществляет поиск клиента по его паспорту
     * @param passport принимает паспортые данные клиента
     * @return если такой клиент есть - возвращает этого клиента, иначе null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод осуществляет поиск счета
     * @param passport принимает паспортные данные клиента
     * @param requisite принимает номер счета
     * @return если такой клиент найден, и у него есть такой счет
     * возвращает этот счет, иначе null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод осуществляет перевод денег с одного счета на другой
     * @param srcPassport паспортные данные клиента, со счета которого списываются деньги
     * @param srcRequisite номер счета, с которого списываются деньги
     * @param destPassport паспортные данные клиента, на который переводятся деньги
     * @param destRequisite номер счета, на который зачисляются деньги
     * @param amount сумма денежных средств
     * @return возвращает true, если перевод осуществлен успешно
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && amount <= srcAccount.getBalance()) {
            double srcBalance = srcAccount.getBalance() - amount;
            double destBalance = destAccount.getBalance() + amount;
            srcAccount.setBalance(srcBalance);
            destAccount.setBalance(destBalance);
            rsl = true;
        }
        return rsl;
    }
}