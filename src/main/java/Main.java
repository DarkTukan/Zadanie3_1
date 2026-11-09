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
    //odw trojkat
    for(int i = wysokosc; i > 0; i--){
        for(int j = 0; j < i; j++){
            System.out.print(" ");
        }
        for(int k = 0; k < wysokosc - (i-1); k++){
            System.out.print("*");
        }
        System.out.println();
    }
    //trojkat od gory do dolu
    for(int i = wysokosc;i > 0;i--){
      for(int j = 0; j <= i-1;j++){
        System.out.print("*");
      }
      System.out.println();
    } 
    //V praktycznie ten trojkat z pustym sroddkiem tylko troche trudniejsze
    for(int i = wysokosc;i > 0;i--){
      for(int j = 0; j <= (wysokosc - i)-1; j++){
        System.out.print(" ");
      }
       System.out.print("**");
      for(int j = 0; j <= i+2;j++){
        System.out.print(" ");
      }
      System.out.print("**");
      System.out.println();
    } 
  }
 
  
  
}