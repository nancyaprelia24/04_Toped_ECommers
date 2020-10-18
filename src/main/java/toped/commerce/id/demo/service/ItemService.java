package toped.commerce.id.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import toped.commerce.id.demo.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired ItemRepository itemRepository;
	
	
}
