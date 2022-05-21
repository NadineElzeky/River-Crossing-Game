package game;

import java.util.List;

public interface ICrosserController {

public void newGame (ICrosserStrategy gameStrategy); 
	 
 public void resetGame (); 
	 
 public String getInstructions(); 
	
 public List<ICrosser>getCrossersOnLeftBank (); 
 public List<ICrosser>getCrossersOnRightBank();
 public boolean isBoatOnTheLeftBank (); 
 
  public int getNumberOfSails (); 
  
 public boolean canMove (List<ICrosser> crossers, boolean fromLeftToRightBank); 
  
  public void  doMove (List<ICrosser> crossers, boolean fromLeftToRightBank); 
  
 public boolean canUndo (); 
  
  public boolean canRedo  (); 
  public void undo  (); 
  
 public void redo (); 
   
 public void saveGame (); 
   
 public void loadGame (); 
 public List<List<ICrosser>> solveGame(); 
	 

}