import java.io.*;
public class JUtil {

public static String readString () throws Exception {
DataInputStream A = new DataInputStream (System.in);
return (A.readLine ());}

public static short readShort () throws Exception  {
return (Short.valueOf (readString ()).shortValue());}

public static int readInt ()  throws Exception {
return (Integer.valueOf (readString ()).intValue());	}

public static float readFloat () throws Exception {
return (Float.valueOf (readString ()).floatValue());}

public static double readDouble () throws Exception {
return ( Double.valueOf (readString ()).doubleValue());}

public static void pause () throws Exception {
String a = readString ();}}