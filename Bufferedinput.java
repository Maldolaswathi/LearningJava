import java.io.*;
public class Bufferedinput {
public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name");
String Str=br.readLine();
System.out.println("your name is "+ Str);
}
}
//BufferedReader is fr io package
//method readLine
//package io
//class  BufferedReader
//userdefined class - Bufferedinput 