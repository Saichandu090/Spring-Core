package com.beanlifecycle;

public class Exam
{
    private String subjectName;
    private double subjectDuration;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getSubjectDuration() {
        return subjectDuration;
    }

    public void setSubjectDuration(double subjectDuration) {
        this.subjectDuration = subjectDuration;
    }

    @Override
    public String toString() {
        return "Exam [" +
                "SubjectName='" + subjectName + '\'' +
                ", SubjectDuration=" + subjectDuration +
                ']';
    }

    //init
    public void dinga()
    {
        System.out.println("Exam started!!");
    }

    //destroy()
    public void dingi()
    {
        System.out.println("Exam Ended!!");
    }
}
