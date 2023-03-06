/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprakpbo;

/**
 *
 * @author User
 */
public class Sepeda implements Kendaraan {

    @Override
    public void bergerak() {
        System.out.println("Sepeda bergerak ke depan");
    }

    @Override
    public void berhenti() {
         System.out.println("Sepeda berhenti");
    }
    

    @Override
    public void belok() {
         System.out.println("Sepeda belok");
    }

 
}
