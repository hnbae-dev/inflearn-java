package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClienV0 client = new NetworkClienV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }

}
