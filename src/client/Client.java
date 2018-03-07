/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author ruangomes
 */
public class Client {

    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("localhost");
            int port = 5000;

            Socket sock = new Socket(ia, port);
            
            DataOutputStream os = new DataOutputStream(sock.getOutputStream());
            
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Digite a mensagem:");
            
            String name = entrada.nextLine();
            
            //String name = JOptionPane.showInputDialog("Digite a expressao:");

            os.writeUTF(name);
            
            DataInputStream is = new DataInputStream(sock.getInputStream());
            
            String msg = is.readUTF();
            
            System.out.println("Mensagem Recebida: " + msg);
            
            //JOptionPane.showMessageDialog(null, "Solucao >> " + solucao);
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}