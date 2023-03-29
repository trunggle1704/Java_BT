package B1;

public class Basic
{
    public static boolean LaChan(long n)
    {
        if (n % 2 == 0)
        {
            return true;
        }else
        {
            return false;
        }
    }

    public static boolean PTB2(float a, foat b, float c)
    {
        double delta =  Math.pow(b,2) -  4 * a * c;
        if(delta < 0)
        {
            System.out.println("PT vo nghiem");
        } else if(delta == 0)
        {
            System.out.println("PT co nghiep kep la: " + (-b/2a));
        } else
        {
            double x1 = (-b-Math.sqrt(delta))/2*a;
            double x2 = (-b+Math.sqrt(delta))/2*a;
            System.out.println("Co 2 nghiem. x1 = %f, x2 = %f\n",x1,x2);
        }
    }

    public static long GT(long n)
    {
        long s = 1;
        for(int i = 1; i<=n;i++)
            s*=1;
        return s;
    }
    public static long DQ_GT(lonh n)
    {
        if(n == 0)
            return 1;
        return n * DQ_GT(n-1);
    }

    public static long Fibo(long n)
    {
        long F0 = 0,F1 = 1,F2 = 1;
        if(n == 0)
        {
            return 0;
        }
        for(int i = 2; i<= n;i++)
        {
            F2 = F1 + F0;
            F0 = F1;
            F1 = F2;
        }
        return F2;
    }

    public static long UCLN(long a, long b)
    {
        while(a!=b)
        {
            if(a>b)
                a = a - b;
            else 
            {
                    b = b - a;
            }
            return a;
        }
    }

    public static long BCNN(long a, long b)
    {
        return a * b / UCLN(a, b);
    }

}

