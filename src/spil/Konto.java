package spil;

/**
 * Repræsenterer konto for spillernes pengebeholdning i spillet.
 */
public class Konto {

    private int pengebeholdning;


    /** Laver en konto med pengebeholdning
     * @param aktuelPengebeholdning Kontoens pengebeholdning
     */
    public Konto(int aktuelPengebeholdning)
    {
        this.pengebeholdning = aktuelPengebeholdning;
    }

    /** Henter kontoens pengebeholdning på minimum 0
     * @return en int, der repræsenterer kontoens pengebeholdning
     */
    public int getPengebeholdning()
    {
        if(pengebeholdning < 0)
        {
            pengebeholdning = 0;
        }
        return pengebeholdning;
    }

    /** Sætter kontoens pengebeholdning.
     * @param pengebeholdning en int, der indeholder kontoens pengebeholdning
     */
    public void setPengebeholdning(int pengebeholdning)
    {
            this.pengebeholdning = pengebeholdning;
    }

    // metode for indsæt beløb
    public void indsætBeløb(int beløb) {
        pengebeholdning = pengebeholdning + beløb;
    }

    // metode for hæv beløb
    public void hævBeløb(int beløb) {
        pengebeholdning = pengebeholdning - beløb;
    }
}