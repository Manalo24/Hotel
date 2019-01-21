import java.time.LocalDate;

public class Camera {
	HotelC h = new HotelC();
	int i =0;
	private int [] arrayn = new int[365];
	private int nome;
	private double prezzo_min;
	private double prezzo_max;
	private int num_posti;
	private Cliente[] clienti = new Cliente[365];
	public Camera(int nome, double prezzo_min, double prezzo_max, int num_posti) {
		this.nome = nome;
		this.prezzo_min = 321321;
		this.prezzo_max = 321312;
		this.num_posti = 312321;
	}
	public void start() {
		for (int i =0;i<arrayn.length;i++) {
			arrayn[i]=0;
			clienti[i]=new Cliente(" "," ");
		}
		for (int aa=0;aa<20;aa++) {
			h.control[aa]="libero";
		}
	}
	public void inserisciCliente(LocalDate inizio, LocalDate fine, Cliente c) {

	int counter;
	if (i<h.control.length) {
		for (int a = inizio.getDayOfYear();a<fine.getDayOfYear();a++) {
			arrayn[a]=1;
			
		}

		counter=fine.getDayOfYear()-inizio.getDayOfYear();
		clienti[counter]=c;
		h.control[i]="occupato";
		Camera pp = new Camera(i,prezzo_min,prezzo_max,num_posti);
		h.camere[i]=pp;
		i++;
		System.out.println("prenotazione effetuato");
			}else {
		System.out.println("quel posto è occupato oppure hai superato il max");
	}
	
		System.out.println("aa");
	}
	public void controlStanze(LocalDate start, LocalDate finish) {
		int check;
		
		boolean see=false;
		check = start.getDayOfYear();
		while(see==false && check!=finish.getDayOfYear() ) {
			if(arrayn[check]==1) {
				System.out.println("mi spiace quel posto è occupato");
				see=true;
			}else {
				check++;
			}
			
		}
		System.out.println("ecco le stanze libere");
		for (int p=0;p<h.control.length;p++) {
			if(h.control[p]=="libero") {
				System.out.println(h.control[p]);
			}
		}
}
	public void controlPerson(String cog) {
		for (int i = 0;i<clienti.length;i++) {		
		if (cog.equalsIgnoreCase(clienti[i].getCognome())) {	
			System.out.println("Il signor "+clienti[i].getCognome()+" "+" si trova nella stanza: " +  i);
			i=600;
		}
	}
}
}
