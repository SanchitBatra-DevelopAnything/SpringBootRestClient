package com.example.restClientDemo.demo.Services;

import com.example.restClientDemo.demo.Model.Todo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private RestClient restClient;

    public Todo1 getToDo(int id)
    {
        Todo1 body = restClient.get().uri("/todos/{id}" , id)
                .retrieve()
                .body(Todo1.class);

        return body;
    }

    public List<Todo1> getTodos()
    {
        List<Todo1> list = restClient.get().uri("/todos").retrieve().body(new ParameterizedTypeReference<List<Todo1>>(){});
        return list;
    }

}
