import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner doa = new Scanner(System.in); //define scanner
        System.out.print("Enter The Number To Create Diamond: ");
        int n = doa.nextInt(); //getvalue from user

        System.out.println("____Y_O_U_R____\n__D_I_A_M_O_N_D__\n_____H_E_R_E____");

        for (int i=1; i<=n; i++) { //upper part of diamond
            for (int k=1; k<=(n-i); k++) { // for spaces
                System.out.print(" ");

            }
            for (int j=1; j<=2*i-1; j++) {//for the stars above
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for (int j=1; j<=n-i+1; j++) {//for space
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++) {//for the stars below
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("__E_N_J_O_Y__I_T__");
    }
}


