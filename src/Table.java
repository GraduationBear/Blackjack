
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
		this.banque.setJeu(this.jeudecarte.distribuer());
	}
	
	public void distribuerBanque() {
		System.out.println("La banque pioche :");
		int valeur=this.banque.getJeu().get(1).getValeurs().getValeur1();
		while (valeur<=16) {
			this.banque.setJeu(this.jeudecarte.distribuer());
		}
	}
}
