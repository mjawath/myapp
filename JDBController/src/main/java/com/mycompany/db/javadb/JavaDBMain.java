/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.db.javadb;

/**
 *
 * @author AJawath
 */
public class JavaDBMain {

    public static void main(String[] args) {
        try {
            System.out.println("Trying to run the javadb server");
            JavaDBServerManager.runDBServer();            
            System.out.println("Success: javadb server running");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("programe is waiting until user closes the application");
        while (true) {//todo :- proper way to wait the app until somebody stop the server
        //waits until caller closes the application
        //jvm shutdown hook will stop the server
        }
    }
}
