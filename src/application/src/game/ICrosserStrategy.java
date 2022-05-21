package game;

import java.util.List;

public interface ICrosserStrategy {
	
	 public boolean isValid(List<ICrosser> right, List<ICrosser> left, List<ICrosser> boatRiders);

	    public List<ICrosser> getInitialCrossers();

	    public String getInstructions();
	}

