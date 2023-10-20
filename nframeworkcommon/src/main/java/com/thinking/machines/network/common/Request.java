package com.thinking.machines.network.common;

public class Request implements java.io.Serializable
{
public String path;
public Object arguments[];

public void setPath(String path)
{
this.path=path;
}

public String getPath()
{
return this.path;
}

public void setArguments(Object ...arguments)
{
this.arguments=arguments;
}

public Object[] getArguments()
{
return this.arguments;
}

}