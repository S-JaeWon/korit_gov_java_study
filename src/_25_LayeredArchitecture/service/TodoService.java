package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.TodoReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.repository.TodoList;

public class TodoService {
    private TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    public void createTodo(TodoReqDto todoReqDto) {
        Todo todo = todoReqDto.toEntity();
        todo.setTodoId(todoList.generateTodoId());
        todoList.addTodo(todo);
    }

    public void printTodoListByUserId() {
    }
}
