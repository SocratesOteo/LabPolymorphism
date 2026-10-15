package labPolymorphism;

/**
 * @author CSIS + socrates
 *
 * Main Dog Class for Dog instance
 *
 */
public class Dog
{
    private final String breed;

    /**
     * Main Dog initialized method
     * @param b as Breed of the Dog
     */
    public Dog(String b)
    {
        breed = b;
    }

    /**
     * Method of how the dog is communicating.
     */
    public void communicate()
    {
        System.out.println("bark bark");
    }

    /**
     * Method that moves the dog.
     */
    public void move()
    {
        System.out.println("run");
    }

    /**
     * Get method to get the breed
     * @return Breed of the dog.
     */
    public String getBreed()
    {
        return breed;
    }


    @Override
    public String toString() {
        String classname = this.getClass().getSimpleName();
        return classname + ": " + breed;
    }
}
