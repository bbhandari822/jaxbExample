package com.binod.jaxb.example;

/**
 * Created by Binod Bhandari on 7/18/18.
 */
import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlFileToJavaObject {
    public static void main(String[] args) {

        try {

            File file = new File("src/main/resources/question.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Question que= (Question) jaxbUnmarshaller.unmarshal(file);

            System.out.println("Answers:");
            List<Answer> list=que.getAnswers();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
