package me.dio.santanderdevweb2023.service;

import me.dio.santanderdevweb2023.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);


}
