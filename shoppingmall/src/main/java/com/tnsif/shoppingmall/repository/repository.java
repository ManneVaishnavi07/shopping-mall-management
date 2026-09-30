package com.tnsif.shoppingmall.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tnsif.shoppingmall.entity.entity;

@Repository
public interface repository extends JpaRepository<entity, Integer> {

    List<entity> findByOccupied(boolean occupied);

}