
/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or knocked out. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Sergius Manolov
 * @version 2020-11-9
 */
// we will learn what the abstract keyword does in a later chapter
public abstract class Creature
{
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;         // the current numberof hit points the creature has
    
    /**
     * default constructor - this should never actually run.
     * It is the job of dervived classes to set up the proper number of hit points and 
     * strength for the subclass
     */
    public Creature (){
        str=10;
        hp=10;
        max_hp = hp;
    }
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
    public Creature (int str, int hp) {
        this.str = str;
        this.hp=hp;
        max_hp = hp;
       //implement this
    }
    
    
   public String getHP()
    {
        String hpHolder = "" + hp;
        return hpHolder;
    }
    
    public int damage(){
        return Randomizer.nextInt(str) + 1;
    }
    
    public boolean isAlive() {
        return hp > 0;
    }
    
    public boolean isDead() {
        return !isAlive();
    }
    
    public void takeDamage(int damage) {
        hp -= damage;
    }
    
}
