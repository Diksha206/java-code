package com.inheritance;



import java.util.Scanner;

class Patient {
	String patient_name;
	int patient_age;
	int patient_oxy_level;
	String patient_HRCT_report;

	Patient(String patient_name, int patient_age, int patient_oxy_level, String patient_HRCT_report) {
		this.patient_name = patient_name;
		this.patient_age = patient_age;
		this.patient_oxy_level = patient_oxy_level;
		this.patient_HRCT_report = patient_HRCT_report;
	}

	void displayInfo() {
		System.out.println("Patient Name: " + patient_name);
		System.out.println("Patient Age: " + patient_age);
		System.out.println("Patient Oxygen Level: " + patient_oxy_level);
		System.out.println("Patient HRCT Report: " + patient_HRCT_report);
	}
}

class CovidException extends Exception {
	CovidException(String message) {
		super(message);
	}
}

public class Patientcheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter patient name: ");
		String name = scanner.nextLine();
		System.out.print("Enter patient age: ");
		int age = scanner.nextInt();
		System.out.print("Enter patient oxygen level: ");
		int oxyLevel = scanner.nextInt();
		System.out.print("Enter patient HRCT report: ");
		String hrctReport = scanner.next();

		Patient patient = new Patient(name, age, oxyLevel, hrctReport);

		try {
			if (patient.patient_oxy_level < 95 && Integer.parseInt(patient.patient_HRCT_report) > 10) {
				throw new CovidException("Patient is Covid Positive(+) and Need to Hospitalized");
			} else {
				patient.displayInfo();
			}
		} catch (CovidException e) {
			System.out.println(e.getMessage());
		}
	}
}