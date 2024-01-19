import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C5_ParserSolution {

    private static final String dn = "CN=Ivanov Ivan Ivanovich,ADDR=Russia, Tatarstan rep., Kazan city, Br. Kasimovykh str.,bld. 45,OU=Development,DC=cbr,DC=ru";

    public static void main(String[] args) {
        List<Map.Entry<String, String>> parsed = parse1(dn);
        System.out.println(parsed);
    }

    private static List<Map.Entry<String, String>> parse1(String dn) {
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

    private static List<Map.Entry<String, String>> parse2(String dn) {
        String[] tmpResults = dn.split("=");
        List<String> results = new ArrayList<>();
        results.add(results.get(0));
        for (int i = 1; i < tmpResults.length - 1; ++i) {
            String value = tmpResults[i];
            int lastComma = value.lastIndexOf(",");
            String tmpValue = value.substring(0, lastComma);
            String tmpKey = value.substring(lastComma + 1, value.length());
            results.add(tmpValue);
            results.add(tmpKey);
        }
        results.add(results.get(results.size() - 1));

        List<Map.Entry<String, String>> values = new ArrayList<>();
        for (int i = 0; i < results.size() / 2; ++i) {
            String key = results.get(2 * i);
            String value = results.get(2 * i + 1);
            values.add(Map.entry(key, value));
        }
        return values;
    }
}
