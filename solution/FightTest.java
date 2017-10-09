import junit.framework.*;
import org.junit.Test;

public class FightTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}
	
	@Test
	public void testPlayer1Wins() throws Exception {
		Worm player1 = new Worm(20, 5);
		Worm player2 = new Worm(10, 3);
		Arena arena = new Arena(player1, player2);
		assertEquals(player1, arena.fight());
	}

	@Test
	public void testPlayer2Wins() throws Exception {
		Worm player1 = new Worm(12, 2);
		Worm player2 = new Worm(50, 8);
		Arena arena = new Arena(player1, player2);
		assertEquals(player2, arena.fight());
	}
}