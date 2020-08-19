package geekbrain;

public class homework01_03 {
    public static void main(String[] args) {
        expression(1,2,3,4);


    }
    static double expression (double a, double b, double c, double d)
    {
        double e = a*(b+(c/d));
        System.out.println(e);
        return e;



    }
}
