public class Trigonometry {
  public static void main(String[] args) {
    System.out.printf("%5s%8s%10s\n", "Degree","Sin", "Cos");
     
    for (int degree = 0; degree <= 360; degree += 10) {
    System.out.printf("%5d%10.4f%10.4f\n",  degree,    Math.sin(degree * Math.PI / 180), 
                      Math.cos(degree * Math.PI / 180));
    }
  }
}