package edu.eci.arem;

import static spark.Spark.*;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class SparkWebApp 
{
    public static void main( String[] args )
    {
    	port(getPort());
    	staticFiles.location("/static");
        get("/square", (request,response)->{
        	URL url = new URL("https://mzdkfj9kdf.execute-api.us-east-1.amazonaws.com/Beta?value="+request.queryParams("value"));
        	
        	BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        	String answer=reader.readLine();
        	return answer;
        });
    }
    
    static int getPort() {
    	return System.getenv("PORT") != null ? Integer.parseInt(System.getenv("PORT")) : 4567;
    }
}
