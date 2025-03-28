package Tema7.prueva.colecciones;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {

    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap();

        // إضافة عناصر (مفتاح وقيمة
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // طباعة الخريط
        System.out.println("Continido del mapa: " + map);

        map.put("A", 4);
        System.out.println("Continido nuevo del mapa: " + map);

        // الوصول إلى قيمة عبر المفتا
        System.out.println("C: " + map.get("C"));

        // التكرار عبر entrySet()
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }






    }
}
