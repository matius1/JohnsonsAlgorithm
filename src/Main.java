import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Zadanie> zadania = new ArrayList<Zadanie>();
		zadania.add(new Zadanie("zad1", 2, "red"));
		zadania.add(new Zadanie("zad2", 3, "blue"));
		zadania.add(new Zadanie("zad3", 1, "white"));
		zadania.add(new Zadanie("zad4", 5, "black"));
		zadania.add(new Zadanie("zad5", 4, "rose"));
		
		System.out.println(zadania);
		
	}

}
