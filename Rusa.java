import java.util.Scanner;

class Rusa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ruleta rusa");
        double random = Math.random()*10;
        int muerte = (int) random;
        int intentos = 10;
        int bala;


        do {

            System.out.println("pulsa enter, quedan: "+intentos+ " balas");
             sc.nextLine();
             double randombala = Math.random()*10;
             int bala2 = (int) randombala;
             intentos--;
             bala= bala2;
             if (bala!=muerte){
             }
             else if (bala == muerte){
                 System.out.println("has perdido");
                 System.exit(0);
             }
            if (intentos<1){
                System.out.println("has perdido");

            }

        } while (intentos>0  );


    }
}