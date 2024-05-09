package com.example.manage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manage.entity.Regularize;

@Repository
public interface RegularizeRepository extends JpaRepository<Regularize, Long> {
}
