public class Carte implements Comparable<Carte>{
	
	private Valeur valeur;
	private Couleur couleur;
	
	public Carte(Valeur valeur,Couleur couleur) {
		this.valeur=valeur;
		this.couleur=couleur;
	}
	
	public Couleur getCouleur() {
		return this.couleur;
	}
	
	public Valeur getValeur() {
		return this.valeur;
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