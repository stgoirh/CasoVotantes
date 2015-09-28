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
        int Cont0=0;
        int Cont1=0;
        int ContN=0;
        int N= (int)Math.floor(Math.random()*(100-500)+500);
        Votantes=new int[N];
        for(int i=0; i>=N; i++){
            Votantes[i]=(int) (Math.random()*2);
        }
        for(int t=0; t>=N; t++){
            if(Votantes[t]<1){
                Votantes[t]=0;
                Cont0=Cont0+1;
            }else{
                if(Votantes[t]>1){
                    Votantes[t]=1;
                    Cont1=Cont1+1;
                }else{
                    Votantes[t]=5;
                    ContN=ContN+1;
                }
            }
        }
        System.out.println(Cont0+" Votantes");
    }
    
}
