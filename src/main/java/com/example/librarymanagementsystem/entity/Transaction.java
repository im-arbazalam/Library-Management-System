package com.example.librarymanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.util.Date;

@Entity
@Table(name="transaction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String transactionNumber;

    @CreationTimestamp
    private Date transactionDate;

    private boolean isIssueOperation;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

    @ManyToOne //these three step create a relationship from child to parent ie transaction to card
    @JoinColumn
    Card card;

    @ManyToOne //these three step create a relationship from child to parent ie transaction to book
    @JoinColumn
    Book book;


    public void setTransactionStatus(com.example.librarymanagementsystem.Enums.TransactionStatus transactionStatus) {
    }
}
