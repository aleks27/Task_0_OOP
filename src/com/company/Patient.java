package com.company;

import java.util.Arrays;

class Patient {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String phoneNumber;
    private int numberMedicalCard;
    private String diagnosis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumberMedicalCard() {
        return numberMedicalCard;
    }

    public void setNumberMedicalCard(int numberMedicalCard) {
        this.numberMedicalCard = numberMedicalCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient(int id, String surname, String name, String patronymic, String address, String phoneNumber, int numberMedicalCard, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.numberMedicalCard = numberMedicalCard;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", numberMedicalCard=" + numberMedicalCard +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}