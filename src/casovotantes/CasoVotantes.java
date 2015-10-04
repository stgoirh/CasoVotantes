/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casovotantes;

/**
 *
 * @author stgoirh
 */
public class CasoVotantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Votantes;
        int Cont0H = 0;
        int Cont1H = 0;
        int ContNH = 0;
        int Cont0M = 0;
        int Cont1M = 0;
        int ContNM = 0;
        int N = (int) Math.floor(Math.random() * (100 - 500) + 500);
        if (N % 2 != 0) {
            N = N + 1;
        }
        Votantes = new int[N];
        for (int i = 0; i < N; i++) {
            Votantes[i] = (int) (Math.random() * 4);
        }
        for (int t = 0; t < N; t++) {//1.2.3.4.5    
            if (t % 2 != 0) {
                if (Votantes[t] == 1) {
                    Cont0M = Cont0M + 1;

                } else if (Votantes[t] == 2) {
                    Cont1M = Cont1M + 1;
                } else {
                    ContNM = ContNM + 1;
                }
            } else {

                if (Votantes[t] == 1) {
                    Cont0H = Cont0H + 1;

                } else if (Votantes[t] == 2) {
                    Cont1H = Cont1H + 1;
                } else {
                    ContNH = ContNH + 1;
                }
            }
        }

        System.out.println(Cont1H + " numero de hombres que aprueban");
        System.out.println(Cont0H + " numero de hombres que desaprueban");
        System.out.println(ContNH + " numero de hombres que no sabe,no responde");
        System.out.println(Cont1M + " numero de mujeres que aprueban");
        System.out.println(Cont0M + " numero de mujeres que desaprueban");
        System.out.println(ContNM + " numero de mujeres que no sabe,no responde");
        System.out.println(Votantes.length);
    }

}
