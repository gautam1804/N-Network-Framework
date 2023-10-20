package com.thinking.machines.network.server;

import java.net.*;
import java.util.*;
import java.io.*;
import com.thinking.machines.network.common.*;

public class NFrameworkServer
{
public ArrayList<Class> classes;
public void registerClass(Class clas)
{
classes=new ArrayList<>();
try
{
classes.add(clas);
}catch(Exception exception)
{
System.out.println(exception);
}
}

public void start()
{
ServerSocket serverSocket=null;

try
{
serverSocket=new ServerSocket(5500);
}catch(Exception exception)
{
System.out.println(exception+" And Unable to start the server on port : 5500");
}

try
{
Socket socket;
RequestProcessor requestProcessor;
while(true)
{
System.out.println("Server is ready to accept request on the port : "+5500);
socket=serverSocket.accept();
requestProcessor= new RequestProcessor(socket,classes);
}
}catch(Exception e)
{
System.out.println(e);
}

}

}