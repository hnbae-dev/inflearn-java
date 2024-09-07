package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClienV1 client = new NetworkClienV1(address);
        client.initError(data); // 추가

        client.connect();
        client.send(data);
        client.disconnect();
    }

}
