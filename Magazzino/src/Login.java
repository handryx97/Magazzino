
public class Login {
	private final String[]utenti= {"Segreteria","Magazzino","GestoreMagazzino"};
	private String[] password= {"Ciao","1234","pippo"};
	
	
	
	public String getUtenti(int pos) {
		return utenti[pos];
	
	}
	public String getPassword(int pos) {
		return password[pos];
		
	}
	
	public void setPassword(String nomeUtente,String password) {
		int i=0;
		while(nomeUtente!=utenti[i]) {
			i++;
		}
		this.password[i]=password;
		
		
	}
	
	

}
