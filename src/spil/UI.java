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

    /* madpause HER
    static String sammeNavnFejlbesked(String navn1, String navn2)

    {
        System.out.println();
    }
    */



}