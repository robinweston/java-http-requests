package com.robinweston;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class JavaNetClient implements IMakeHttpRequests {
    public String makeGetRequest(String targetUrl) {
        HttpURLConnection connection = null;

        try {
            URL url = new URL(targetUrl);
            connection = (HttpURLConnection)url.openConnection();

            InputStream is = connection.getInputStream();
            return StreamHelper.readAsString(is);   
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