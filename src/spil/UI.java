/*
Al user interface skal samles her, så det er let at oversætte sprog fremover.
 */
package spil;

import java.util.Scanner;

public class UI
{
    //private String navnSpillerEt;
    //private String navnSpillerTo;

    static Scanner input = new Scanner(System.in);

    /** navngiver en spiller efter brugerinput
     * @return En strengværdi med det valgte navn
     */
    static String navngiv(int spillerNummer)
    {
        System.out.println("Spiller " + spillerNummer + " indtast dit navn: ");
        return input.next();
    }

    /** Fejlbesked samt kald af navngiv metoden ved ens navne
     * @return En strengværdi med det valgte navn
     */
    static String sammeNavnFejlbesked()
    {
        System.out.println("Spiller 2 må ikke have samme navn som spiller 1");
        return navngiv(2);
    }
}