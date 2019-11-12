/*
 * John Curran
 * 
 * This is an interface for a specific object that has an election. This
 * is either a state or a county
 */

package Elections;

public interface Election {
    public int getPopulation();

    public float getTurnout();

    public float getDemPercent();

    public float getGOPPercent();

    public float getThirdPartyPercent();
}

