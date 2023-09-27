package com.porus.ReactiveAPIDemo.repository;

import com.porus.ReactiveAPIDemo.models.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
