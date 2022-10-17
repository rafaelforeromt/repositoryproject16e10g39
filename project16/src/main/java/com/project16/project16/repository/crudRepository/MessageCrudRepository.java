package com.project16.project16.repository.crudRepository;

import com.project16.project16.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
