package bowling.miage;

import java.util.ArrayList;
import java.util.List;

public class Partie {

	private List<Jeu> jeux = new ArrayList<Jeu>();
	
	public Partie(Jeu leJeu) {
		
		for(int i=0; i<10; i++) {
			
			this.jeux.add(leJeu);
		}
		
		if (this.jeux.get(9).isSpare()) this.jeux.add(leJeu);
		if (this.jeux.get(9).isStrike()) {
			this.jeux.add(leJeu);
		}
	}
	
	public int calculeScore() {
		
		int score = 0;
		
		for(int i=0; i<10; i++) {
			
			if (jeux.get(i).isSpare()) {
				
				score += jeux.get(i+1).getLancer1() + 10;
				
			} else if (jeux.get(i).isStrike()) {
				
				if (jeux.get(i+1).isStrike()) {
					
					score += 10 + jeux.get(i+1).getLancer1() + jeux.get(i+2).getLancer1();
					
				} else {
					
					score += 10 + jeux.get(i+1).getLancer1() + jeux.get(i+1).getLancer2();
				}
		
			} else {
				
				score += jeux.get(i).getLancer1() + jeux.get(i).getLancer2();
			}
			
		}
		
		return score;
	}
}
