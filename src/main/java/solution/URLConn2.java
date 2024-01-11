package solution;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class URLConn2 {
	 public static void main(String[] args) throws Exception {
	 try {
	 String body  = "{'name':'test','salary':'123','age':'23'}";
	 String request        = "http://dummy.restapiexample.com/api/v1/create";
	 URL    url            = new URL( request );
	 URLConnection conn=  url.openConnection(); 
	 conn.addRequestProperty("Accept","application/json");
	 conn.addRequestProperty("Content-Type","application/json");
	 conn.addRequestProperty("Content-Length",Integer.toString(body.length()));
	 conn.setDoOutput( true );
	 
     ByteArrayOutputStream baos = new ByteArrayOutputStream();

	 baos.write(body.getBytes(), 0, body.getBytes().length);
	 baos.writeTo(conn.getOutputStream());
	 baos.flush();
	 
	 InputStream in = conn.getInputStream();
	 int len;
	 while ((len = in.read()) != -1) 
		 System.out.print((char) len);

	 }catch(Exception e) {
		 System.out.println(e);
	 }
	 
	 }
}
