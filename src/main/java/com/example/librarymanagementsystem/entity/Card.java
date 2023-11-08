package com.example.librarymanagementsystem.entity;

import com.example.librarymanagementsystem.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Entity
@Table(name="card")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp  //this annotation automatically give date when we add this class object in DB
    Date issueDate;

    @Enumerated(EnumType.STRING)
    private CardStatus cardstatus;
    private String validTill;

    @OneToOne
    @JoinColumn //this will create a column of foreign key in child class means card
    Student student;//established a relationship b/w card to student

}
