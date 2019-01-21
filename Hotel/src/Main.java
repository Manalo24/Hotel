import java.time.LocalDate;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera c4= new Camera(0, 0, 0, 0);
		Scanner sc=new Scanner(System.in);
		HotelC h=new HotelC();
		int ggs;
		int ggf;
		int mese;
		int mesef;
		int finale=0;
		String nome;
		String cog;
		int user=0;
		h.inizio();
		c4.start();
		while(finale==0) {
			System.out.println("0)Exit");
			System.out.println("1)Prenotazione");
			System.out.println("2)Dato un periodo");
			System.out.println("3)Trova cliente");
			System.out.println("Scegli dal menu");
			user=sc.nextInt();
			switch(user) {
			
			case 1:
				System.out.println("Inserisci nome");
			nome=sc.next();
			System.out.println("inserisci cognome");
			cog=sc.next();
			Cliente c = new Cliente(nome, cog);
			System.out.println("inserici mese d'inizio");
			mese=sc.nextInt();
			System.out.println("inserici giorno in numeri");
			ggs=sc.nextInt();
			System.out.println("inserisci mese fine");
			mesef=sc.nextInt();
			System.out.println("inserici giorno fine in numeri");
			ggf=sc.nextInt();
			LocalDate start = LocalDate.of(2019, mese, ggs);
			LocalDate fine= LocalDate.of(2019, mesef, ggf);
			c4.inserisciCliente(start, fine, c);
			break;
			case 2:
				System.out.println("inserici mese d'inizio");
				mese=sc.nextInt();
				System.out.println("inserici giorno in numeri");
				ggs=sc.nextInt();
				System.out.println("inserisci mese fine");
				mesef=sc.nextInt();
				System.out.println("inserici giorno fine in numeri");
				ggf=sc.nextInt();
				start = LocalDate.of(2019, mese, ggs);
				fine= LocalDate.of(2019, mesef, ggf);
				c4.controlStanze(start, fine);
				break;
			case 3: System.out.println("cognome:");
			
			cog=sc.next();
			c4.controlPerson(cog);
	}
			

}
}
}