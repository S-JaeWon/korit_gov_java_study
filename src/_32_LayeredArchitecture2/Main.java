package _32_LayeredArchitecture2;

import _32_LayeredArchitecture2.dto.SignupReqDto;
import _32_LayeredArchitecture2.repository.UserRepository;
import _32_LayeredArchitecture2.repository.UserRepositoryImpl;
import _32_LayeredArchitecture2.service.SignupService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SignupService signupService = SignupService.getInstance();

        while (true) {
            System.out.println("[회원가입 SYSTEM]");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 회원 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print(": ");
            String choice = scanner.nextLine();

            if ("q".equalsIgnoreCase(choice)) {
                System.out.println("종료 합니다.");
                break;
            } else if ("1".equals(choice)) {
                System.out.println("회원가입");
                SignupReqDto signupReqDto = new SignupReqDto();
                while (true) {
                    System.out.print("username: ");
                    signupReqDto.setUsername(scanner.nextLine());
                    if (signupService.isValidDuplicatedUsername(signupReqDto.getUsername())) {
                        break;
                    }
                    System.out.println("중복된 아이디 입니다.");
                }

                while (true) {
                    System.out.print("비밀번호: ");
                    signupReqDto.setPassword(scanner.nextLine());
                    if (signupService.isValidPassword(signupReqDto.getPassword())) {
                        break;
                    }
                    System.out.println("다시 입력 해주세요.");
                }

                while (true) {
                    System.out.print("비밀번호 확인: ");
                    signupReqDto.setPasswordCheck(scanner.nextLine());
                    if (signupService.isValidPasswordCheck(signupReqDto.getPassword(), signupReqDto.getPasswordCheck())) {
                        break;
                    }
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }

                signupService.signup(signupReqDto);
                System.out.println("회원가입 완료");

            } else if ("2".equals(choice)) {
                System.out.println("로그인");
            } else if ("3".equals(choice)) {
                System.out.println("회원 전체 조회");
            }
        }
    }
}
