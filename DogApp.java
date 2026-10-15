package labPolymorphism;



/**
 * Main DogApp that shows the Dogs and their breeds as Types.
 * @author CSIS + socrates
 */
public class DogApp
{
    /**
     * Main method for the DogApp that produces an output
     * @param args
     */
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        actAsDog(myCircusDog);

        System.out.println("Using an Array \n");

        Dog[] myArray = {myDog,mySledDog,myCircusDog};
        for (Dog d : myArray){
                actAsDog(d);
        }




    }

    private static void actAsDog(Dog d)
    {
        System.out.println(d.toString());
        if(d instanceof SledDog){
            SledDog sledDog = (SledDog)d;
            sledDog.pullSled();
            //((SledDog) d).pullSled();
        }
        d.communicate();
        d.move();
        System.out.println();
    }



}
