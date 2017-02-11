package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {


        Patient[] patient = addPatients();

        System.out.println("List of Diagnosis:");
        listOfDiagnosis(patient);
        System.out.println();
        System.out.println("List of Number Medical Card:");
        listOfNumberMedicalCard(patient);

    }

    private static void listOfDiagnosis(Patient[] patients) {
        System.out.println("Flu");
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equals("flu"))
                System.out.println(patient);
        }


        System.out.println("Broken leg");
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equals("broken leg"))
                System.out.println(patient);
        }

        System.out.println("Shaking head");
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equals("shaking head"))
                System.out.println(patient);
        }

        System.out.println("Obesity");
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equals("obesity"))
                System.out.println(patient);
        }
    }

    private static void listOfNumberMedicalCard(Patient[] patients) {
        System.out.println("From 0 to 100 000");
        for (Patient patient : patients) {
            if (patient.getNumberMedicalCard() <= 100_000)
                System.out.println(patient);
        }

        System.out.println("From 100 001 to 200 000");
        for (Patient patient : patients) {
            if (patient.getNumberMedicalCard() > 100_000 && patient.getNumberMedicalCard() <= 200_000)
                System.out.println(patient);
        }
    }

    private static Patient[] addPatients() {
        Patient[] patient = new Patient[4];

        patient[0] = new Patient(0, "Ivanov", "Ivan", "Ivanovich", "Ukraine, Kyiv", "0935556633", 12345, "flu");
        patient[1] = new Patient(1, "Semenov", "Semen", "Semenovich", "Ukraine, Kharkiv", "0664344432", 23456, "broken leg");
        patient[2] = new Patient(2, "Nikolayev", "Nikolya", "Kolevich", "Ukraine, Lviv", "0636523654", 34567, "shaking head");
        patient[3] = new Patient(3, "Sidorov", "Sidar", "Vasilevich", "Ukraine, Dnipro", "0955558525", 145678, "obesity");

        return patient;
    }

}