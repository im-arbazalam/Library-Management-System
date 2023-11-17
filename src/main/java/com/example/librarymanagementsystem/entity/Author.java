package com.example.librarymanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="author")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "author",cascade=CascadeType.ALL)  //these step build multi directional relationship from parent to child
    List<Book> books=new ArrayList<>();   //iska mtlb yeh hua ki jb author register karega site pr toh zaroori nhi h ki woh book add karen isliye humne empty list bna di

}
