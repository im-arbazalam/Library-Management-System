package com.example.librarymanagementsystem.DTO.ResponseDto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.resource.transaction.spi.TransactionStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IssueBookResponseDto {
    private String transactionNumber;

    private TransactionStatus transactionStatus;

    private String bookName;
}
