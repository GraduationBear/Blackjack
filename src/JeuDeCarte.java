import java.util.ArrayList;
import java.util.Collections;

public class JeuDeCarte {
	
	private ArrayList<Carte> paquet;
	
	public JeuDeCarte(){
		this.paquet= new ArrayList<>();
		for(Couleur c : Couleur.values()) {
			
			 for(Valeur v : Valeur.values()) {
				 System.out.println(v);
				 System.out.println(c);
				 this.paquet.add(new Carte(v,c));
			 }
		 }
	}
	
	public Carte premièreCarte() throws Exception{
		if (this.paquet.isEmpty()) {
			throw new Exception("Paquet vide");
		}	
		return this.paquet.get(this.paquet.size()-1);
	}
	
	public void classer(){
		Collections.sort(this.paquet);	
	}
	
	public void melanger() {
		Collections.shuffle(this.paquet);
	}
	
	public String retourner() throws Exception{
		Collections.rotate(this.paquet, 1);
		return this.paquet.get(0).toString();
	}
	
	public void distribuer() throws Exception{
		if (this.paquet.isEmpty()) {
			throw new Exception("Paquet vide");
		}
		this.paquet.remove(this.paquet.size()-1);
	}
}