/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author evanmendyk
 */
public class HoleClass {
    private int par;
    private boolean hitGreen;
    private boolean hitFairway;
    private boolean upDown;
    private int numberPutts;
    
    

   

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }

    public boolean isHitGreen() {
        return hitGreen;
    }

    public void setHitGreen(boolean hitGreen) {
        this.hitGreen = hitGreen;
    }

    public boolean isHitFairway() {
        return hitFairway;
    }

    public void setHitFairway(boolean hitFairway) {
        this.hitFairway = hitFairway;
    }

    public boolean isUpDown() {
        return upDown;
    }

    public void setUpDown(boolean upDown) {
        this.upDown = upDown;
    }

    public int getNumberPutts() {
        return numberPutts;
    }

    public void setNumberPutts(int numberPutts) {
        this.numberPutts = numberPutts;
    }

    

    public HoleClass(int par, boolean hitGreen, boolean hitFairway, boolean upDown, int numberPutts) {
        this.par = par;
        this.hitGreen = hitGreen;
        this.hitFairway = hitFairway;
        this.upDown = upDown;
        this.numberPutts = numberPutts;
        
        
        
    }

    @Override
    public String toString() {
        return "HoleClass{" + "par=" + par + ", hitGreen=" + hitGreen + ", hitFairway=" + hitFairway + ", upDown=" + upDown + ", numberPutts=" + numberPutts + '}';
    }
    
    
}
