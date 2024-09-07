package org.example.repo.impl;

import org.example.repo.UserRepo;

public class UserRepoImpl implements UserRepo {
    public UserRepoImpl() {
    }

    @Override
    public void findByEmail(String email) {
        System.out.println(String.format("User '%s' is found", email));
    }
}
