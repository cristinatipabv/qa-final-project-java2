package com.cristina.hw2;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) throws InvalidUserDataException {

        if (user == null) {
            throw new InvalidUserDataException("User este null");
        }

        if (user.getUsername() == null || user.getUsername().length() < 3) {
            throw new InvalidUserDataException(
                    "Username-ul utilizatorului este null sau are mai puțin de 3 caractere"
            );
        }

        if (user.getAge() < 0) {
            throw new InvalidUserDataException(
                    "Age-ul utilizatorului este un număr negativ"
            );
        }

        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}