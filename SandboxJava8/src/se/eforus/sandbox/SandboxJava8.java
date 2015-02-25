/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.eforus.sandbox;

import java.time.LocalDate;

/**
 *
 * @author andreaswikstromgronlund
 */
public class SandboxJava8 {
    
    public void dateAndTimeAPI() {
        LocalDate now = LocalDate.now();
        System.out.println(now);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SandboxJava8 sandboxJava8 = new SandboxJava8();
        sandboxJava8.dateAndTimeAPI();
    }
    
}
