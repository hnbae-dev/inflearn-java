package loop;

public class For2 {

  public static void main(String[] args) {
    int sum = 0;
    int endNum = 3;
    int i=1;

    for(; i<=endNum; i++) {
      sum += i;
      System.out.println("i=" + i + " sum=" + sum);
    }

    System.out.println("i=" + i);
  }

}
