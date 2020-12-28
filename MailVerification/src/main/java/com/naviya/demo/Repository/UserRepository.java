package com.naviya.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.naviya.demo.Model.UserEntity;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<UserEntity, String> {

    UserEntity findByEmailIdIgnoreCase(String emailId);

}
