package tacobell;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import menuitem.MenuItem;

public class tacoBellMenuItems {
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
        return readItemsFromCsv("tacobell/breakfast.csv");
    }

    public static List<MenuItem> tacos() {
        return readItemsFromCsv("tacobell/tacos.csv");
    }

    public static List<MenuItem> burritos() {
        return readItemsFromCsv("tacobell/burritos.csv");
    }

    public static List<MenuItem> nachos() {
        return readItemsFromCsv("tacobell/nachos.csv");
    }

    public static List<MenuItem> quesadillas() {
        return readItemsFromCsv("tacobell/quesadillas.csv");
    }

    public static List<MenuItem> specialties() {
        return readItemsFromCsv("tacobell/specialties.csv");
    }

    public static List<MenuItem> sidesAndSweets() {
        return readItemsFromCsv("tacobell/sidesAndSweets.csv");
    }

    public static List<MenuItem> cravingsValueMenu() {
        return readItemsFromCsv("tacobell/cravingsValueMenu.csv");
    }

    public static List<MenuItem> veggieCravings() {
        return readItemsFromCsv("tacobell/veggieCravings.csv");
    }
}