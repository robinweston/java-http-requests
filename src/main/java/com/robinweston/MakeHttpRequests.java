package com.robinweston;

public class MakeHttpRequests {
    public static void main(String[] arguments) {
        System.out.println("About to make HTTP requests");
        String url = "https://jsonplaceholder.typicode.com/posts/1";

        JavaNetConnection javaNetRequest = new JavaNetConnection();
        String data = javaNetRequest.makeGetRequest(url);
        System.out.println(data);
    }
}
