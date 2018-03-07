/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadserver;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruangomes
 */
public class MultiThreadServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            InetAddress ia = InetAddress.getByName("localhost");
            int port = 5000;
            ServerSocket server = new ServerSocket(port, 10, ia);
            
            while (true) {
                System.out.println("Aguardando conexão do próximo cliente...");
                Socket sock = server.accept();
                ClientManager cm = new ClientManager(sock);
                Thread t = new Thread(cm);
                t.start();
            }
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(MultiThreadServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MultiThreadServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
