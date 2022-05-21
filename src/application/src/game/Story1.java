package game;

import java.util.ArrayList;
import java.util.List;
public class Story1   implements ICrosserStrategy {

	public boolean isValid(List<ICrosser> right, List<ICrosser> left, List<ICrosser> boatRiders) {
       // System.out.println(" "+boatRiders.size());
	    boolean valid = false;
        for (int i = 0; i < boatRiders.size(); i++) {
            ICrosser x;                    x= boatRiders.get(i);
            if (x.cansail()) {
                valid = true;
                break;
            }

        }

        if (valid == false) {
            return false;
        }
        if (left.size() == 3) {
            return false;
        }  else if (left.size() == 2) {
            int diff=left.get(0).geteatingrank()-left.get(1).geteatingrank();
        if(diff==1 ||diff==-1)
            return false;
        }
        if(right.size()==3)
            return false;
        else if(right.size()==2)
        {
            int diff2=right.get(0).geteatingrank()-right.get(1).geteatingrank();
            if(diff2 ==1|| diff2==-1)
                return false;
        }


        return true;
    }

 
    public List<ICrosser> getInitialCrossers() {
        List<ICrosser> c = new ArrayList<>();
        Factory f = new Factory();
        c.add(new Farmer());
        c.add(new Plant());
        c.add(f.getCrosser("Fox"));
        c.add(f.getCrosser("Goat"));
        //for (int i=0;i<c.size();i++)
        //System.out.println(" "+c.get(i).geteatingrank());
        return c;

    }

 
    public String getInstructions() {
	    String Text=new String();

	    Text="A Farmer want to cross a river and take with him\nTom(Cat),Jerry(Mouse),and a Cheese\n\nRules:\n\n1)The Farmer is the only one who can steer the\n raft.He can only take one passenger(Tom,\nJerry,or the Cheese)in addition to himself.\n\n2)If Tom and Jerry are alone in the same\nriver bank,Tom Will Eat Jerry\n\n3)If Jerry and Cheese are alone on the\nsame bank,Jerry will eat Cheese\n\nHow can the Farmer get Tom,Jerry,and the\nCheese a cross the river without any of them being\neaten?" ;

        return Text;
    }

}

