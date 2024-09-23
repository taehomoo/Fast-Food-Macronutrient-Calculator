package mcdonalds;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import menuitem.MenuItem;

public class mcDonaldsMenuItems {
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

    public static List<MenuItem> breakfast() {
        return readItemsFromCsv("mcdonalds/breakfast.csv");
    }

    public static List<MenuItem> burgers() {
        return readItemsFromCsv("mcdonalds/burgers.csv");
    }

    public static List<MenuItem> chickenAndFish() {
        return readItemsFromCsv("mcdonalds/chickenandfish.csv");
    }

    public static List<MenuItem> mcNuggets() {
        return readItemsFromCsv("mcdonalds/mcnuggets.csv");
    }

    public static List<MenuItem> friesAndSides() {
        return readItemsFromCsv("mcdonalds/friesandsides.csv");
    }

    public static List<MenuItem> sweetsAndTreats() {
        return readItemsFromCsv("mcdonalds/sweetsandtreats.csv");
    }
}
