package org.doublelong.xelja;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopGame
{
	public static void main(String[] args)
	{
		Xelja game = new Xelja();
		new LwjglApplication(game, game.WINDOW_TITLE, game.WINDOW_WIDTH, game.WINDOW_HEIGHT, false);
	}

}