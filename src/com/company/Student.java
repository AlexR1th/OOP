package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student {
    private String name;
    private String lastName;
    private String patronimic;
    private LocalDate birthday;
    private String gender;
    private LocalDate dateEntrasYear;

    public Student(String name, String lastName, String patronimic, LocalDate birthday, String gender, LocalDate dateEntrasYear) {
        this.name = name;
        this.lastName = lastName;
        this.patronimic = patronimic;
        this.birthday = birthday;
        this.gender = gender;
        this.dateEntrasYear = dateEntrasYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateEntrasYear() {
        return dateEntrasYear;
    }

    public void setDateEntrasYear(LocalDate dateEntrasYear) {
        this.dateEntrasYear = dateEntrasYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronimic='" + patronimic + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", dateEntrasYear=" + dateEntrasYear +
                '}';
    }

    public boolean isAdult() {
        long years = ChronoUnit.YEARS.between(birthday, LocalDate.now());
        String result = years >= 18 ? "MOje" : years >= 19 ? "321312" : "Nemoje";
        if (years >= 18) {
            result = "moje";
        }
        else if (years >= 19){
            result = "21323123";
        }else {
            result = "nemoje";
        }
        System.out.println(result);
        return false;
        //return result;
    }

    public boolean isMilitary() {
        boolean result1 = gender == "Male";
        return result1;
    }
}

