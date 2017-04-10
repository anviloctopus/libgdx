package com.theironyard.novaua;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by ANVIL_OCTOPUS on 3/16/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String userName);
}