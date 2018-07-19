package com.binod.jaxb.example;

/**
 * Created by Binod Bhandari on 7/18/18.
 */
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Question {
    private int id;
    private List<Answer> answers;
    public Question() {}
    public Question(int id, List<Answer> answers) {
        super();
        this.id = id;
        this.answers = answers;
    }
    @XmlAttribute
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public List<Answer> getAnswers() {
        return answers;
    }
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}