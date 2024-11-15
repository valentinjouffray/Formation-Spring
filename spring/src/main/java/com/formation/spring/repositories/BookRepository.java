package com.formation.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.spring.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
}