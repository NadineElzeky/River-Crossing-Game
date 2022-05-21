package game;

import java.util.ArrayList;
import java.util.List;

public class Story2 implements ICrosserStrategy {

	
	public boolean isValid(List<ICrosser> right, List<ICrosser> left, List<ICrosser> boatRiders) {
        boolean valid = false;
        for (int i = 0; i < boatRiders.size(); i++) {
            ICrosser x = boatRiders.get(i);
            if (x.cansail()) {
                valid = true;
                break;
            }
        }
        if (valid == false) {
            return false;
        }
        if (boatRiders.size() >= 3) {
            return false;
        } else if (boatRiders.size() == 2) {
           int weight;
           weight=boatRiders.get(0).getweight()+boatRiders.get(1).getweight();
        	if(weight>100)
                  return false;
        }
        else
            return true;
        return true;
    }

 
    public List<ICrosser> getInitialCrossers() {
        List<ICrosser> C = new ArrayList<>();
        Factory f = new Factory();
        C.add(new Farmer2());
        C.add(new Farmer3());
        C.add(new Farmer4());
        C.add(new Farmer5());
        C.add(f.getCrosser("Goat"));
        return C;
    }


    public String getInstructions() {
	    String Text;
	    Text="A Duck family need to cross a river in a small raft.\nZeze(Rose T-Shirt) weighs 90Kg,Mickey Mouse weighs 80Kg,Batot\nweighs 60Kg,Meme(Red T-Shirt) weighs 40Kg,and they have \nPluto(Dog) who weighs 20Kg\n\nRules:\n\n1)The raft cannot bear a load heavier than 100 Kg.\n\nHow can they all get to the other side with Pluto?";
       return Text;
    }

}