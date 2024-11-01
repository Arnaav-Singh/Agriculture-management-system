package src.services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {
    private static final String USERS_FILE = "users.txt";
    private List<User> users;

    public UserService() {
        this.users = loadUsers();
    }

    private List<User> loadUsers() {
        List<User> loadedUsers = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(USERS_FILE))) {
            loadedUsers = (List<User>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("User data file not found. A new file will be created.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return loadedUsers;
    }

    private void saveUsers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USERS_FILE))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean addUser(String username, String password) {
        if (findUser(username).isPresent()) {
            return false; // User already exists
        }
        users.add(new User(username, password));
        saveUsers();
        return true;
    }

    public Optional<User> findUser(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }
}
