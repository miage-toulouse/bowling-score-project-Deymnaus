package bowling.miage;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class PartieTest extends TestCase {

	public void testCalculeScoreSansStrikeSansSpare() {
		
		Jeu leJeu = new Jeu(5, 0);
		
		Partie laPartie = new Partie(leJeu);
		
		int score = laPartie.calculeScore();
		
		assertEquals(50, score);
	}
	
	public void testCalculesScoreQueDesStrikes() {
		
		Jeu leJeu = new Jeu(10, 0);
		
		Partie laPartie = new Partie(leJeu);
		
		int score = laPartie.calculeScore();
		
		assertEquals(300, score);
	}

}
