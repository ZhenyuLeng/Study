import java.util.*;

public class VampireNumber
{
  boolean isVN;
  int first;
  int second;

  public static int factorial(int n)
  {
    int t = 0;
    if (n == 0 || n == 1) return 1;
    else t = n * factorial(n - 1);
    return t;
  }

  public static int[][] fullPermutation(int[] p)
  {
    int n = p.length;
    int t[][] = new int [factorial(n)][n];

    if (1 == n) {
      t[0][0] = p[0];
      return t;
    }

    for (int i = 0; i < n; i++) {
      int s[] = new int[n - 1];
      int k = 0;
      for (int j = 0; j < n; j++) {
        if (j != i) {
          s[k++] = p[j];
        }
      }
      int m[][] = fullPermutation(s);
      
      for (int j = i * m.length, q = 0; j < (i + 1) * m.length; j++, q++) {
        t[j][0] = p[i];
        for (int l = 0; l < k; l++) {
          t[j][l + 1] = m[q][l];
        }
      }
    }

    return t;
  }

  public static VampireNumber isVampireNumber(int i) 
  {
    VampireNumber tmp = new VampireNumber();
    tmp.isVN = false;
    tmp.first = -1;
    tmp.second = -1;
 
    int place[] = new int[20];
    int digit = 0;
    int o = i;

    while (i != 0) {
      place[digit++] = i % 10;
      i /= 10;
    }

    if (digit % 2 == 0) {
      int p[] = new int[digit];
      for (int j = 0; j < digit; j++) {
        p[j] = place[j];
      }

      int seq[][] = fullPermutation(p);
      for (int j = 0; j < seq.length; j++) {
        int a, b;
        a = b = 0;
        for (int k = 0; k < digit / 2; k++) {
          a *= 10;
          a += seq[j][k];
        }
        for (int k = digit / 2; k < digit; k++) {
          b *= 10;
          b += seq[j][k];
        }
        if (a * b == o) {
          tmp.isVN = true;
          tmp.first = a;
          tmp.second = b;
          break;
        }
      }
    }
    
    return tmp;
  }

  public static VampireNumber isVampireNumber(int i, int seq [][]) 
  {
    VampireNumber tmp = new VampireNumber();
    tmp.isVN = false;
    tmp.first = -1;
    tmp.second = -1;
 
    int place[] = new int[20];
    int digit = 0;
    int o = i;

    while (i != 0) {
      place[digit++] = i % 10;
      i /= 10;
    }

    if (digit % 2 == 0) {
      for (int j = 0; j < seq.length; j++) {
        int a, b;
        a = b = 0;
        for (int k = 0; k < digit / 2; k++) {
          a *= 10;
          a += place[seq[j][k]];
        }
        for (int k = digit / 2; k < digit; k++) {
          b *= 10;
          b += place[seq[j][k]];
        }
        if (a * b == o) {
          tmp.isVN = true;
          tmp.first = a;
          tmp.second = b;
          break;
        }
      }
    }
    
    return tmp;
  }
 
  private static int[][] first0(int[][] seq)
  {
    int N = seq[0].length;
    int f0seq[][] = new int[seq.length / 2][N];
    int j = 0;

    for (int i = 0; i < seq.length; i++) {
      boolean is0f = false;
      for (int k = 0; k < N / 2; k++) {
        if (seq[i][k] == 0) {
          is0f = true;
          break;
        }
      }
      if (is0f) {
        System.arraycopy(seq[i], 0, f0seq[j++], 0, N);
      }
    }

    return f0seq;
  }

  public static void main(String[] args)
  {
    int p4[] = {0, 1, 2, 3};
    int p6[] = {0, 1, 2, 3, 4, 5, 6};
    int seq4[][] = fullPermutation(p4);
    int seq6[][] = fullPermutation(p6);
    int f0seq4[][] = first0(seq4);
    int f0seq6[][] = first0(seq6);
    for (int i = 1000; i < 10000; i++) {
      VampireNumber tmp = isVampireNumber(i, f0seq4);
      if (tmp.isVN) {
        System.out.println(i + " = " + tmp.first + " * " + tmp.second);
      }
    }
    for (int i = 100000; i < 1000000; i++) {
      VampireNumber tmp = isVampireNumber(i, f0seq6);
      if (tmp.isVN) {
        System.out.println(i + " = " + tmp.first + " * " + tmp.second);
      }
    }
  }
}
