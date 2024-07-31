public class Lion {
	// Attributes
	public String species;
	public String genus;
	public String biome;
	public int lifespan;
	public float claw_size;
	public float fang_size;

	// Methods
	public void show_taxonomy() {
		System.out.println("Species: " + species + ", Genus: " + genus);
	}
	public void show_habitat() {
		System.out.println("Lives in " + biome + " regions.");
	}
	public void lifespan() {
		System.out.println("Can live up to " + lifespan + " years.");
	}
	public void claws() {
		System.out.println("Lions have " + claw_size + " cm claws.");
	}
	public void fangs() {
		System.out.println("Lions have " + fang_size + " cm fangs.");
	}
}
