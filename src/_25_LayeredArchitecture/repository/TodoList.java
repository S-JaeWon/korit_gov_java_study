package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.Todo;

public class TodoList {
    public Todo[] todos;

    public TodoList() {
        this.todos = new Todo[0];
    }

    public Todo getTodosByUserId(int userId) {
        for(Todo todo : todos) {
            if(todo.getUser().getUserId() == userId) {
                return todo;
            }
        }
       return null;
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
