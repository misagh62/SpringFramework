package com.miso.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFramework {

	//Ioc -> keep business logic clean by moving complicated and complex configuration into Ioc
	// in Ioc we do not call NEW keyword or not call Constructor
	// we let container in spring do that for us ,that mean Ioc
	// goal here to create java bean that could be managed by spring IoC container
	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(Game.class,Score.class);
			//Score score = spring.getBean(Score.class);
			//Score score = new Score();
			//score.wins++;
		Game game = spring.getBean(Game.class);
		game.playTheGame();
		game.playTheGame();
			System.out.println(game.score.wins);
		
	}

	 class Score {
		int wins, loses, ties;

	}
	 
	 class Game{
		 //Score score = new Score();
		 Score score;

		 public void playTheGame() {
			 score.wins++;
		 }
	 }

}
