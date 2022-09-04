package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
