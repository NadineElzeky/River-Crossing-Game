package game;

public class CarnivoreFactory extends AbstractFactory {


	public Carnivore getCarnivoire(String cname) {
	        if (cname.equals("Fox")) {
	            return new Fox();
	        }
	        else if(cname.equals("Lion"))
	        {
	        	return new Lion();
	        }
	        else 
	        return null;
	    }

    public Herbivore getHarbivoire(String hname) {
      
    	return null;
    }
}
