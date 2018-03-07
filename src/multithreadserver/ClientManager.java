/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruangomes
 */
public class ClientManager implements Runnable {

    private Socket sock;
    private DataInputStream is;
    private DataOutputStream os;

    public ClientManager(Socket sock) {
        this.sock = sock;

    }
    
//    private int resolveExpressao(String exp) {
//        int resultado=0;
//        String acumula = "";
//        boolean oa = true;
//        for(int ite=0; ite<exp.length(); ite++){
//            char c = exp.charAt(ite);
//            if(c >= '0' && c <= '9'){
//                acumula += c;
//            }
//            else{
//                if(oa){
//                    resultado += Integer.parseInt(acumula);
//                }
//                else{
//                    resultado -= Integer.parseInt(acumula);
//                }
//                
//                if(c == '+'){
//                    oa = true;
//                }
//                    
//                else{
//                    oa = false;
//                }
//                    
//                acumula = "";
//            }
//            
//            if(ite == (exp.length()-1)) {
//                if(oa){
//                    resultado += Integer.parseInt(acumula);
//                }
//                else{
//                    resultado -= Integer.parseInt(acumula);
//                } 
//            }
//           
//        }
//        return resultado;
//    }
    
    @Override
    public void run() {
        try {
        	
        	//Aqui insere o codigo
        	
            is = new DataInputStream(sock.getInputStream());
            os = new DataOutputStream(sock.getOutputStream());
            String exp = is.readUTF();
            
            expNovo = "A mensagem [" + exp + "] foi recebida."
            
            os.writeUTF(s);
           
        } catch (IOException ex) {
            Logger.getLogger(ClientManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
