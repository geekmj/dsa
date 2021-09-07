public class HelloWorld {
  public static void main(String args[]) {
    System.out.println("Factorial 10 " + factorial(10));
  }

  public static int factorial(int n) {
    if(n <=0){
      return 0;
    }
    return n + factorial(n-1);
  }
}