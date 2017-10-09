class Arena {

	// TODO
	private Worm player1;
	private Worm player2;

	public Arena(Worm player1, Worm player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public Worm fight() {
		while (player1.getLife() > 0 && player2.getLife() > 0) {
			player2.setLife(player2.getLife() - player1.getDamage());
			if (player2.getLife() <= 0) {
				// player2 KO, player1 wins
				return player1;
			} else {
				player1.setLife(player1.getLife() - player2.getDamage());
				if (player1.getLife() <= 0) {
					// player1 KO, player2 wins
					return player2;
				}
			}
		}
		return null;
	}
}
