package spil;

import java.util.Scanner;

/**
 * Repræsenterer user interfacet i spillet.
 * Al tekst til brugere skal være her.
 * Translate from here.
 */
public class UI
{
    //private String navnSpillerEt;
    //private String navnSpillerTo;

    public Scanner input = new Scanner(System.in);

    /** navngiver en spiller efter brugerinput
     * @return En strengværdi med det valgte navn
     */
    public String navngiv(int spillerNummer)
    {
        System.out.println("Spiller " + spillerNummer + " indtast dit navn: ");
        return input.next();
    }

    /** Fejlbesked samt kald af navngiv metoden ved ens navne
     * @return En strengværdi med det valgte navn
     */
    public String sammeNavnFejlbesked()
    {
        System.out.println("Spiller 2 må ikke have samme navn som spiller 1");
        return navngiv(2);
    }


}