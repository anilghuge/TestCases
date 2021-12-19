package com.vinsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinsys.entity.User;
@Repository
public interface IUserDAO extends JpaRepository<User, Integer> {

}
