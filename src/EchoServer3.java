import java.io.*;

import com.distinct.rpc.*;

/**
 * This module contains the application logic of an echo server
 * which uses a stream-mode socket for interprocess communication.
 * Unlike EchoServer2, this server services clients concurrently.
 * A command-line argument is required to specify the server port.
 * @author M. L. Liu
 */

public class EchoServer3 extends ECHOPROGServer{

    public static void main(String[] args) throws IOException{
        try{
            new EchoServer3();
            System.out.print("Server is Running");
        }

        catch(RPCError e){
            System.out.print(e.getMessage());
        }

    }

    public EchoServer3() throws RPCError {
        super();
    }

    public String login_1(String arg1, String arg2){
        if(arg1.equals("Conor")){
            //keep things simple
            return "101: Login Successful";
        }

        else if(arg1.equals("")){
            return "103: Login Failed";
        }

        else{
            return "102: New User Login Successful";
        }

    }
}