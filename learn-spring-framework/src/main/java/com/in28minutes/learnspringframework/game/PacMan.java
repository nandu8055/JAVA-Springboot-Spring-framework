package com.in28minutes.learnspringframework.game;

public class PacMan implements GamingConsole{
	public void up() {
		System.out.println("go up");
	}
	
	public void down() {
		System.out.println("Go down");
	}
	
	public void left() {
		System.out.println("Go left");
	}
	
	public void right() {
		System.out.println("Go right");
	}
}