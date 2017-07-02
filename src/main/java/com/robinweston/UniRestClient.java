package com.robinweston;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.mashape.unirest.http.Unirest;

class UniRestClient implements IMakeHttpRequests {
    public String makeGetRequest(String url) {
        try {
            InputStream stream = Unirest.get(url).asJson().getRawBody();

            return StreamHelper.readAsString(stream);
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}