package animals;

public class Animal {
	// Hmm, all attributes here are already encapsulated...
	//  Could this be a hint?

	// Attributes
	private String species;
	private String genus;
	private int lifespan;

	// Methods
	// Setter Methods
	public void set_species( String s) {
		if (!s.isEmpty())
			species = s;
	}

	public void set_genus( String g) {
		if (!g.isEmpty())
			genus = g;
	}

	public void set_lifespan( int l) {
		if (l >= 0)
			lifespan = l;
	}

	// Getter Methods
	public String get_species() {
		return species;
	}

	public String get_genus() {
		return genus;
	}

	public int get_lifespan() {
		return lifespan;
	}
}