package com.ayarrus.apiblog.service;

import com.ayarrus.apiblog.model.Todo;
import com.ayarrus.apiblog.payload.ApiResponse;
import com.ayarrus.apiblog.payload.PagedResponse;
import com.ayarrus.apiblog.security.UserPrincipal;

public interface TodoService {

	Todo completeTodo(Long id, UserPrincipal currentUser);

	Todo unCompleteTodo(Long id, UserPrincipal currentUser);

	PagedResponse<Todo> getAllTodos(UserPrincipal currentUser, int page, int size);

	Todo addTodo(Todo todo, UserPrincipal currentUser);

	Todo getTodo(Long id, UserPrincipal currentUser);

	Todo updateTodo(Long id, Todo newTodo, UserPrincipal currentUser);

	ApiResponse deleteTodo(Long id, UserPrincipal currentUser);

}
