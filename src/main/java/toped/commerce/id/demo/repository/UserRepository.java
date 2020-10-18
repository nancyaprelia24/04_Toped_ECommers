package toped.commerce.id.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import toped.commerce.id.demo.model.User;

public interface UserRepository extends MongoRepository<User, String>{

	User findByEmail(String email);
}
