
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


import java.util.Scanner;
import java.util.LinkedList;

public class Ploynomial_Addition
{
    static LinkedList<Polynomial> create_polynomial(int max_power)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Polynomial> list=new LinkedList<>();
        for(int p=max_power;p>=0;p--)//count down
        {
            System.out.print("\nFor power "+p+" Coefficient is :");
            float co=sc.nextFloat();
                if(co!=0.0)
                list.add(new Polynomial(p,co));

        }
        return list;
    }

    static LinkedList<Polynomial> addition(LinkedList<Polynomial> list1, LinkedList<Polynomial> list2)
    {
        LinkedList<Polynomial> list3 = new LinkedList<>();

        int i = 0, j = 0;

        while(i < list1.size() && j < list2.size())
        {
            Polynomial p1 = list1.get(i);
            Polynomial p2 = list2.get(j);

            if(p1.power == p2.power)
            {
                float sum = p1.coeff+ p2.coeff;
                if(sum != 0.0)
                    list3.add(new Polynomial(p1.power, sum));

                i++;
                j++;
            }
            else if(p1.power > p2.power)
            {
                list3.add(p1);
                i++;
            }
            else
            {
                list3.add(p2);
                j++;
            }
      }
    }

    static void print_list(LinkedList<Polynomial> list)
    {
        System.out.println();
        for(Polynomial node:list)
        {
            System.out.print(node+" + ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Higest power for polynomial 1:");
        int power1=sc.nextInt();
        LinkedList<Polynomial> polynomial_list_1=create_polynomial(power1);
        System.out.print("\nEnter Higest power for polynomial 2:");
        int power2=sc.nextInt();
        LinkedList<Polynomial> polynomial_list_2=create_polynomial(power2);
        print_list(polynomial_list_1);
        print_list(polynomial_list_2);
        LinkedList<Polynomial>polynomial_list_3=addition(polynomial_list_1,polynomial_list_2);

    }
}
