package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacMan;
import com.in28minutes.learnspringframework.game.SuperContraGame;

/**
 * 
 */
public class App01GamingBasic {

	public static void main(String[] args) {
		
		//var game=new MarioGame();
//		var gameRunner=new GameRunner(marioGame);
		//var game=new SuperContraGame();
		var game=new PacMan();//object creation
		var gameRunner=new GameRunner(game);//object creation and wiring dependency
		gameRunner.run();
	}

}
