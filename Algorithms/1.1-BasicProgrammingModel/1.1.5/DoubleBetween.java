import java.util.*;

public class DoubleBetween {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("There must be two args.");
    }

    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    
    if (x > 0 && x < 1 && y > 0 && y < 1) {
      System.out.println("true");
    }
    else {
      System.out.println("false");
    }
  }
}
