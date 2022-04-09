package ClientSide;

import java.net.InetAddress;
import javax.swing.*;

/**
 * This module contains the presentaton logic of an Echo Client.
 * @author M. L. Liu
 */

public class EchoClient2
{
    public void static main(String[] args)
    {
        ECHOPROG client;
        String uName;
        String pWord;

        try
        {
            client = new ECHOPROG(InetAddress.getByName("localhost"), true);

            uName = JOptionPane.showInputDialog(null, "Enter username: ");

            if (uName.equals("")) {
                //Username cannot be blank
                uName = JOptionPane.showInputDialog(null, "Please enter username: ");
            }

            pWord = JOptionPane.showInputDialog(null, "Enter password: ");

            if (pWord.equals("")) {
                //Username cannot be blank
                pWord = JOptionPane.showInputDialog(null, "PLease enter password: ");
            }

            String message = client.login_1(uName, pWord);

            JOptionPane.showMessageDialog(null, message);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}