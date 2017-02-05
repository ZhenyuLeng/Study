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
    int[] whitelist = In.readInts(args[0]);
    boolean in = false;
    if      (args[1].charAt(0) == '+') in = false;
    else if (args[1].charAt(0) == '-') in = true;

    Arrays.sort(whitelist);

    while (!StdIn.isEmpty())
    { // Read key, print if not in whitelist.
      int key = StdIn.readInt();
      int index = rank(key, whitelist);
      if ((index < 0 && !in) || (index >= 0 && in))
        StdOut.println(key);
    }
  }
}
