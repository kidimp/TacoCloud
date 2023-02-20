package org.chous.tacocloud.repositories;

import org.chous.tacocloud.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}