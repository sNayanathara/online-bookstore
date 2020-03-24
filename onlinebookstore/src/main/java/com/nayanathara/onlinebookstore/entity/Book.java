package com.nayanathara.onlinebookstore.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

//specifies that the class is an com.nayanathara.onlinebookstore.entity and is mapped to a database table
@Entity
//specifies the name of the database table to be used for mapping
@Table(name="tbl_book")
@Setter
@Getter
@ToString
public class Book {

    //if the field name and the database name is not the same then we should map them using @Column annotation.if the names are same then no need to annotate the jpa will automatically map them
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String sku;
    private String name;
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    private boolean active;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "date_created")
    private Date createdOn;

    @Column(name = "last_updated")
    private Date updatedOn;

    //the relationship between these two entities is many to one
    @ManyToOne //many books belong to one category
    //the field category_id cannot be null and this is the field which joins the two entities
    @JoinColumn(name = "category_id",nullable = false)
    //define a field of type BookCategory
    private BookCategory category;

}
