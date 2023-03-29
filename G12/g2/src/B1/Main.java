package B1;

public class main {
    public static void main(String[] args){
        long n = 20;
        float a = 5, b = 10, c = 4;
        Basic.PTB2(a, b, c);

        boolean rs = Basic.LaChan(n);
        if (rs) 
            System.out.println(n + " la so chan");
        else 
        {
            String s =  String.format("%d la so le", n);
            System.out.println(s);
        }
    }
}

