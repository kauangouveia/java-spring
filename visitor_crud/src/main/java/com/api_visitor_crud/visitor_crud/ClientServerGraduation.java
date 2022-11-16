package com.api_visitor_crud.visitor_crud;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Date;

public class ClientServerGraduation {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        //passing null argument in the SocketAddress
        SocketAddress socketAddress=null;
        //binding the  socket with the inetAddress and port number
        socket.bind(socketAddress);
        //connect() method connects the specified socket to the server
        socket.connect(socketAddress);
        System.out.println("Inet address: "+socket.getInetAddress());
        System.out.println("Port number: "+socket.getLocalPort());
    }

}
