package com.example.demo.entitiy;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class choices {
    public choices(int id, String choice_body, Question question_id) {
        this.id = id;
        this.choice_body = choice_body;
        this.question_id = question_id;
    }

    public choices() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String choice_body;
    @ManyToOne
    private Question question_id;

    public int getId() {
        return id;
    }

    public String getChoice_body() {
        return choice_body;
    }

    public Question getQuestion_id() {
        return question_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChoice_body(String choice_body) {
        this.choice_body = choice_body;
    }

    public void setQuestion_id(Question question_id) {
        this.question_id = question_id;
    }
}
