package spil;

public class KontoTest {
    public static void main(String[] args) {


        //laver konto 1
        spil.Konto k1 = new spil.Konto();
        k1.setPengebeholdning(1000);
        k1.indsætBeløb(500);

        // laver konto 2
        spil.Konto k2 = new spil.Konto();
        k2.setPengebeholdning(1000);
        k2.hævBeløb(100);

        System.out.print("Konto 1 har en pengebeholdning på: " + k1.getPengebeholdning() + ". ");
        System.out.print("Konto 2 har en pengebeholdning på: " + k2.getPengebeholdning());

    }
}
