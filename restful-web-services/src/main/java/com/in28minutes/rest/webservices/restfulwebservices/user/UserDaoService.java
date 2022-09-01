package com.in28minutes.rest.webservices.restfulwebservices.user;


import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    // create array list from the user model
    private static List<User> users = new ArrayList<>();

    private static Integer usersCount = 0;

    // create users to save in the array list
    static {
        users.add(new User(++usersCount, "Yassin", LocalDate.now().minusYears(11)));
        users.add(new User(++usersCount, "Yahya", LocalDate.now().minusYears(6)));
        users.add(new User(++usersCount, "Yomna", LocalDate.now().minusYears(4)));
    }

    // return list of all users
    public List<User> findAll(){
        return users;
    }

    // return specific user by ID
    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }

    // creat new user
    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }




}
