import java.util.Arrays;

public class BinarySearch
{
  public static int rank(int key, int[] a)
  {
    int i = rankMin(key, a, 0, a.length - 1);
    return (i+1);
  }

  public static int count(int key, int[] a)
  {
    int min = rankMin(key, a, 0, a.length - 1);
    int max = rankMax(key, a, 0, a.length - 1);
    return (max - min - 1);
  }

  public static int rankMin(int key, int[] a, int lo, int hi)
  {
    if (lo > hi) return hi;
    int mid = lo + (hi - lo) / 2;
    if      (key < a[mid] || key == a[mid]) return rankMin(key, a, lo, mid - 1);
    else return rankMin(key, a, mid + 1, hi);
  }

  public static int rankMax(int key, int[] a, int lo, int hi)
  {
    if (lo > hi) return lo;
    int mid = lo + (hi - lo) / 2;
    if      (key < a[mid]) return rankMax(key, a, lo, mid - 1);
    else return rankMax(key, a, mid + 1, hi);
  }

  public static void main(String[] args)
  {
    int[] whitelist = In.readInts(args[0]);

    Arrays.sort(whitelist);

    for (int i = 0; i < whitelist.length; i++)
      StdOut.print(whitelist[i] + " ");
    StdOut.println("");

    while (!StdIn.isEmpty())
    { // Read key, print if not in whitelist.
      int key = StdIn.readInt();
      int N = rank(key, whitelist);
      StdOut.print(N + " " + key);
      if (N > 0)
        StdOut.print(" " + whitelist[N - 1]);
      if (N < whitelist.length)
        StdOut.print(" " + whitelist[N]);
      StdOut.println("");
      StdOut.println(count(key, whitelist));
//      StdOut.println(count(key));
    }
  }
}
