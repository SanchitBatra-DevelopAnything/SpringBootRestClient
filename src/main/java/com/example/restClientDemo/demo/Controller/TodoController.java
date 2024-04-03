package com.example.restClientDemo.demo.Controller;

import com.example.restClientDemo.demo.Model.Todo1;
import com.example.restClientDemo.demo.Services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("{id}")
    public Todo1 getToDo(@PathVariable("id") int id)
    {
        return this.toDoService.getToDo(id);
    }

    @GetMapping("/")
    public List<Todo1> getTodos()
    {
        return this.toDoService.getTodos();
    }
}
