package spil;
import java.util.Random;

public class Terning
{
    private final int MAX = 6; // maximum øjne værdi
    private int faceValue; //nuværende øjne værdi

    // konstruktør
    public Terning(int value)
    {
        faceValue = value;
    }

    /**
     * Denne metode vil simulere et kast med terningen
     */
    public int kastTerning()
    {
        faceValue = (int)(Math.random() * MAX) + 1;
        return faceValue;
    }
    // afslutning på metode kastTerning()

    // set øjne værdi
    public void setFaceValue (int value)
    {
        faceValue = value;
    }

    // get øjne værdi
    public int getFaceValue()
    {
        return faceValue;
    }

    // return string med objektets data
    public String toString()
    {
        String result = "Øjne: " + faceValue;
        return result;
    }
}