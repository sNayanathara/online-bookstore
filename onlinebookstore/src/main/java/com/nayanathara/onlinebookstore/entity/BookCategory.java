package com.nayanathara.onlinebookstore.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

//specifies that the class is an com.nayanathara.onlinebookstore.entity and is mapped to a database table
@Entity
//specifies the name of the database table to be used for mapping
@Table(name = "tbl_category")
@Setter
@Getter
@ToString
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    //one category belongs to many books
    //cascadeType.All means that any change happened on BookCategory com.nayanathara.onlinebookstore.entity must cascade to all mapped by category field as well
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    //set is an interface which extends collection.It is an unordered collection of objects where duplicate values cannot be stored.Implemented by hashSets,linkedHashSets,TreeSet.Has various methods to add,remove,clear...
    private Set<Book> book; //a set interface of type Book










}
