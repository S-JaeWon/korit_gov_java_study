package _32_LayeredArchitecture2.service;

import _32_LayeredArchitecture2.dto.SignupReqDto;
import _32_LayeredArchitecture2.entity.User;
import _32_LayeredArchitecture2.repository.UserRepository;
import _32_LayeredArchitecture2.repository.UserRepositoryImpl2;

public class SignupService {
    private static SignupService instance;
    private UserRepository userRepository;

    private SignupService(UserRepository UserRepository) {
        this.userRepository = UserRepository;
    }

    public static SignupService getInstance() {
        if (instance == null) {
            instance = new SignupService(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) {
        User foundUser = userRepository.findByUsername(username);
        return foundUser == null;
    }

    public boolean isValidPassword(String password) {
        return  password != null && !password.isBlank();
    }

    public boolean isValidPasswordCheck(String password, String passwordCheck) {
        if (password == null || passwordCheck == null) {
            return false;
        }
        return password.equals(passwordCheck);
    }

    public void signup(SignupReqDto signupReqDto) {
        userRepository.insert(signupReqDto.toEntity());
    }

}
