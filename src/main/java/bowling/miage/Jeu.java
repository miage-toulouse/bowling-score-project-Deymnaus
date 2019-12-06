package bowling.miage;

public class Jeu {
	
	private Integer lancer1;
	private Integer lancer2;
	
	public Jeu(int lancer1, int lancer2) {

		this.lancer1 = lancer1;
		this.lancer2 = lancer2;
	}

	public Integer getLancer1() {
		return lancer1;
	}

	public Integer getLancer2() {
		return lancer2;
	}

	public int nombreQuilleTombees() {

		return lancer1 + lancer2;
	}

	public boolean isSpare() {
		return lancer1 + lancer2 == 10;
	}

	public boolean isStrike() {
		
		return lancer1 == 10;
	}
}
