
public class Table {
	
	private Joueur joueur;
	private Banque banque;
	private JeuDeCarte jeudecarte;
	private int miseJ;
	
	public Table() {
		this.miseJ=0;
		this.joueur= new Joueur();
		this.banque=new Banque();
		this.jeudecarte= new JeuDeCarte();
	}
	
	
	public JeuDeCarte getJeudecarte() {
		return jeudecarte;
	}



	public Joueur getJoueur() {
		return joueur;
	}


	public Banque getBanque() {
		return banque;
	}


	public int getMiseJ() {
		return miseJ;
	}


	public void setMiseDuJ(int mise) throws Exception{
		if(this.joueur.getSolde()<mise) {
			throw new Exception();
		}
		this.joueur.setSolde(this.joueur.getSolde()-mise);
		this.miseJ=mise;
	}
	
	public void distribuerTable() throws Exception{
		System.out.println("Rien de va plus !");
		System.out.println("Jeu du joueur :");
		for(int i=0;i<2;i++) {
			
			Carte c= this.jeudecarte.distribuer();
			System.out.println(c);
			this.joueur.setJeu(this.jeudecarte.distribuer());
		}
		System.out.println("Jeu de la banque :");
		Carte c= this.jeudecarte.distribuer();
		System.out.println(c);
		this.banque.setJeu(c);
	}
	
	public void distribuerBanque() throws Exception {
		System.out.println("La banque pioche !");
		int valeur=0;
		if (this.banque.getJeu().get(0).getValeur().ordinal()>=8) {
			valeur=10;
		}else{
			valeur=this.banque.getJeu().get(0).getValeur().ordinal()+2;
		}
		while(valeur<=16) {
			Carte carte=this.jeudecarte.distribuer();
			System.out.println("La banque pioche : un "+ carte.toString());
			int ajouter=carte.getValeur().ordinal();
			if(ajouter>=8){
				valeur+=10;
			}else{
				valeur+=ajouter+2;
			}
			
			this.banque.setJeu(carte);
		}
		
	}
}
