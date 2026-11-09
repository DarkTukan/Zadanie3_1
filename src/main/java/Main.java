import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Podaj wysokosc");
    int wysokosc = scanner.nextInt();
    //trojkat
    for(int i = 1;i <= wysokosc;i++){
      for(int j = 0; j <= i-1;j++){
        System.out.print("*");
      }
      System.out.println();
    }

  }

}