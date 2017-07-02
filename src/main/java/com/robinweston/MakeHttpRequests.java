package com.robinweston;

public class MakeHttpRequests {

    private static IMakeHttpRequests[] createClients() {
        return new IMakeHttpRequests[] {
            new JavaNetClient(),
            new UniRestClient()
        };
    }

    public static void main(String[] arguments) {
        System.out.println("About to make HTTP requests");
        String url = "https://jsonplaceholder.typicode.com/posts/1";

        IMakeHttpRequests[] clients = createClients();
        for (IMakeHttpRequests client : clients) {
           String data = client.makeGetRequest(url); 
           System.out.println(data);
        }
        
    }
}
