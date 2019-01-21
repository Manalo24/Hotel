
public class Azienda extends Cliente
{
	private String nome_Azienda;
	private String partitaIVA;
	private String indirizzo;
	
	public Azienda(String nome, String cognome, String nome_Azienda) 
	{
		super(nome, cognome);
		this.nome_Azienda = nome_Azienda;
		this.partitaIVA = "cfdgsdf";
		this.indirizzo = "gdfgdf";
	}
	
	
	@Override
	public String toString()
	{
		return super.toString() + " fa parte di: " + nome_Azienda;
	}


}