package com.solvd;


import com.github.javafaker.Faker;
import com.solvd.data.DataGenerate;
import com.solvd.enums.EducationType;
import com.solvd.people.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    static Faker faker = new Faker(new Locale("en-US"));
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        //Data generate

        //University university = new University("National University of Trade and Economics", faker.phoneNumber(),
                //faker.internet().emailAddress(), List<UniversityBuilding> )

/*        List<Integer> list = new ArrayList<>();
        list.add(2);
        String test = Integer.toString(faker.number().numberBetween(1,200));
        String test2 = Integer.toString(new Random().nextInt(1+500));
        System.out.println(new Random().nextInt(1+500));*/


/*        List<Audience> audiences = new ArrayList<>();
        DataGenerate.AudienceGenerator(audiences,6);
        System.out.println(audiences);
        Audience audience1 = audiences.get(1);
        System.out.println(audience1);
        System.out.println();*/
        List<Student> students = new ArrayList<>();
        DataGenerate.StudentGenerator(students, EducationType.FULLTIME,3);
        System.out.println(students);
    }
}