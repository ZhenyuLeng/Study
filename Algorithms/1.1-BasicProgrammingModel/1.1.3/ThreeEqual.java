import java.util.*;

public class ThreeEqual {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("There must be three args.");
      return;
    }

    int first = Integer.parseInt(args[0]);
    int second = Integer.parseInt(args[1]);
    int third = Integer.parseInt(args[2]);

    if (first == second && second == third) {
      System.out.println("equal");
    } else {
      System.out.println("not equal");
    }
  }
}
