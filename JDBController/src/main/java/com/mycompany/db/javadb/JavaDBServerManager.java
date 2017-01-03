/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.db.javadb;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import org.apache.derby.drda.NetworkServerControl;

/**
 *
 * @author AJawath
 */
public class JavaDBServerManager {

    private static final String DATA_STORE = "sample";
    private static final int DBMode = 0;

    private static NetworkServerControl serverControl;

    public static void runDBServer() {
        try {
            System.out.println("Trying to run server");
            if (DBMode == 0) {//if DB is server mode
                connectToNetworkServer();
            } else if (DBMode == 1) {// if DB is local mode
                connectToLocalDB();
            }

            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    try {   
                        shutDownServer();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void connectToLocalDB() throws Exception {
        System.out.println("Trying to connect to local mode server");
        Class.forName(org.apache.derby.jdbc.EmbeddedDriver.class.getName());
        Connection conn = DriverManager.getConnection("jdbc:derby:" + DATA_STORE + ";create=true");
        System.out.println("successfully  connected to run local mode server");
    }

    private static void connectToNetworkServer() throws Exception {
        String workingDir = System.getProperty("user.dir");
        System.out.println("Current working directory : " + workingDir);

        Properties p = System.getProperties();
        p.setProperty("derby.system.home", workingDir);
        System.setProperty("derby.system.home", workingDir);
        System.setProperty("derby.drda.startNetworkServer", "true");
        System.out.println("Trying to run network mode server");

        serverControl = new NetworkServerControl(InetAddress.getByName("localhost"), 1521);
        serverControl.start(null);

//        serverControl.shutdown();
    }

    public static void shutDownServer() throws Exception {
        System.out.println("start: shutdown Network server shutdown");
        serverControl.shutdown();
        System.out.println("success: server shutdown Network server");
    }
}
