package com.ohgiraffers.academy_project.subject.model.dto;

public class SubjectDTO {

    private int subjectCode;
    private String subjectName;
    private char subjectStatus;

    public SubjectDTO() {
    }

    public SubjectDTO(int subjectCode, String subjectName, char subjectStatus) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectStatus = subjectStatus;
    }

    public int getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public char getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(char subjectStatus) {
        this.subjectStatus = subjectStatus;
    }

    @Override
    public String toString() {
        return "SubjectDTO{" +
            "subjectCode=" + subjectCode +
            ", subjectName='" + subjectName + '\'' +
            ", subjectStatus=" + subjectStatus +
            '}';
    }
}
