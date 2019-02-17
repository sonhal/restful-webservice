package no.oslomet.rest.webservice.restfulwebservice.services;


import no.oslomet.rest.webservice.restfulwebservice.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserService {

    private static final  List<User> users = new ArrayList<>();
    private static int userCount = 3;
    static {
        users.add(new User(1,"Sondre", new Date()));
        users.add(new User(2,"Eve", new Date()));
        users.add(new User(3,"Jack", new Date()));
    }

    public List<User> findAll(){
        return users;
    }


    public User save(User user){
        if(user.getId() == null){
            user.setId(++userCount);
        }

        users.add(user);
        return user;
    }

    public User findOne(int id){
        for(User user: users){
            if(user.getId() == id) return user;
        }
        return null;
    }
}
