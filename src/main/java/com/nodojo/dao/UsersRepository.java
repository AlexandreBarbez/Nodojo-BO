package com.nodojo.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.nodojo.models.User;

@Transactional
public interface UsersRepository extends CrudRepository<User, Long> {

	List<User> findByUserName(String userName);
}
