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

		System.out.println("¬вед≥ть слово ≥з 5 букв:");
		Scanner scanword = new Scanner(System.in);
		String stringword = scanword.next();
		while (!stringword.matches("[a-zA-Zа-€ј-я]+")) { // ÷икл дл€ перев≥рки чи введена ≥-ц≥€ м≥стить лише букви
			System.out.println("¬ведена ¬ами р≥ч не Ї словом.");
			stringword = scanword.next(); // якщо н≥ то сл≥д повторити вв≥д
		}
		if (stringword.length() == 5) { // дл€ сл≥в розм≥ром 5 букв
			String[] word = stringword.split(""); 
			if (word[0].equalsIgnoreCase(word[4]) && word[1].equalsIgnoreCase(word[3])) { // перев≥рка на пал≥ндромн≥сть слова
				System.out.println("¬ведене ¬ами слово (" + stringword + ") €вл€Їтьс€ пал≥ндромом");
			} else {
				System.out.println("¬ведене ¬ами слово  (" + stringword + ") не €вл€Їтьс€ пал≥ндромом");
			}
		} else {
			throw new WrongInputConsoleParametersException("¬веденe ¬ами слово не в≥дпов≥даЇ вищезазначеним умовам."); // €кщо довжина слова перевищуЇ 5 букв 
		}
	}

}
