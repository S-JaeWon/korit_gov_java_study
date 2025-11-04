package _32_LayeredArchitecture2.repository;

import _32_LayeredArchitecture2.entity.User;

import java.util.Arrays;

public class UserRepositoryImpl implements UserRepository {
    private static UserRepositoryImpl instance;
    private User[] users;
    private Integer autoIncrement;

    private UserRepositoryImpl() {
        users = new User[0];
        autoIncrement = 1;
    }

    public static UserRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new UserRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length + 1); // 기존 배열 복사 하되, 길이 + 1
        user.setUserId(autoIncrement++);
        temp[temp.length - 1] = user;
        users = temp;
    }

    @Override
    public User findByUsername(String username) {
        for(User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
