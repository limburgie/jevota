package be.jevota.service.exception;

import be.jevota.domain.PingpongPlayer;

public class InvalidEmailException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private PingpongPlayer player;
	
	public InvalidEmailException(PingpongPlayer player) {
		this.player = player;
	}
	
	public PingpongPlayer getPlayer() {
		return player;
	}

}
