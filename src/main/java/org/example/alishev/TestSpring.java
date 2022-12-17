package org.example.alishev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);

		MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
		MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

		boolean compare = musicPlayer1 == musicPlayer2;

		System.out.println(compare);

		context.close();
	}
}
