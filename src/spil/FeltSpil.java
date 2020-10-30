package spil;

/**
 * Repræsenterer selve spillet
 */
public class FeltSpil
{
    public static void main(String[] args)
    {
        String navnSpillerEt;
        String navnSpillerTo;


        // UC1 Spillet kan kunne initiere et nyt spil terningspil
        // mellem to personer


        // Spillerne skal indskrive deres unikke navne
        navnSpillerEt = UI.navngiv(1);
        navnSpillerTo = UI.navngiv(2);

        // check om navnene er ens indtil de ikke er
        while (navnSpillerEt.equals(navnSpillerTo))
        {
            navnSpillerTo = UI.sammeNavnFejlbesked();
        }



        // Når spillet starter skal to spillere genereres.
        //public Spiller spillerEt = new Spiller();

        // Spillerne skal indskrive deres navne, som skal være forskellige fra hinanden

        //Spillerne skal have deres start pengebeholdning af 1000 på deres konto.

    }


}
