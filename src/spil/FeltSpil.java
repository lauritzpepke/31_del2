package spil;

/**
 * Repræsenterer selve spillet
 */
public class FeltSpil
{
    public String feltSpil()
    {
        UI spilUI = new UI();

        String navnSpillerEt;
        String navnSpillerTo;


        // UC1 Spillet kan kunne initiere et nyt spil terningspil
        // mellem to personer


        // Spillerne skal indskrive deres unikke navne
        navnSpillerEt = spilUI.navngiv(1);
        navnSpillerTo = spilUI.navngiv(2);

        // check om navnene er ens indtil de ikke er
        while (navnSpillerEt.equals(navnSpillerTo))
        {
            navnSpillerTo = spilUI.sammeNavnFejlbesked();
        }

        // Når spillet starter skal to spillere genereres.
        //public Spiller spillerEt = new Spiller(navnSpillerEt);

        // Spillerne skal indskrive deres navne, som skal være forskellige fra hinanden

        //Spillerne skal have deres start pengebeholdning af 1000 på deres konto.


        return "Vinder fundet SKAL ÆNDRES";
    }
}
