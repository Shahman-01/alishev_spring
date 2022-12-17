package org.example.alishev;

public class ClassicalMusic implements Music {
	private ClassicalMusic() {}

	public static ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}

	public void doInit() {
		System.out.println("doing initialization");
	}

	public void doDestroy() {
		System.out.println("doing my destroy");
	}

	@Override
	public String getSong() {
		return "Classic";
	}
}
