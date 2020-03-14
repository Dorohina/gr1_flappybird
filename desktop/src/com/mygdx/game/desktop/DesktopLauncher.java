package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGameFlappyBird;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = MyGdxGameFlappyBird.WIDTH;
		config.height = MyGdxGameFlappyBird.HEIGHT;
		config.title = MyGdxGameFlappyBird.TITLE;


		new LwjglApplication(new MyGdxGameFlappyBird(), config);
	}
}
