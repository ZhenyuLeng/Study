import java.util.*;

public class Fibonacci {
  public static String[] F(int N) {
    String a[] = new String[N+1];
    a[0] = "0";
    if (N == 0) return a;
    a[1] = "1";
    if (N == 1) return a;
    for (int i = 2; i <= N;  i++) {
      a[i] = stringAdd(a[i-1], a[i-2]);
      System.out.println(i + "t" + a[i]);
    }
    return a;
  }

  public static String stringAdd(String a, String b) {
    String c = "";

    int i = a.length() - 1;
    int j = b.length() - 1;
    int ta, tb, tc, k = 0;

    for (; i >= 0 || j >= 0; i--, j--) {
      ta = tb = 0;
      if (i >= 0)  ta = a.charAt(i) - '0';
      if (j >= 0)  tb = b.charAt(j) - '0';
      tc = ta + tb + k;
      char nc = (char) (48 + tc%10);
      k = tc/10;
      String d = String.valueOf(nc);
      c = d + c;
    }
    if (k == 1) c = "1" + c;
    return c;
  }

  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    String a[] = F(N);
    for (int i = 0; i <= N; i++) {
      System.out.println(i + " " + a[i]);
    }
  }
}
