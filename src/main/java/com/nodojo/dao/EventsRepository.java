package com.nodojo.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.nodojo.models.Events;

public interface EventsRepository extends CrudRepository<Events, Long> {

    List<Events> findByName(String name);
}