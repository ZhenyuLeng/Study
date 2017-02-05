import java.util.Arrays;

public class BinarySearch
{
  public static int rank(int key, int[] a)
  {
    return rank(key, a, 0, a.length - 1, 0);
  }

  public static int rank(int key, int[] a, int lo, int hi, int depth)
  {
    StdOut.println(lo + " " + depth + " " + hi);
    if (lo > hi) return -1;
    int mid = lo + (hi - lo) / 2;
    if      (key < a[mid]) return rank(key, a, lo, mid - 1, depth + 1);
    else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth + 1);
    else                   return mid;
  }

  public static void main(String[] args)
  {
    int[] whitelist = In.readInts(args[0]);

    Arrays.sort(whitelist);

    while (!StdIn.isEmpty())
    { // Read key, print if not in whitelist.
      int key = StdIn.readInt();
      if (rank(key, whitelist) < 0)
        StdOut.println(key);
    }
  }
}
