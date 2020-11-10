

/**
 * Write a description of class Elf here.
 * 
 * @author Sergius Manolov 
 * @version 11/9/20
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class ELF
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP
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
