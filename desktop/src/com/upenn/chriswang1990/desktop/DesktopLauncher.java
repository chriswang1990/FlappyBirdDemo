package com.upenn.chriswang1990.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.upenn.chriswang1990.FlappyBirdDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FlappyBirdDemo.WIDTH;
		config.height = FlappyBirdDemo.HEIGHT;
		config.title = FlappyBirdDemo.TITLE;
		new LwjglApplication(new FlappyBirdDemo(), config);
	}
}
