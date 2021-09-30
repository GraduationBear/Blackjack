
public class TestCartes {

	public static void main(String[] args) {
		JeuDeCarte jeu=new JeuDeCarte();
		
		try {
			System.out.print(jeu.retourner());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
