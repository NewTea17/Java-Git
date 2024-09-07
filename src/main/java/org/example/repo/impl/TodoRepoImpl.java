package org.example.repo.impl;

import org.example.repo.TodoRepo;

public class TodoRepoImpl implements TodoRepo {

    @Override
    public String getTodoByName(String todoName) {
        return todoName != null ? "Success" : "Fail";
    }
}
