public class KontoTest {
    public static void main(String[] args) {

/**
 * Tester om kontobalancen kan blive negativ
 */
        //laver konto 1
        spil.Konto k1 = new spil.Konto();
        k1.setPengebeholdning(1000);
        k1.hævBeløb(1500);


        // laver konto 2
        spil.Konto k2 = new spil.Konto();
        k2.setPengebeholdning(1000);
        k2.indsætBeløb(1200);

        System.out.print("Konto 1 har en pengebeholdning på: " + k1.getPengebeholdning() + ". ");
        System.out.print("Konto 2 har en pengebeholdning på: " + k2.getPengebeholdning() + ". ");

        //indsætter 1500 for at vise, at balance stopper på 0 og ikke bliver lavere
        k1.indsætBeløb(1500);

        System.out.print("Konto 1 har en pengebeholdning på: " + k1.getPengebeholdning() + ". ");

    }
}
