package com.api_visitor_crud.visitor_crud;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.Date;

public class ServerSocketGraduation {
    public ServerSocketGraduation() throws IOException {
        ServerSocket servidor = new ServerSocket(12345);

        System.out.println("Porta 12345 aberta!");
    }
}
