package com.nayanathara.onlinebookstore.repository;

import com.nayanathara.onlinebookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

//specifies the com.nayanathara.onlinebookstore.entity type book and primary key type long
//jpaRepository contains API for basic CRUD operations and also API for pagination and sorting
public interface BookRepository extends JpaRepository<Book,Long> {
}
