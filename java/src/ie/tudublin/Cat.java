package ie.tudublin;

public class Cat extends Animal
{

    private int NumLives;

    public Cat(String name)
    {
        super(name);
        NumLives = 9;
    }

    public int GetLives(){
        return NumLives;
    }

    public void Kill(){
        if (NumLives != 0) {
            System.out.println("Ouch");
            NumLives--; 
        }
        if (NumLives == 0) {
        System.out.println("dead");
        }
    }
}