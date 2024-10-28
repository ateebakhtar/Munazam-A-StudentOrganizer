package com.example.munazam_astudentorganizer.DataModels;

public class TunerModel
{
    public String getCgpa() {
        return cgpa;
    }
    //test
    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    public String getSgpa() {
        return sgpa;
    }

    public void setSgpa(String sgpa) {
        this.sgpa = sgpa;
    }

    public String getGrade1() {
        return grade1;
    }

    public void setGrade1(String grade1) {
        this.grade1 = grade1;
    }

    public String getGrade2() {
        return grade2;
    }

    public void setGrade2(String grade2) {
        this.grade2 = grade2;
    }

    public String getGrade3() {
        return grade3;
    }

    public void setGrade3(String grade3) {
        this.grade3 = grade3;
    }

    public String getGrade4() {
        return grade4;
    }

    public void setGrade4(String grade4) {
        this.grade4 = grade4;
    }

    public String getGrade5() {
        return grade5;
    }

    public void setGrade5(String grade5) {
        this.grade5 = grade5;
    }

    public String getGrade6() {
        return grade6;
    }

    public void setGrade6(String grade6) {
        this.grade6 = grade6;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    private boolean expanded;
    String cgpa;
    String sgpa;
    String grade1;
    String grade2;
    String grade3;
    String grade4;
    String grade5;
    String grade6;

    public String getGrade7() {
        return grade7;
    }

    public void setGrade7(String grade7) {
        this.grade7 = grade7;
    }

    String grade7;

    public TunerModel(String cgpa, String sgpa, String grade1, String grade2, String grade3, String grade4, String grade5, String grade6,String grade7) {
        this.cgpa = cgpa;
        this.sgpa = sgpa;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.grade5 = grade5;
        this.grade6 = grade6;
        this.grade7 = grade7;
        this.expanded = false;
    }
}
