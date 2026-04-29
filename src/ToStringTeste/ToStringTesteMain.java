package ToStringTeste;

import java.util.ArrayList;

public class ToStringTesteMain {

	public static void main(String[] args) {

		System.out.println("PARTE 1 toString() ");
		
		System.out.println("Objeto unico");
		
		ToStringTeste p1 = new ToStringTeste("Natalino", 25);
		
		System.out.println(p1);
		
		System.out.println("PARTE 2");
		
		ArrayList<ToStringTeste> lista = new ArrayList<>();

		lista.add(new ToStringTeste("SSD", 100));
		lista.add(new ToStringTeste("MOUSE", 200));
		lista.add(new ToStringTeste("MONITOR 25", 1600));
		
		System.out.println(lista);
	}

}
