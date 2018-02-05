// Auteurs : Julien Cardinal, Paul Sasu

public class CV {
	
	private String nom;
	private String prenom;
	private String formation;
	private int expTrav;
	private String[] comps;
	private String attentes;
	
	public CV( String nom, String prenom, String formation, int expTrav, String[] comps, String attentes ) {		
		
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.expTrav = expTrav;
		this.comps = comps;
		this.attentes = attentes;
		
	}

	public static void main( String[] args ) {
		
		
		
	}
	
	public void affiche() {
		
		System.out.println( "\nNom : " + nom );
		System.out.println( "Pr\u00E9nom : " + prenom );
		System.out.println( "Formation : " + formation );
		System.out.println( "Exp\u00E9rience de travail : " + expTrav + " ann\u00E9e(s)" );
		System.out.print( "Comp\u00E9tences : " );
		
		for ( String comp : comps ) {
			
			System.out.print( comp + ", " );
			
		}
		
		System.out.println();
		System.out.println( "Attentes : " + attentes );
		
	}

}
