import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;


public class Start {
    public static void main(String[] args) {

/*        User user1 = new User("Vasya", 33, true, "5-51-18", "Petya");
        User user2 = new User("Misha", 25, true, "5-17-04", "Petya");
        User user3 = new User("Dasha", 18, false, "5-32-53", "Vasya");
        user3.getFrends().add("Sasha");
        ArrayList<User> list = new ArrayList<User>();
        Gson gson = new Gson();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        String s = gson.toJson(list);
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Anton\\IdeaProjects\\JSON_Project_GSON(lib)\\src\\main\\resources\\users.json");
            System.out.println(s);
            writer.write(s);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Исключение!");*/
        Gson gson = new Gson();
        try {
            File f = new File("C:\\Users\\Anton\\IdeaProjects\\JSON_Project_GSON(lib)\\src\\main\\resources\\users.json");
            FileReader reader = new FileReader(f);
            char[] buffer = new char[(int) f.length()];
            reader.read(buffer);
             ArrayList<User> list = gson.fromJson(new String(buffer), ArrayList.class);
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Исключение 2!");
        }
    }
    }

