package com.example.demo.entitiy;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Question {
    public Question(int id, String question_body, int points, String type, Quiz quiz_id) {
        this.id = id;
        this.question_body = question_body;
        this.points = points;
        this.type = type;
        this.quiz_id = quiz_id;
    }

    public Question() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(columnDefinition="TEXT")
    private String question_body;
    private int points;
    private String type;
    @ManyToOne
    private Quiz quiz_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion_body(String question_body) {
        this.question_body = question_body;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuiz_id(Quiz quiz_id) {
        this.quiz_id = quiz_id;
    }

    public String getQuestion_body() {
        return question_body;
    }

    public int getPoints() {
        return points;
    }

    public String getType() {
        return type;
    }

    public Quiz getQuiz_id() {
        return quiz_id;
    }
}
