package com.thinking.machines.nframework.server.main;

import com.thinking.machines.network.server.*;

@Path("/calculator")
public class Calculator
{
@Path("/add")
public int add(int a,int b)
{
return a+b;
}

@Path("/sub")
public int sub(int a,int b)
{
return a-b;
}
}