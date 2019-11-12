/*
 * John Curran
 * 
 * This class simulates a county, which includes a population, 
 * turnout percentage, county name, and percentage of the vote 
 * received by each political party. This class allows the
 * user to set these different attributes in order to adapt to change
 * in the county
 */

package Elections;

public class County implements Election {
    float turnout;
    int population;
    float Dem;
    float GOP;
    float thirdParty;
    String name;

    public County(String n, int pop) {
        turnout = (float)1.0;        
    	population = pop;
        Dem = (float)0.0;
        GOP = (float)0.0;
        thirdParty = (float)0.0;
        name = n;
    }

    public void setTurnout(float t) {
        turnout = t;
    }
    
    public void setPopulation(int p) {
    	population = p;
    }

    public void setGOPPercent(float percent) {
        if (percent < 0.0)
            throw new ArithmeticException("Negative percentage...");
        
        if (Dem + percent > 1.0)
            throw new ArithmeticException("Beyond 100%...");

        GOP = percent;
        thirdParty = (float)1.0 - GOP - Dem;
    }

    public void setDemPercent(float percent) {
        if (percent < 0)
            throw new ArithmeticException("Negative percentage...");

        if (GOP + percent > 1.0)
            throw new ArithmeticException("Beyond 100%...");

        Dem = percent;
        thirdParty = (float)1.0 - GOP - Dem;
    }

    public float getTurnout() {
        return turnout;
    }

    public int getPopulation() {
        return population;
    }

    public float getDemPercent() {
        return Dem;
    }

    public float getGOPPercent() {
        return GOP;
    }

    public float getThirdPartyPercent() {
        return thirdParty;
    }
    
    public String name() {
    	return name;
    }
}