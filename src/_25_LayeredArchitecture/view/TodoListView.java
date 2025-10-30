package _25_LayeredArchitecture.view;

import _25_LayeredArchitecture.dto.SigninReqDto;
import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.dto.TodoReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.service.TodoService;
import _25_LayeredArchitecture.service.UserService;

import java.util.Scanner;

public class TodoListView {
    // 전역 변수를 둬서 homeView 호출 할때마다 따로 호출 x
    private Scanner scanner;
    private User principal;
    private UserService userService;
    private TodoService todoService;

    public TodoListView(UserService userService, TodoService todoService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
        this.todoService = todoService;
    }

    public void homeView() {
        while (true) {
            System.out.println("[ Todo List ]");
            System.out.println("1. TodoList");
            if (principal == null) {
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
            } else {
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.print(" -> ");
            String cmd = scanner.nextLine();

            if ("q".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)) {
                // TodoList 관리
                if (principal == null) {
                    System.out.println("로그인을 해주세요.");
                    continue;
                }
                todoListMenu();
            } else if ("2".equals(cmd) && principal == null) {
                // 회원가입
                signupView();
            } else if ("2".equals(cmd) && principal != null) {
                // 로그아웃
                principal = null;
                System.out.println("로그아웃");

            } else if ("3".equals(cmd) && principal == null) {
                // 로그인
                signinView();
            } else {
                System.out.println("유효 하지 않은 기능입니다.");
            }
        }
    }

    // 회원가입 뷰
    public void signupView() {
        System.out.println("[ 회원가입 ]");
        String username = null;

        while(true) {
            System.out.print("아이디: ");
            username = scanner.nextLine();
            if(!userService.isDupleUsername(username)) {
                System.out.println("사용 가능한 아이디 입니다.");
                break;
            }
            System.out.println("중복입니다.");
        }
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        System.out.print("사용자 이름: ");
        String name = scanner.nextLine();

        SignupReqDto signupReqDto = new SignupReqDto(username, password, name);
        userService.signup(signupReqDto);
        System.out.println("회원가입 완료");

        userService.printAllUserList();
    }

    public void signinView() {
        System.out.println("로그인");

        System.out.print("아이디");
        String username = scanner.nextLine();
        System.out.print("패스워드");
        String password = scanner.nextLine();
        SigninReqDto signinReqDto = new SigninReqDto(username, password);
        User foundUser = userService.signin(signinReqDto);
        if (foundUser == null) {
            System.out.println("아이디 혹은 비밀번호가 일치 하지 않습니다.");
            return;
        }
        principal = foundUser;
        System.out.println("로그인 성공");
    }


    public void todoListMenu() {
        Todo todo = null;
        while (true) {
            System.out.println("TodoList menu");
            System.out.println("1. 등록하기");
            System.out.println("2. 조회하기");
            System.out.println("3. 뒤로가기");
            System.out.print(" -> ");
            String cmd = scanner.nextLine();

            if("b".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)) {
                System.out.println("Todo 등록");
                System.out.print("Todo: ");
                String contents = scanner.nextLine();

                TodoReqDto todoReqDto = new TodoReqDto(contents, todo.getUser());
                todoService.createTodo(todoReqDto);
                System.out.println("Todo 등록 완료");

            } else if ("2".equals(cmd)) {
                System.out.println("Todo 조회");

            }
        }
    }
}
