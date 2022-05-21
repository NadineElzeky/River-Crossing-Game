package game;

public class Goat extends Herbivore {


	public boolean cansail() {

		return false;
	}

	public int geteatingrank() {
		return 1;
	}


	@Override
	public int getweight() {
	
		return 20;
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
