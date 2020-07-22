/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcar;
import javax.swing.JOptionPane;
/**
 *
 * @author 54911
 */
public class ProjectCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] heBrand = {"BMW","AUDI","ALFAROMEO,VOLVO"};
        String brand = "";
        brand = JOptionPane.showInputDialog("Ingrese la maraca del auto que desea cotizar").toUpperCase();        
        
        int year;
        year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del auto que deseaa cotizar"));
       
        int pBrand;
                
        boolean hE = false;
        hE = search (heBrand, brand);
        if(!hE){
            pBrand = 900;
        } else pBrand = 1800;
        
        int finalFee;
        finalFee = pBrand+year;
        JOptionPane.showMessageDialog(null, "Marca del auto: "+brand+"\nAño: "+year+"\nCosto de cuota mensual: $"+finalFee);
        
                
    }

    private static boolean search(String[] x, String y) {
        Boolean z=false;
        for (String n:x){
            if (n.equals(y)){
                z=true;
            }
        }
        return z;
    }
    
    public static int quotation(int x){
        int y=0;
        if (x>=1990 && x<=1999){
            y=480;
        } else if (x>=2000 && x<=2010){
            y=780;
        } else if (x>=2011 && x<=2016){
            y=950;
        } else if (x>=2017 && x<=2020){
            y=1200;
        }
        return y;
    }
    
}

    
      
    

      
 