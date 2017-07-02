package com.robinweston;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamHelper {
    public static String readAsString(InputStream stream) {
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(stream));
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
        }
    }
}