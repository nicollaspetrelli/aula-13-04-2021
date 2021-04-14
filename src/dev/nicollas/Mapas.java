package dev.nicollas;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        // Maps

        Map<String, String> estados = new HashMap<>();
        estados.put("SP", "São Paulo");
        estados.put("RJ", "Rio de Janeiro");

        System.out.println(estados.get("SP"));

        for (Map.Entry<String, String> estado : estados.entrySet()) {
            System.out.println(String.format("key: %s - value: %s \n", estado.getKey(), estado.getValue()));
        }
    }
}
