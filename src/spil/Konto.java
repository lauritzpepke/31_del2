package spil;

/**
 * Repræsenterer konto for spillernes pengebeholdning i spillet.
 */
public class Konto
{
    private int pengebeholdning;

    /** Laver en konto med pengebeholdning
     * @param pengebeholdning Kontoens pengebeholdning
     */
    public Konto(int pengebeholdning)
    {
        this.pengebeholdning = pengebeholdning;
    }

    /** Henter kontoens pengebeholdning
     * @return en int, der repræsenterer kontoens pengebeholdning
     */
    public int getPengebeholdning()
    {
        return pengebeholdning;
    }

    /** Sætter kontoens pengebeholdning.
     * @param pengebeholdning en int, der indeholder kontoens pengebeholdning
     */
    public void setPengebeholdning(int pengebeholdning)
    {
        this.pengebeholdning = pengebeholdning;
    }
}
