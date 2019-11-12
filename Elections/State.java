/*
 * This simulates a state, which is a collection of counties. This behaves
 * similarly to a county, except it is coded as an ArrayList of counties,
 * instead of an individual
 */

package Elections;

import java.util.List;

public class State implements Election {

	String name;
    List<County> counties;
    public State(String n, List<County> c) {
    	name = n;
        counties = c;
    }

    public int getPopulation() {
        int population = 0;
        for (County c : counties)
            population += c.getPopulation();

        return population;
    }

    public float getTurnout() {
        int voters = 0;
        for (County c : counties)
            voters += c.getPopulation() * c.getTurnout();

        return voters / getPopulation();
    }

    public float getDemPercent() {
        int demVoters = 0;
        
        for (County c : counties)
        	demVoters += c.getPopulation() * c.getTurnout() * c.getDemPercent();
        
        return demVoters / (getPopulation() * getTurnout());
    }

    public float getGOPPercent() {
        int GOPVoters = 0;
        
        for(County c : counties)
        	GOPVoters += c.getPopulation() * c.getTurnout()* c.getGOPPercent();

        return GOPVoters / (getPopulation() * getTurnout());
    }

    public float getThirdPartyPercent() {
        return (float)1.0 - getGOPPercent() - getDemPercent();
    }
    
    public String name() {
    	return name;
    }
    
    public List<County> counties() {
    	return counties;
    }
}
