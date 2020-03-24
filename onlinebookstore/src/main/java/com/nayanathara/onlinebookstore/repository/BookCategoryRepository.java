package com.nayanathara.onlinebookstore.repository;

import com.nayanathara.onlinebookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//These will create Rest and points based on the com.nayanathara.onlinebookstore.entity name.Spring Data Rest wil take care of everything
//Representational state transfer(REST) is an application program interface(API) that uses HTTP requests to GET,PUT,POST and DELETE data

@RepositoryRestResource(collectionResourceRel = "bookCategory",path = "book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long> {
}
