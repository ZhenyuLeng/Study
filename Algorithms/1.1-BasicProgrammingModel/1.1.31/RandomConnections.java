import java.util.*;

public class RandomConnections
{
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    double p = Double.parseDouble(args[1]);
    double x[] = new double[N];
    double y[] = new double[N];
    StdDraw.circle(0.5, 0.5, 0.4);
    StdDraw.setPenRadius(0.001);
    for(int i = 0; i < N; i++) {
      x[i] = 0.5 + 0.4 * Math.sin(2 * i * Math.PI / N);
      y[i] = 0.5 + 0.4 * Math.cos(2 * i * Math.PI / N);
      StdDraw.point(x[i], y[i]);
    }

    StdDraw.setPenRadius(0.0005);

    int t = 0;
    for (int i = 0; i < N - 1; i++) {
      for (int j = i + 1; j < N; j++) {
        double r = StdRandom.random();
        if (r <= p) {
          StdDraw.line(x[i], y[i], x[j], y[j]);
          t++;
        }
      }
    }

    double rea = (double) t / (N * (N-1) / 2);
    StdOut.println(rea);
  }
}
