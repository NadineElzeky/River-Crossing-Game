package game;

public class Lion extends Carnivore {


	public boolean cansail() {	
		return false;
	}

	
	public int geteatingrank() {
		return 2;
	}

	
	


	@Override
	public int getweight() {
		// TODO Auto-generated method stub
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
