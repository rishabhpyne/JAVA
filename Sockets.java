import java.net.*;
import java.io.*;

class Sockets
{
public static void main(String args[]) throws Exception
{
int i;
Socket s=new Socket("www.internic.net",43);
InputStream in=s.getInputStream();
OutputStream out=s.getOutputStream();
String st=(args.length==0?"google.com":args[0])+"\n";
byte b[]=st.getBytes();
out.write(b);
if((i=in.read())!=-1)
{
System.out.println((char)i);
}
s.close();
}
}
