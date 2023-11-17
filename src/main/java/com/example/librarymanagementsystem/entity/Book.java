package com.example.librarymanagementsystem.entity;

import com.example.librarymanagementsystem.Enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="book")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String title;

    @Enumerated(EnumType.STRING)
    private Genre genre;
    private int noOfPages;
    private int price;
    private boolean isIssued;

    @ManyToOne //these three step for unidirectional relationship from child to parent
    @JoinColumn
    Author author;

    @ManyToOne //these three step for unidirectional relationship from child to parent ie book to card
    @JoinColumn
    Card card;

    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)//book to transaction relationship
    List<Transaction> transactionList = new ArrayList<>();

}
