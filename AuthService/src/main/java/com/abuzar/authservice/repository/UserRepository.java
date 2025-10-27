package com.abuzar.authservice.repository;

import com.abuzar.authservice.entities.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo, Long> {

    public UserInfo findByUsername(String username);
}
