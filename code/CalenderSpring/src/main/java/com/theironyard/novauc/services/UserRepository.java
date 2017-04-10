package com.theironyard.novauc.services;

import com.theironyard.novauc.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ANVIL_OCTOPUS on 3/22/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String name);
}