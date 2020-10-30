package spil;
/**
 * Vi tester her om metoden kastTerning generer et tilfældigt tal mellem 1-6.
 * Terningen starter med 3 øjne opad.
 */
public class TerningTest {
    public static void main(String[] args)
    {
        spil.Terning t1 = new spil.Terning(3);

        System.out.println("Terningen starter med at vise: " + t1.getFaceValue() + ". ");
        t1.kastTerning();

        System.out.println("Terningen kastes og viser derefter: " + t1.getFaceValue() + ". ");

    }
}
