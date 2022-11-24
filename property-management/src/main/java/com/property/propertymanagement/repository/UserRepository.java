package com.property.propertymanagement.repository;

import com.property.propertymanagement.entity.PropertyEntity;
import com.property.propertymanagement.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

// CrudRepository has all kind of supportive methods to query the model findbyid save delete ..etc.
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    // for login we need to match the mail with the password if correct or not
    // Optional required to return yes exist or not present
    // the method name must start with findBy followed by the two conditions
    Optional<UserEntity> findByOwnerEmailAndPassword(String email, String password);

    // to check if the mail exist or not
    Optional<UserEntity> findByOwnerEmail(String email);

}
