package com.solvd.data;

import com.github.javafaker.Faker;
import com.solvd.Audience;
import com.solvd.RecordBook;
import com.solvd.enums.EducationType;
import com.solvd.enums.Gender;
import com.solvd.people.Student;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class DataGenerate {
       final static ThreadLocalRandom random = ThreadLocalRandom.current();
       final static Faker faker = new Faker(new Locale("en-US"));

    //Audience
    public static List<Audience> AudienceGenerator(List<Audience> list, Integer num){
        while(num>0){
            list.add(new Audience(Integer.toString(random.nextInt(1,400)),
                    random.nextInt(1,5),
                    random.nextInt(30,50)));
            num--;
        }
        return list;
    }
    //Students
    public static List<Student> StudentGenerator(List<Student> list, EducationType type, Integer num){
        while(num>0){
            list.add(new Student(faker.name().fullName(),
                    Gender.values()[new Random().nextInt(Gender.values().length)],
                    faker.date().birthday(16,60),
                    random.nextBoolean(),
                    type,
                    new RecordBook(Integer.toString(random.nextInt(1000,9000)))));
        num--;
        }
        return list;
    }
}
