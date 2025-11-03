package _29_Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> todoList = new ArrayList<>();
        int count;
        System.out.print("반복 횟수 입력: ");
        count = scanner.nextInt();
        String todos;

        for (int i = 0; i < count; i++) {
            System.out.print("할 일: ");
            todos = scanner.next();
            todoList.add(todos);
        }
        System.out.println(todoList);

        for(String todo : todoList) {
            System.out.println("Todo: "+ todo);
        }

        String removeTodo;
/*        removeTodo = scanner.next();
        while (todoList.contains(removeTodo)) {
            System.out.print("삭제: ");
            todoList.remove(removeTodo);
        }*/

        while (true) {
            System.out.print("삭제: ");
            removeTodo = scanner.next();

            if (!todoList.contains(removeTodo)) {
                System.out.println("해당 항목이 없습니다. 다시 입력하세요.");
                continue;
            }

            todoList.remove(removeTodo);
            System.out.println("삭제 완료");
            break;
        }

        System.out.println("Todo 수정: " + todoList);

        Collections.sort(todoList);
        System.out.println("오름차순: " + todoList);
        Collections.sort(todoList, Collections.reverseOrder());
        System.out.println("내림차순: " + todoList);

        System.out.println("갯수: " + todoList.size());
    }
}
