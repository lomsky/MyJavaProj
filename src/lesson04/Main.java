package lesson04;

import ru.javawebinar.webapp.model.Organization;
import ru.javawebinar.webapp.model.Resume;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        new Organization.Period();
        //new Organization().new Period();
        Map<String, Resume> map = new HashMap<String, Resume>();
        map.put("uuid", new Resume("uuid","",""));

        //for (String key : map.keySet()){
        for (Map.Entry<String,Resume> entry: map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
