package solution;
import java.net.*;
import java.io.*;

public class URLConn {
	 public static void main(String[] args) throws Exception {
	        FileOutputStream fos = null;
		    ByteArrayOutputStream baos = new ByteArrayOutputStream();
		 try {
	        fos = new FileOutputStream(new File("myFile"));
		    URL yahoo = new URL("htt://www.google.com/");
		    URLConnection yc = yahoo.openConnection();
		    InputStream in =  yc.getInputStream();
		    
	        byte[] buffer = new byte[1024];
	        int len = 0;
		    while ((len = in.read(buffer)) != -1) 
		      baos.write(buffer, 0, len);
		    
		    baos.writeTo(fos);
		    in.close();
		    fos.close();
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 finally {
			    fos.close();
			    baos.close();
		 }
}
}
