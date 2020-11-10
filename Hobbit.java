
/**
 * Write a description of class Hobbit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hobbit extends Creature
{
       // instance variables - replace the example below with your own
    private static final int MAX_Hobbit_HP = 70;
    private static final int MIN_Hobbit_HP = 40;
    private static final int MAX_Hobbit_STR = 30;
    private static final int MIN_Hobbit_STR = 15;

    /**
     * Constructor for objects of class ELF
     */
    public Hobbit()
    {
        super(
            Randomizer.nextInt(MAX_Hobbit_STR-MIN_Hobbit_STR)+MIN_Hobbit_STR,
            Randomizer.nextInt(MAX_Hobbit_HP-MIN_Hobbit_HP)+MIN_Hobbit_HP
        );
          
    }
    
    public int damage() {
           int tempdamage;
           tempdamage = super.damage();
           
           if (Randomizer.nextInt(10)==0) {
               System.err.println("Magic!");
               tempdamage *=2;
            }
           
            return tempdamage;
    }
}