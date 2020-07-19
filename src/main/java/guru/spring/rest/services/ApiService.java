package guru.spring.rest.services;

import guru.spring.rest.models.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}