/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.controler;

import lk.ijse.moderntech.views.SplashScreen;

/**
 *
 * @author Shamal
 */
public class SplashScreenController {
    public static void main(String[] args) throws InterruptedException {
        SplashScreen splash = new SplashScreen();
        splash.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(20);
            splash.pbLoading.setValue(i);
        }
    }
}
