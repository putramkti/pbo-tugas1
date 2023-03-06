/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasprakpbo;

/**
 *
 * @author User
 */
public class TugasPrakPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KendaraanBermotor kb[] = new KendaraanBermotor[2];
        kb[0] = new Mobil();
        kb[1] = new SepedaMotor();
        
        for (int i = 0; i < 2; i++) {
            kb[i].nyalakanMesin();
            kb[i].bergerak();
            kb[i].tlakson();
            kb[i].isiBahanBakar();
            kb[i].belok();
            kb[i].berhenti();
            kb[i].matikanMesin();
            System.out.println("");
        }
       
        try{
            Kendaraan s = new Sepeda();
            s.belok();
            s.bergerak();
            s.berhenti();
        }catch(Exception e){
            System.out.println("Ada error!! : " + e.getMessage());
        }
    }
    
}
