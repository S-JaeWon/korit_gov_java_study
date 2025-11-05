package _32_LayeredArchitecture2.service;

import _32_LayeredArchitecture2.dto.SigninReqDto;
import _32_LayeredArchitecture2.entity.User;
import _32_LayeredArchitecture2.repository.UserRepository;
import _32_LayeredArchitecture2.repository.UserRepositoryImpl2;
import _32_LayeredArchitecture2.util.PasswordEncoder;

public class SigninServiceImpl implements SigninService{
    private static SigninServiceImpl instance;
    private UserRepository userRepository;

    private SigninServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SigninServiceImpl getInstance() {
        if (instance == null) {
            instance = new SigninServiceImpl(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }


    @Override
    public void signin(SigninReqDto signinReqDto) {
        User foundUser = userRepository.findByUsername(signinReqDto.getUsername()); // user 반환

        if ((foundUser == null) || !PasswordEncoder.match(signinReqDto.getPassword(), foundUser.getPassword())) {
            System.out.println("일치하는 회원 정보가 없습니다.");
            return; // 함수 탈출
        }

        System.out.println("로그인 성공");
        System.out.println(foundUser);
        // foundSuer 안에 user 값 있음
    }

    @Override
    public boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }
}
