package spil;
public class Konto
{
    public int pengebeholdning;

    public Konto(int pengebeholdning)
    {
        this.pengebeholdning = pengebeholdning;
    }

    public int getPengebeholdning()
    {
        return pengebeholdning;
    }

    public void setPengebeholdning(int pengebeholdning)
    {
        this.pengebeholdning = pengebeholdning;
    }
}
