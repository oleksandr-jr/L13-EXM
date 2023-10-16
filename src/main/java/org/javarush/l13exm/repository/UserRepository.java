package org.javarush.l13exm.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, User> users = new HashMap<>(){{
        User admin = new User("Admin", "Admin", "Admin@jr.com", "root");
        User user = new User("User", "User", "user@jr.com", "root");
        User guest = new User("Guest", "Guest", "guest@jr.com", "root");

        put(admin.getUserName(), admin);
        put(user.getUserName(), user);
        put(guest.getUserName(), guest);
    }};

    private static UserRepository instance;

    private UserRepository() {
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }

        return instance;
    }

    public void add(User user) {
        users.put(user.getUserName(), user);
    }

    public User get(String userName) {
        return users.get(userName);
    }
    public Collection<User> getAll() {
        return users.values();
    }

    public boolean contains(String userName){
        return users.containsKey(userName);
    }
}
