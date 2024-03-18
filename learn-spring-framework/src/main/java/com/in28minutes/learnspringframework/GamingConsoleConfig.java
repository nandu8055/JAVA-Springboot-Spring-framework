package com.in28minutes.learnspringframework;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacMan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConsoleConfig {
	
	@Bean
	public GamingConsole game() {
		var game=new PacMan();
		return game;
	}
	@Bean
	public GameRunner gameRunner() {
		GameRunner gameRunner =new GameRunner(game());
		return gameRunner;
	}
}
