package com.thinking.machines.nframework.client.main;

import com.thinking.machines.network.client.*;
import com.thinking.machines.network.common.*;

public class Main
{
public static void main(String args[])
{
try
{
NFrameworkClient nfc=new NFrameworkClient();
Response resultOfAdd=nfc.process("/calculator/add",10,30);
Integer i=(Integer)resultOfAdd.getResult(); 
System.out.println("The value after adding : "+i);
}catch(Exception exception)
{
System.out.println(exception);
}
}
}