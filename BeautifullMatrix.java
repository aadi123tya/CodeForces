import java.io.*;
import java.util.*;
public class BeautifullMatrix {
// For fast input output
static class FastReader {
BufferedReader br;
StringTokenizer st;
public FastReader()
{ try {br = new BufferedReader(
new FileReader("input.txt"));
PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
System.setOut(out);}
catch(Exception e) { br = new BufferedReader(new InputStreamReader(System.in));}
}
String next()
{
while (st == null || !st.hasMoreElements()) {
try {st = new StringTokenizer(br.readLine());}
catch (IOException e) {
e.printStackTrace();}
}
return st.nextToken();
}
int nextInt() { return Integer.parseInt(next()); }
long nextLong() { return Long.parseLong(next()); }
double nextDouble() {return Double.parseDouble(next()); }
String nextLine()
{
String str = "";
try {
str = br.readLine();
}
catch (IOException e) {
e.printStackTrace();
}
return str;
}
}
// end of fast i/o code
public static void main(String[] args) {
FastReader M = new FastReader();

for(int i=1;i<=5;++i)
{

for(int j=1;j<=5;++j)
{
    if(M.nextInt()==1)
    {
        System.out.println(Math.abs(i-3) + Math.abs(j-3));
    }
     
    }
}






}
}