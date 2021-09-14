package lgs.lviv.ua;

import java.util.Scanner;

/**
 * Class description goes here.
 *
 * @version 1.0 13 Sep 2021
 * @author Roman G-sky
 */
public class MainA {

	public static void main(String[] args) {
		int count;
		System.out.println("¬вед≥ть реченн€ ≥з не менше €к 20 букв:");
		Scanner scanword = new Scanner(System.in);
		String stringword = scanword.nextLine();
		stringword.toLowerCase();
		while (stringword.length() < 20) {  // ÷икл дл€ створенн€ реченн€ ≥з 20 символ≥вю
			System.out.println("¬и ввели недостатню к≥льк≥сть сл≥в.");
			stringword = scanword.nextLine();
		}

		System.out.println(stringword.replaceAll("[AaEeIiOoUuја≈е»и≤≥ќо”у]", "-")); // ¬иводить текст ≥з зам≥ною голосних на тире
		System.out.println(" ≥льк≥сть сл≥в = " + (stringword.replaceAll("[.,;:,()']", "").length()
				- stringword.replaceAll("[.,;:,()']", "").replaceAll(" ", "").length() + 1)); // ¬иводить к-сть сл≥в не враховуючи розд≥лов≥ знаки

	}

}
