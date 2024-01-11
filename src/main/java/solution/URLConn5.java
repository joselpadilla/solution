package solution;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class URLConn5 {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		URLConnection con = null;
		FileInputStream fi = null;
		InputStream in = null;
		try {
			// Change the URL with any other publicly accessible POST resource, which
			// accepts JSON request body
			URL url = new URL("http://dummy.restapiexample.com/api/v1/create");

			con =  url.openConnection();

			con.setRequestProperty("Content-Type", "application/json; utf-8");
			con.setRequestProperty("Accept", "application/json");
			con.addRequestProperty("User-Agent", "Mozilla");
			con.setReadTimeout(5000);
			con.setConnectTimeout(5000);
			con.setDoOutput(true);

			fi = new FileInputStream(new File("body.txt"));

			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fi.read(buffer)) != -1)
				baos.write(buffer, 0, len);
			baos.writeTo(con.getOutputStream());


			/*BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				response.append(responseLine.trim());
			}

			System.out.println(response.toString());*/
			
			in = con.getInputStream();
	        len = 0;
		    while ((len = in.read()) != -1) 
		      System.out.print((char) len);


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(fi != null)
				fi.close();
			if(baos != null)
				baos.close();
			if(in != null)
				in.close();
			
		}

	}

}
