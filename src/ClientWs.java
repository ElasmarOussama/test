import proxy.BanqueService;
import proxy.BanqueWS;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convertionEuroToDh(800));
    }
}
