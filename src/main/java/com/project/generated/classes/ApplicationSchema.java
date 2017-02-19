package com.project.generated.classes;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApplicationSchema {

    private String applicantName;
    private int age;
    private int id;
    private Application application;

    public Application getApplication(){
        return application;
    }

    public void setApplication(Application application){
        this.application=application;
    }

    public String getApplicantName() {
        return applicantName;
    }


    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

}