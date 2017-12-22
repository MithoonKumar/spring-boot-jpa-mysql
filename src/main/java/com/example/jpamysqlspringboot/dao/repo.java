package com.example.jpamysqlspringboot.dao;

import com.example.jpamysqlspringboot.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<user,Long>{
}
