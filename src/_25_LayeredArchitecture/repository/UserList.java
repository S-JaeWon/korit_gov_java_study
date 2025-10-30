package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.User;

public class UserList {
    public User[] users;

    public UserList() {
        this.users = new User[0];
    }

    public User[] getUserAll() {
        return users;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public int generateUserId() {

        return users.length == 0 ? 1 : users[users.length - 1].getUserId() + 1;
    }

    public void add(User user) {
        User[] user1 = new User[users.length + 1];
        for(int i = 0; i < users.length; i++){
            user1[i] = users[i];
        }
        user1[user1.length - 1] = user;
        users = user1;
    }
}
