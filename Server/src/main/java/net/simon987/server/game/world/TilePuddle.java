package net.simon987.server.game.world;
import net.simon987.server.game.objects.GameObject;
public class TilePuddle extends Tile {

    public static final int ID = 5;
    @Override
    public int getId() {
        return ID;
    }
    
    
    public boolean isDead() { //not certain 
        if(getMapInfo()==0x0250) {
        	setDead(true);
        	return true;
        }
        return false;
    }
}
