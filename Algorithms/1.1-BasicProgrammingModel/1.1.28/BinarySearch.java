import java.util.Arrays;

public class BinarySearch
{
  public static int rank(int key, int[] a)
  {
    return rank(key, a, 0, a.length - 1);
  }

  public static int rank(int key, int[] a, int lo, int hi)
  {
    if (lo > hi) return -1;
    int mid = lo + (hi - lo) / 2;
    if      (key < a[mid]) return rank(key, a, lo, mid - 1);
    else if (key > a[mid]) return rank(key, a, mid + 1, hi);
    else                   return mid;
  }

  public static void main(String[] args)
  {
    int[] whitelistO = In.readInts(args[0]);

    Arrays.sort(whitelistO);

    int tmp = -1;
    int N = 0;
    for (int i = 0; i < whitelistO.length; i++) {
      if (whitelistO[i] != tmp) {
        tmp = whitelistO[i];
        N++;
      }
      else
        whitelistO[i] = -1;
    }

    int[] whitelist = new int[N];
    for (int i = 0, j = 0; i < whitelistO.length; i++) {
      if (whitelistO[i] != -1)
        whitelist[j++] = whitelistO[i];
    }

    while (!StdIn.isEmpty())
    { // Read key, print if not in whitelist.
      int key = StdIn.readInt();
      if (rank(key, whitelist) < 0)
        StdOut.println(key);
    }
  }
}
