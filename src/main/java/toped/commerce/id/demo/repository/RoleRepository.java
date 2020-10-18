package toped.commerce.id.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import toped.commerce.id.demo.model.Role;

public interface RoleRepository extends MongoRepository<Role, String>{
	
	Role findByRole(String role);
}
