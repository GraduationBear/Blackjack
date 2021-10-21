public class Carte implements Comparable<Carte>{
	
	private Valeur valeur;
	private Couleur couleur;
	private Couple<Integer,Integer> valeurs;
	
	public Carte(Valeur valeur,Couleur couleur) {
		this.valeur=valeur;
		this.couleur=couleur;
		if (this.getValeur().ordinal()>=9 && this.getValeur().ordinal()!= 13) {
			valeurs=new Couple<>(10,0);
		}else if(this.getValeur().ordinal() == 13) {
			valeurs=new Couple<>(11,1);
		}else {
			valeurs=new Couple<>(this.getValeur().ordinal()+1,0);
		}
		
	}
	
	public Couleur getCouleur() {
		return this.couleur;
	}
	
	public Valeur getValeur() {
		return this.valeur;
	}
	public Couple<Integer,Integer> getValeurs() {
		return this.valeurs;
	}
	
	@Override
	public String toString() {
		return this.valeur + " de " +this.couleur;
	}
	
	public int compareTo(Carte c) {
		if(this.couleur.ordinal()<c.couleur.ordinal()) {
			return -1;
		}else {
			if(this.couleur.ordinal()>c.couleur.ordinal()) {
				return 1;
			}else {
				return this.valeur.ordinal()-c.valeur.ordinal();	
			}
		}
	}
}