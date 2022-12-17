package org.example.alishev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);

		Music music = context.getBean("classicalMusic", Music.class);

		MusicPlayer musicPlayer = new MusicPlayer(music);

		Music music2 = context.getBean("rockMusic", Music.class);

		MusicPlayer rockMusicPlayer = new MusicPlayer(music2);

		rockMusicPlayer.playMusic();
		musicPlayer.playMusic();

		context.close();
	}
}
