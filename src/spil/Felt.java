package spil;
/*
Eksempel på et felt:
2   Tower   +250
 */

/**
 * Repræsenter et felt i spillet.
 */
public class Felt
{
    private String navn;
    private String effekt;
    private int nummer;

    /** Lavet er felt med det specificerede navn, effekt og nummer.
     * @param navn Feltets navn.
     * @param effekt Feltets effekt.
     * @param nummer Feltets nummer på brættet.
     */
    public Felt(String navn, String effekt, int nummer)
    {
        this.navn = navn;
        this.effekt = effekt;
        this.nummer = nummer;
    }

    /** Henter feltets navn.
     * @return En string, der repræsenterer feltets navn.
     */
    public String getNavn()
    {
        return navn;
    }

    /** Sætter feltets navn
     * @param navn En string, der indeholder feltets navn.
     */
    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    /** Henter feltets effekt
     * @return En string, der repræsenterer feltets effekt.
     */
    public String getEffekt()
    {
        return effekt;
    }

    /** Sætter feltets effekt.
     * @param effekt En string, der indeholder feltets effekt.
     */
    public void setEffekt(String effekt)
    {
        this.effekt = effekt;
    }

    /** Henter feltets nummer.
     * @return En string, der repræsenterer feltets nummer på brættet.
     */
    public int getNummer()
    {
        return nummer;
    }

    /** Sætter feltets nummer.
     * @param nummer En int, der indeholder feltets nummer på brættet.
     */
    public void setNummer(int nummer)
    {
        this.nummer = nummer;
    }
}
