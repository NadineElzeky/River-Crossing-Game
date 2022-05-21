package game;

public class Plant implements ICrosser{

	
	public boolean cansail() {
		
		return false;
	}

	public int geteatingrank() {
		return 0;
	}

	

	@Override
	public int getweight() {

		return 0;
	}

	@Override
	public ICrosser makeCopy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLabelToBeShown(String label) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLabelToBeShown() {
		// TODO Auto-generated method stub
		return null;
	}

}
