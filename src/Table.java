
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
	
	
	public Joueur getJoueur() {
		return joueur;
	}


	public Banque getBanque() {
		return banque;
	}


	public int getMiseJ() {
		return miseJ;
	}


	public void setMiseDuJ(int mise) {
		this.miseJ=mise;
	}
	
	public void distribuerTable() throws Exception{
		for(int i=0;i<2;i++) {
			this.joueur.setJeu(this.jeudecarte.distribuer());
		}
		for(int i=0;i<2;i++) {
			this.banque.setJeu(this.jeudecarte.distribuer());
		}
	}
}
