package game;

public class HerbivoreFactory extends AbstractFactory {

	@Override
	public Carnivore getCarnivoire(String cname) {

		return null;
	}

	
	public Herbivore getHarbivoire(String hname) {
		 if (hname.equals("Sheep")) {
	            return new Sheep();
	        }
	        else if(hname.equals("Goat"))
	        {
	        	return new Goat();
	        }
	        else 
		return null;
	}
}

	
	


