package com.win.postgresspringapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EndUserRepository extends JpaRepository<EndUser, Long> {
    EndUser findByName(String name);
}