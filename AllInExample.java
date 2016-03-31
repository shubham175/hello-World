import java.io.*;
class AllInExample extends Thread
{

public void run(){
try(DataInputStream ds=new DataInputStream(new FileInputStream("AllInExample.txt"))){


String s1=" ";

while(s1!=null){
s1=ds.readLine();

if(s1!=null)
System.out.println(s1);
Thread.sleep(2000);
}
}catch(Exception e){}


}
public static void main(String... args){

try{
DataInputStream din=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("AllInExample1.txt");

PrintStream ps=new PrintStream(fout);
String s=" ";

while(!s.equals("stop")){
s=din.readLine();

ps.println(s);
}
din.close();
fout.close();
}catch(Exception e){}

AllInExample at=new AllInExample();
at.start();
}


}