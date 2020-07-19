package guru.spring.rest.services;

import guru.spring.api.domain.User;

import java.util.List;

/**
 * Created by jt on 9/21/17.
 */
public interface ApiService {

    List<User> getUsers(Integer limit);
}
