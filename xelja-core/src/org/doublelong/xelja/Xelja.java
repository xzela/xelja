package org.doublelong.xelja;

import org.doublelong.xelja.screens.LoadingScreen;

import com.badlogic.gdx.Game;


public class Xelja extends Game
{
	public final int WINDOW_HEIGHT = 800;
	public final int WINDOW_WIDTH = 800;
	public final String WINDOW_TITLE = "Xel"
			+ "ja - the adventure";
	@Override
	public void create()
	{
		this.setScreen(new LoadingScreen(this));
	}

}
