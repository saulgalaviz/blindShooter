package edu.cpp.cs.cs141.final_prog;
/**
 * @author Saul, Mostafa, Charlie, and Jae.
 *
 */
import java.io.Serializable;
/////////////////////////////////////////////////////////////////////
public class GameEntities implements Serializable{
	private static final long serialVersionUID = -4061192399852567678L;
	private String name;
	//-------------------------------------------------------------------
	public String getName() {
		return name;
	}
	//-------------------------------------------------------------------
	public void setName(String name){
		this.name = name;
	}
	//-------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////