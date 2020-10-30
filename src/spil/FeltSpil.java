package spil;

/**
 * Repræsenterer selve spillet
 */
public class FeltSpil
{
    UI spilUI = new UI();

    String navnSpillerEt;
    String navnSpillerTo;

    public String feltSpil()
    {
        // Når spillet starter skal to spillere genereres.
        Spiller spiller1 = new Spiller(genererSpiller(1));
        Spiller spiller2 = new Spiller(genererSpiller(2));

        // return kørSpil(spiller1, spiller2);
        // vi kan ikke nå resten, så returnerer ingenting.
        return "";
    }

    // UC1 Spillet kan kunne initiere et nyt spil terningspil
    // mellem to personer
     public String genererSpiller(int spillerNummer)
     {
         if (spillerNummer == 1)
         {
             // Spillerne skal indskrive deres unikke navne
             return spilUI.navngiv(spillerNummer);
         }
         else if (spillerNummer == 2)
         {
             navnSpillerTo = spilUI.navngiv(2);

             // check om navnene er ens indtil de ikke er
             while (navnSpillerEt.equals(navnSpillerTo))
             {
                 navnSpillerTo = spilUI.sammeNavnFejlbesked();
             }
             return navnSpillerTo;
         }
         //den skal ikke nå hertil.
         return "N/A fejl i spillernummer";
     }



     /*
     // spil til vinder findes og returner denne
    public String kørSpil(Spiller et, Spiller to)
    {
        int terningVærdi = 1;
        //Spillerne skal have deres start pengebeholdning af 1000 på deres konto.
        // Lauritz kører

        //while loop indtil vinder findes

        // terninger slåes
        // Lauritz?


        // De rammer et felt og deres pengebeholdning ændres
        // Nadia starter, Lauritz hjælper senere
        String effekt = ramFelt(terningVærdi);


        // while loop slutter og vinder returneres som string.


        return "Vinder fundet SKAL ÆNDRES";
    }

    public String ramFelt(int feltNummer)
    {

        return effekt;
    }
    */
}
