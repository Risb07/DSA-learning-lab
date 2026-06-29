public class Polynomial
{
    int power;
    float coeff;
    Polynomial(int power,float coeff)
    {
        this.power=power;
        this.coeff=coeff;
    }
    @Override
    public String toString()
    {
        return coeff+" X ^ "+power;//print node   coeff X ^ power
    }

}
