## Network Framework

This is a framework developed in java. Users can use this framework to write full-fledged network applications without writing any single line of network programming.  <br>

## Environment Specifications
```bash
C:\>java -version
java version "10.0.1" 2018-04-17
Java(TM) SE Runtime Environment 18.3 (build 10.0.1+10)
Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10.0.1+10, mixed mode)

C:\>gradle -version

------------------------------------------------------------
Gradle 6.5
------------------------------------------------------------

Build time:   2020-06-02 20:46:21 UTC
Revision:     a27f41e4ae5e8a41ab9b19f8dd6d86d7b384dad4

Kotlin:       1.3.72
Groovy:       2.5.11
Ant:          Apache Ant(TM) version 1.10.7 compiled on September 1 2019
JVM:          10.0.1 ("Oracle Corporation" 10.0.1+10)
OS:           Windows 10 10.0 amd64

```


## Folders Abbreviations
<ul>
  <li>client: client part</li>
  <li>common: Utilities for the server and client.</li>
  <li>server: server part</li>
</ul>

## Common
This folder includes files that will be shared between both server and client.
```bash
nFramework\common>gradle build
```
## server
To compile files:
```bash
nFramework\server>gradle build
```

## client
To compile files:
```bash
nFramework\client>gradle build
```
**For testing the framework:**
I have created a testCase program inside the folder bankingTestcaseNframework.

1.server compilation and starting the server:
```bash
nFramework/bankingTestcaseNframework>javac -classpath ..\nframework\server\build\libs\*;. Bank.java
```
```bash
nFramework/bankingTestcaseNframework>java -classpath ..\nframework\server\build\libs\*;..\nframework\common\build\libs\*;c:\gson\*;. Bank
```

2.client compilation and testing the application:
```bash
nFramework/bankingTestcaseNframework>javac -classpath ..\nframework\client\build\libs\*;. BankUI.java
```
```bash
nFramework/bankingTestcaseNframework>java -classpath ..\nframework\client\build\libs\*;..\nframework\common\build\libs\*;c:\gson\*;. BankUI UJJAIN
```
