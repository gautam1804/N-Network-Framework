package com.thinking.machines.nframework.server.main;

import com.thinking.machines.nframework.server.*;
import com.thinking.machines.network.server.NFrameworkServer;
import com.thinking.machines.network.server.*;
public class Main
{
public static void main(String args[])
{
try
{
NFrameworkServer nf=new NFrameworkServer();
nf.registerClass(Calculator.class);
nf.start();
}catch(Exception exception)
{
System.out.println(exception);
}
}
}