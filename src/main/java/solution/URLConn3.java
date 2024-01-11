package solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConn3 {
	public static void main(String[] args) {
	try {
	URL url = new URL("http://mockbin.com/request?foo=bar&foo=baz");
    URLConnection connection = url.openConnection();
    
    //connection.setDoOutput(true);


    BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                connection.getInputStream()));
    String decodedString;
    while ((decodedString = in.readLine()) != null) {
        System.out.println(decodedString);
    }
    in.close();
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
