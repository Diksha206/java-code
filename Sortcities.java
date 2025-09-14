package com.inheritance;


	import java.util.Scanner;
	import java.util.Arrays;

	public class Sortcities {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the number of cities: ");
			int n = scanner.nextInt();

			String[] cities = new String[n];

			System.out.println("Enter the city names:");
			for (int i = 0; i < n; i++) {
				cities[i] = scanner.next();
			}

			Arrays.sort(cities);

			System.out.println("Cities in ascending order:");
			for (String xxx : cities) {
				System.out.println(xxx);
			}
		}
	}