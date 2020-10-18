package toped.commerce.id.demo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import toped.commerce.id.demo.model.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String>{

}
