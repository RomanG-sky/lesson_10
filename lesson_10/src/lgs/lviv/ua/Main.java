package lgs.lviv.ua;

import java.util.Scanner;
/**
 * Class description goes here.
 *
 * @version 1.0 13 Sep 2021
 * @author Roman G-sky
 */
public class Main {

	public static void main(String[] args) throws WrongInputConsoleParametersException {

		System.out.println("������ ����� �� 5 ����:");
		Scanner scanword = new Scanner(System.in);
		String stringword = scanword.next();
		while (!stringword.matches("[a-zA-Z�-��-�]+")) { // ���� ��� �������� �� ������� �-��� ������ ���� �����
			System.out.println("������� ���� �� �� � ������.");
			stringword = scanword.next(); // ���� � �� ��� ��������� ���
		}
		if (stringword.length() == 5) { // ��� ��� ������� 5 ����
			String[] word = stringword.split(""); 
			if (word[0].equalsIgnoreCase(word[4]) && word[1].equalsIgnoreCase(word[3])) { // �������� �� ������������ �����
				System.out.println("������� ���� ����� (" + stringword + ") ��������� ����������");
			} else {
				System.out.println("������� ���� �����  (" + stringword + ") �� ��������� ����������");
			}
		} else {
			throw new WrongInputConsoleParametersException("������e ���� ����� �� ������� �������������� ������."); // ���� ������� ����� �������� 5 ���� 
		}
	}

}
