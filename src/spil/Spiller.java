package spil;

public class Spiller
{
    public String navn;

    /** Laver en spiller med det specificerede navn.
     * @param navn Spillerens navn
     */
    public Spiller(String navn)
    {
        this.navn = navn;
    }

    /** Henter spillerens navn.
     * @return En string, der repræsenterer spillerens navn.
     */
    public String getNavn()
    {
        return navn;
    }

    /** Sætter spillerens navn
     * @param navn En string, der indeholder spillerens navn.
     */
    public void setNavn(String navn)
    {
        this.navn = navn;
    }
}