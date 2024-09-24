package chikfila;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import menuitem.MenuItem;

public class chikFilAMenuItems {
    public static List<MenuItem> readItemsFromCsv(String filePath) {
        List<MenuItem> menuItemList = new ArrayList<>();
        String line = "";
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();

            while((line = br.readLine()) != null) {
                String[] item = line.split(":");

                String name = item[0];
                int calories = Integer.parseInt(item[1].trim());
                int protein = Integer.parseInt(item[2].trim());
                int carbs = Integer.parseInt(item[3].trim());
                int fat = Integer.parseInt(item[4].trim());

                MenuItem menuItem = new MenuItem(name, calories, protein, carbs, fat);
                menuItemList.add(menuItem);
            }
        }

        catch (IOException e){
            e.printStackTrace();
        }
        return menuItemList;
    }

    public static List<MenuItem> breakfastItems() {
        return readItemsFromCsv("chikfila/chikfilabreakfast.csv");
    }

    public static List<MenuItem> entrees() {
        return readItemsFromCsv("chikfila/chikfilaentrees.csv");
    }

    public static List<MenuItem> salads() {
        return readItemsFromCsv("chikfila/chikfilasalads.csv");
    }

    public static List<MenuItem> sides() {
        return readItemsFromCsv("chikfila/chikfilasides.csv");
    }

    public static List<MenuItem> treats() {
        return readItemsFromCsv("chikfila/chikfilatreats.csv");
    }

    public static List<MenuItem> sauces() {
        return readItemsFromCsv("chikfila/chikfilasauces.csv");
    }

    public static List<MenuItem> dressings() {
        return readItemsFromCsv("chikfila/chikfiladressings.csv");
    }
}
