package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.SigninReqDto;
import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.UserList;

public class UserService {
    private UserList userList;

    public UserService(UserList userList) {
        this.userList = userList;
    }

    public boolean isDupleUsername(String username) {
        // 중복 확인
        return userList.findByUsername(username) != null;
    }

    public void signup(SignupReqDto signupReqDto) {
        User user = signupReqDto.toEntity();
        user.setUserId(userList.generateUserId());
        userList.add(user);
    }

    public User signin(SigninReqDto signinReqDto) {
        User foundUser = userList.findByUsername(signinReqDto.getUsername());
        if (foundUser == null || !foundUser.getPassword().equals(signinReqDto.getPassword())) {
            return null;
        }
        return foundUser;
    }

    public void printAllUserList() {
        System.out.println("회원 정보 전체 조회");
        for(User user : userList.getUserAll()) {
            System.out.println(user);
        }
    }

}
