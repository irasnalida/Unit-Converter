/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoadingScreen;

import LoadingScreen.splash;
import Converter.Unitconverter;

public class SplashLoad {
    public static void main(String args[]){
        splash sp=new splash();
        Unitconverter wi=new Unitconverter();
        sp.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
            Thread.sleep(30);
            sp.bar.setValue(i);
            if(i==100){
                sp.setVisible(false);
                wi.setVisible(true);
            }
        }
        }catch(Exception e){
        
        }
    }
}
