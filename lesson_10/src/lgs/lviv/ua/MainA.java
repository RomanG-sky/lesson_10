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
		System.out.println("������ ������� �� �� ����� �� 20 ����:");
		Scanner scanword = new Scanner(System.in);
		String stringword = scanword.nextLine();
		stringword.toLowerCase();
		while (stringword.length() < 20) {  // ���� ��� ��������� ������� �� 20 ��������
			System.out.println("�� ����� ���������� ������� ���.");
			stringword = scanword.nextLine();
		}

		System.out.println(stringword.replaceAll("[AaEeIiOoUu�����貳����]", "-")); // �������� ����� �� ������ �������� �� ����
		System.out.println("ʳ������ ��� = " + (stringword.replaceAll("[.,;:,()']", "").length()
				- stringword.replaceAll("[.,;:,()']", "").replaceAll(" ", "").length() + 1)); // �������� �-��� ��� �� ���������� ������� �����

	}

}
