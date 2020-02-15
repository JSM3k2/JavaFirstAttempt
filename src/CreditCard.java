public class CreditCard
{
    private String credit_number;

    public CreditCard()
    {

    }

    public CreditCard(String credit_number)
    {
        this.credit_number = credit_number;
    }

    public String getCredit_number()
    {
        return credit_number;
    }

    public void setCredit_number(String credit_number)
    {
        this.credit_number = credit_number;
    }

    @Override
    public String toString()
    {
        return "CreditCard{" + " credit_number = " + credit_number + '}';
    }
}
