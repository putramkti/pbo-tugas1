/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprakpbo;

/**
 *
 * @author User
 */
public class Mobil extends KendaraanBermotor{

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan");   
    }

    @Override
    public void matikanMesin() {
     System.out.println("Mesin mobil dimatikan");   
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Sebelum diisi bahan bakar sisa" + super.bahanBakar);
        bahanBakar+=10;
        System.out.println("Sesudah diisi bahan bakar sisa" + super.bahanBakar);
    }

    @Override
    public void tlakson() {
        System.out.println("Tetttttttttttt");
    }

   @Override
    public void bergerak() {
        System.out.println("Mobil bergerak ke depan");
    }

    @Override
    public void berhenti() {
         System.out.println("Mobil berhenti");
    }
    

    @Override
    public void belok() {
         System.out.println("Mobil belok");
    }

   
}
