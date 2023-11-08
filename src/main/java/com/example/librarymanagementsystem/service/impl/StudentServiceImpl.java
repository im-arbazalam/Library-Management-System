package com.example.librarymanagementsystem.service.impl;

import com.example.librarymanagementsystem.Enums.CardStatus;
import com.example.librarymanagementsystem.entity.Card;
import com.example.librarymanagementsystem.entity.Student;
import com.example.librarymanagementsystem.repository.StudentRepository;
import com.example.librarymanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String addStudent(Student student) {

        //generate a new card for student
        Card card=new Card();
        card.setCardstatus(CardStatus.ACTIVATED);
        card.setValidTill("2-24-01-01");
        card.setStudent(student);

        //set the card for student
        student.setCard(card);
        studentRepository.save(student);

        return "student added";

    }


}
