package com.treyzania.specialsnake.util;

import java.util.HashMap;

public class SnakeGame {

	public final long instantiationTime;
	
	public World theWorld;
	public HashMap<String, Entity> specialEntities;
	
	public boolean isPaused;
	
	public SnakeGame() {
		
		this.specialEntities = new HashMap<String, Entity>();
		this.theWorld = new World(50, 50);
		
	}
	
	{
		this.instantiationTime = System.currentTimeMillis();
		this.isPaused = false;
	}
	
}