
public class Client {
	
	public static void main(String[] args) {
		Table table = new Table();
		try {
			table.distribuerTable();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(table.getJoueur().toString());
		System.out.println(table.getBanque().toString());
		
	}

}
