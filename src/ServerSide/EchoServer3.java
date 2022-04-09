package ServerSide;

import javax.net.ssl.SSLServerSocketFactory;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import com.distinct.rpc.*;

/**
 * This module contains the application logic of an echo server
 * which uses a stream-mode socket for interprocess communication.
 * Unlike EchoServer2, this server services clients concurrently.
 * A command-line argument is required to specify the server port.
 * @author M. L. Liu
 */

public class EchoServer3
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            new EchoServer3();//Server Stub
            System.out.print("Server is now running");
        }

        catch(RPCError e)
        {
            System.out.print(e.getMessage());
        }

    }

    public EchoServer3() throws RPCError
    {
        super();
    }

    public String login_1(String arg1, String arg2)
    {
        if(arg1.equals("Jaster"))
        {
            //keep things simple
            return "101 Logged in. Welcome Back";
        }
        else if(arg1.equals("."))
        {
            return "103 Error";
        }
        else
        {
            return "102 Logged in\nWelcome";
        }
    }
}

