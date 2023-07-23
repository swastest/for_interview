import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C5_ParserSolution {

    private static final String dn = "CN=Ivanov Ivan Ivanovich,ADDR=Russia, Tatarstan rep., Kazan city, Br. Kasimovykh str.,bld. 45,OU=Development,DC=cbr,DC=ru";

    public static void main(String[] args) {
        List<Map.Entry<String, String>> parsed = parse(dn);
        System.out.println(parsed);
    }

    private static List<Map.Entry<String, String>> parse(String dn) {
        List<Map.Entry<String, String>> result = new ArrayList<>();
        StringBuilder key = new StringBuilder();
        StringBuilder value = new StringBuilder();
        boolean parsingKey = false;
        for (int i = dn.length() - 1; i >= 0; --i) {
            char charr = dn.charAt(i);
            switch (charr) {
                case '=' -> {
                    parsingKey = true;
                }

                case ',' -> {
                    if (parsingKey) {
                        result.add(new AbstractMap.SimpleEntry<>(key.toString(), value.toString()));
                        key = new StringBuilder();
                        value = new StringBuilder();
                        parsingKey = false;
                    } else {
                        value.insert(0, charr);
                    }
                }

                default -> {
                    if (parsingKey) {
                        key.insert(0, charr);
                    } else {
                        value.insert(0, charr);
                    }
                }
            }
        }
        result.add(new AbstractMap.SimpleEntry<>(key.toString(), value.toString()));
        return result;
    }
}
