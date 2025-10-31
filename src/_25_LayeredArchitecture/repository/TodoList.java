package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.Todo;

public class TodoList {
    public Todo[] todos;

    public TodoList() {
        this.todos = new Todo[0];
    }

    public Todo[] getTodosByUserId(int userId) {
        int foundTodoCount = 0;

        for(Todo todo : todos) {
            if(todo.getUser().getUserId() == userId) {
                foundTodoCount++;
            }
        } // 배열 길이

        Todo[] foundTodos = new Todo[foundTodoCount];

        for(int i = 0, j = 0; i < foundTodoCount; i++) {
            if(todos[i].getUser().getUserId() == userId) {
                foundTodos[j] = todos[i];
                j++;
            }
        } // 찾은 배열 넣기

        return foundTodos;
    }

    public int generateTodoId() {
        return todos.length == 0 ? 1 : todos[todos.length - 1].getTodoId() + 1;
    }

    public void addTodo(Todo todo) {
        Todo[] todo1 = new Todo[todos.length + 1];
        for(int i = 0; i < todos.length; i++) {
            todo1[i] = todos[i];
        }
        todo1[todo1.length - 1] = todo;
        todos = todo1;
    }
}
