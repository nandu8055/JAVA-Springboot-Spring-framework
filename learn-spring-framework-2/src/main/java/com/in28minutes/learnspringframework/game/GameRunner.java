package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	//MarioGame game;
	private GamingConsole game;
//	public GameRunner(MarioGame game) {
//		this.game=game;
//	}
	public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game) {
		this.game=game;
	}

	public void run() {
		System.out.println("Running game:"+ game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
