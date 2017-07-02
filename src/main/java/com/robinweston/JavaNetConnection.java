package com.robinweston;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class JavaNetConnection {
    public String makeGetRequest(String targetUrl) {
        HttpURLConnection connection = null;

        try {
            URL url = new URL(targetUrl);
            connection = (HttpURLConnection)url.openConnection();

            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
            }
            rd.close();
            return response.toString();    
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }      
    }
}