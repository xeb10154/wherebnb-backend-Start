package com.project3.javaReact.components;

import com.project3.javaReact.models.Experience;
import com.project3.javaReact.models.Property;
import com.project3.javaReact.models.User;
import com.project3.javaReact.repositories.experiences.ExpRepository;
import com.project3.javaReact.repositories.properties.PropRepository;
import com.project3.javaReact.repositories.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ExpRepository expRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PropRepository propRepository;


    DateFormat dateFormatter = new SimpleDateFormat("HH-mm-ss");


    public DataLoader() {

    }

    public Date createDate(String inputDate){
        String newDate = inputDate;
        Date date = null;
        try {
            date = dateFormatter.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public void run(ApplicationArguments args) {

        User admin = new User("Raymond", "Yau", "admin@wherebnb.com", "password");
        userRepository.save(admin);

        User neil = new User("Neil", "Ruthven", "neil@gmail.com", "password");
        userRepository.save(neil);

		Experience exp1 = new Experience("Stirling", "Adventure", "Outdoors city of Scotland", 50, createDate("08-12-2018"));
		expRepository.save(exp1);

        Experience exp2 = new Experience("Glasgow", "Exhibitions", "Museums of Scotland", 8, createDate("01-05-2018"));
        expRepository.save(exp2);

        Experience exp3 = new Experience("Edinburgh", "Music", "Listen to the sound", 25, createDate("15-09-2018"));
        expRepository.save(exp3);

        Property prop1 = new Property(2, 80, "Apartment", 4.5, 55.946976, -4.753461 );
        prop1.addImage("local/path/to/image1");
        prop1.addImage("local/path/to/image2");
        propRepository.save(prop1);

        Property prop2 = new Property(2, 80, "House", 4.5, 55.946976, -4.753461 );
        prop2.addImage("local/path/to/image1");
        prop2.addImage("local/path/to/image2");
        propRepository.save(prop2);

        admin.bookProp(prop1);
        userRepository.save(admin);

        neil.bookProp(prop1);
        neil.bookProp(prop2);
        userRepository.save(neil);

    }



}