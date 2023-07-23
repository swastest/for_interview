import java.util.List;
import java.util.Map;

public class C5_Parser {

    private static final String dn = "CN=Ivanov Ivan Ivanovich,ADDR=Russia, Tatarstan rep., Kazan city, Br. Kasimovykh str.,bld. 45,OU=Development,DC=cbr,DC=ru";

    public static void main(String[] args) {
        List<Map.Entry<String, String>> parsed = parse(dn);
        System.out.println(parsed);
    }

    private static List<Map.Entry<String, String>> parse(String dn) {
        return null;
    }
}
