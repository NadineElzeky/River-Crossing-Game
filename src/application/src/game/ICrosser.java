package game;

public interface ICrosser {
	
	
	
	public boolean cansail();
	public int geteatingrank();
	public int getweight();
	public ICrosser makeCopy (); 
    public  void setLabelToBeShown (String label);
	public String getLabelToBeShown ();

}
