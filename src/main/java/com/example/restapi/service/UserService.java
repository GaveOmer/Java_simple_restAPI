package com.example.restapi.service;

import com.example.restapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "feitan",32, "email1@mail.com");
        User user2= new User(1, "hisoka",23, "email2@mail.com");
        User user3 = new User(1, "Killua",43, "email3@mail.com");
        User user4 = new User(1, "Ging",21, "email4@mail.com");
        User user5 = new User(1, "Gon",29, "email5@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList) {
            if (id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
