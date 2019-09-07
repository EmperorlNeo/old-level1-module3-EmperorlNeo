import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {

	public static void main(String[] args) {
	
		Random random = new Random();
		int x = random.nextInt(9);
		System.out.println(x);
		int y = random.nextInt(9);
		System.out.println(y);
		
		World<Object> bugWorld = new World<>();
		bugWorld.show();
		
		Bug bug1 = new Bug(Color.BLUE);
		Location bugLocation1 = new Location(2, 2);
		bugWorld.add(bugLocation1, bug1);
		Bug bug2 = new Bug(Color.RED);
		Location bugLocation2 = new Location(x, y);
		bugWorld.add(bugLocation2, bug2);
		bug2.turn();
		bug2.turn();
		
		Flower flower1 = new Flower(Color.pink);
		Flower flower2 = new Flower(Color.pink);
		Location flowerLocation1 = new Location(x, y - 1);
		Location flowerLocation2 = new Location(x, y + 1);
		bugWorld.add(flowerLocation1, flower1);
		bugWorld.add(flowerLocation2, flower2);
		
		for (int r = 0; r <= 9; r++) {
			for (int c = 0; c <= 9; c++) {
				if(r==x && c==y) {
				}
				else if(r==2 && c==2) {
				}
				else if(r==x && c==y-1) {
				}
				else if(r==x && c==y+1) {
				}
				else {
					Location randomFlowerLocation = new Location(r, c);
					bugWorld.add(randomFlowerLocation, new Flower(Color.MAGENTA));
				}
			}
		}

	}

}
