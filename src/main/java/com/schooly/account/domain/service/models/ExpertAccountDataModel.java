package com.schooly.account.domain.service.models;

import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "Builder")
public class ExpertAccountDataModel {

    private String name;
    private String lastName;
    private String gender;
    private String DOB;
    private int age;
    private Double yearOfExperience;
    private List<Subject> subjectOfExpertise ;
    private String nameOfDegree;
    private String yearOfPassOut;
    private String collegeName;
    private String descriptionOfTeachingExperience;
    private String linkedinProfileUrl;
    private  Address address;
    private AccountStatus status;

}
