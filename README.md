# Fast-Food-Macronutrient-Calculator

## Project Overview
This project is a Java-based GUI application that helps users calculate the nutritional macros (calories, protein, carbs, and fat) for selected items from popular fast food restaurants. Users can select items from the menus of Chick-fil-A, Panda Express, Taco Bell, and McDonald's, and the program will compute the total macros for the selected items.

## Features
- Interactive GUI with menus for different fast food chains: Chick-fil-A, Panda Express, Taco Bell, and McDonald's.
- Ability to select items from different categories such as breakfast, sides, entrees, etc.
- Calculates the total macros (calories, protein, carbs, fat) for selected items.
- Provides options to reset selections and recalculate macros.

## Project Structure
**Main Class:** fastFoodMacros.java - Contains the main GUI framework and functionality.
**Menu Items:** Each restaurant has its own set of menu items implemented in separate classes (e.g., chikFilAMenuItems, pandaExpressMenuItems, etc.).
**CSV Data:** Nutritional information is fetched from CSV files for each restaurant (not included in this repository).

## How to Run
**Clone the repository:** 

`git clone https://github.com/yourusername/fastfood-macros.git`

**Compile and run the Java program:**

`javac fastFoodMacros.java`

`java fastFoodMacros`

## Usage Instructions
1. Launch the application.
2. From the home screen, select the desired restaurant (Chick-fil-A, Panda Express, Taco Bell, McDonald's).
3. In the restaurant menu, choose food items by category (e.g., breakfast, entrees, sides).
4. Click Submit to calculate the total macros for the selected items.
5. Use the Reset button to clear selections and start over.

## Data Sources
- Chik-Fil-A Nutrition Values found [here](https://www.chick-fil-a.com/nutrition-allergens)
- Taco Bell Nutrition Values found [here](https://www.tacobell.com/nutrition/info)
- Panda Express Nutrition Values found [here](https://panda-express-nutrition.vercel.app/)
- McDonalds Nutrition Values found [here](https://www.mcdonalds.com/us/en-us/about-our-food/nutrition-calculator.html)

## Dependencies
- Java 8 or higher
- Java Swing for GUI components

## License
This project is licensed under the MIT License. See the LICENSE file for details.
