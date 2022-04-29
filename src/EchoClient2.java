import java.net.*;
import javax.swing.*;

/**
 * This module contains the presentaton logic of an Echo Client.
 * @author M. L. Liu
 */

public class EchoClient2{

    public static void main(String[] args){
        ECHOPROG client;
        String uName;
        String pWord;

        try{
            client = new ECHOPROG(InetAddress.getByName("localhost"), true);

            uName = JOptionPane.showInputDialog(null, "Enter Username: ");
            pWord = JOptionPane.showInputDialog(null, "Enter Password: ");


            String message = client.login_1(uName, pWord);

            JOptionPane.showMessageDialog(null, message);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

}