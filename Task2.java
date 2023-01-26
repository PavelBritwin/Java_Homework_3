package Java_homework_2;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("C:\\Users\\anohi\\Task2.json"));
        JSONArray arr = (JSONArray)obj;
        for (Object o : arr)
        {
            JSONObject person = (JSONObject)o;
            StringBuilder sb = new StringBuilder();
            sb.append("Student ");
            sb.append((String)person.get("surname"));
            sb.append(" obtained ");
            sb.append((String)person.get("estimation"));
            sb.append(" in ");
            sb.append((String)person.get("subject"));

            System.out.println(sb);
        }
        Map<String,String> map = new HashMap<String,String>();
        map.put("surname", "Sidorov");
        map.put("estimation", "3");
        map.put("subject", "geography");
        JSONObject newStudent = new JSONObject();
        newStudent.putAll(map);
        arr.add(newStudent);
        try (FileWriter file = new FileWriter("C:\\Users\\anohi\\Task2.json")) {
            for (Object m : arr)
            {
                file.write(m.toString());
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
