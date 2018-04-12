package edu.cpp.cs.cs141.final_prog;
/**
 * @author Saul, Mostafa, Charlie, and Jae.
 *
 */
import java.io.Serializable;
/////////////////////////////////////////////////////////////////////
public class Movement implements Serializable {
	private static final long serialVersionUID = 6832526359603920079L;
	private int[] newLocation = new int[2];
	//-------------------------------------------------------------------
	public int[] moving(char command, int[] location){
		switch(command){
		case 'w':
			newLocation = moveUp(location);
			break;
		case 'a':
			newLocation = moveLeft(location);
			break;
		case 's':
			newLocation = moveDown(location);
			break;
		case 'd':
			newLocation = moveRight(location);
			break;
		}
		return newLocation;
	}
	//-------------------------------------------------------------------
	public int[] moveUp(int[] location){
		newLocation[0] = location[0] - 1;
		newLocation[1] = location[1];
		return newLocation;
	}
	//-------------------------------------------------------------------
	public int[] moveLeft(int[] location){
		newLocation[0] = location[0];
		newLocation[1] = location[1] - 1;
		return newLocation;
	}
	//-------------------------------------------------------------------
	public int[] moveDown(int[] location){
		newLocation[0] = location[0] + 1;
		newLocation[1] = location[1];
		return newLocation;
	}
	//-------------------------------------------------------------------
	public int[] moveRight(int[] location){
		newLocation[0] = location[0];
		newLocation[1] = location[1] + 1;
		return newLocation;
	}
	//-------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////