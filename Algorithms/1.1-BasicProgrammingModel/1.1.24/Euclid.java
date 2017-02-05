
public class Euclid
{
  public static int gcd(int p, int q)
  {
    System.out.println(p + "\t" + q);
    if (q == 0) return p;
    int r = p % q;
    return gcd(q, r);
  }

  public static void main(String[] args)
  {
    int p = Integer.parseInt(args[0]);
    int q = Integer.parseInt(args[1]);
    System.out.println("The greatest common divisor of " + p + " and " + q + " is " + gcd(p, q));
  }
}
