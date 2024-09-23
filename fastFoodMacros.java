import javax.swing.*;

import chikfila.chikFilAMenuItems;
import menuitem.MenuItem;
import pandaexpress.pandaExpressMenuItems;
import tacobell.tacoBellMenuItems;
import mcdonalds.mcDonaldsMenuItems;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.ArrayList;

/*
 * Developed by Andrew Moon
 * Student at Auburn University
 */

public class fastFoodMacros {
    public static void main(String[] args) {
        //List to hold all menu items that have been selected
        List<MenuItem> chikFilAItems = new ArrayList<>();
        List<MenuItem> pandaExpressItems = new ArrayList<>();
        List<MenuItem> tacoBellItems = new ArrayList<>();
        List<MenuItem> mcDonaldsItems = new ArrayList<>();
        
        JFrame frame = new JFrame("Fast Food Macros");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);

        //mainPanel holding the different panels, in this case fast food chains
        JPanel mainPanel = new JPanel(new CardLayout());

        //homePanel holding the navigation buttons to access all the different panels
        JPanel homePanel = new JPanel();

        //creating the buttons to navigate to the different panels
        JButton chikFilAButton = new JButton("Chik-fil-A");
        chikFilAButton.setBounds(50, 50, 150, 25);

        JButton pandaExpressButton = new JButton("Panda Express");
        pandaExpressButton.setBounds(50, 50, 150, 25);

        JButton tacoBellButton = new JButton("Taco Bell");
        tacoBellButton.setBounds(50, 50, 150, 25);

        JButton mcDonaldsButton = new JButton("McDonalds");
        mcDonaldsButton.setBounds(50, 50, 150, 25);

        //adding the navigation buttons to the home panel
        homePanel.add(chikFilAButton);
        homePanel.add(pandaExpressButton);
        homePanel.add(tacoBellButton);
        homePanel.add(mcDonaldsButton);

        //adding the home panel to the main panel, as it is also a panel to navigate to
        mainPanel.add(homePanel, "Home");

        //creating the panels for each restaurant by calling their constructors
        JPanel chikFilAPanel = createChikFilAPanel(mainPanel, chikFilAItems);
        JPanel pandaExpressPanel = createpandaExpressPanel(mainPanel, pandaExpressItems);
        JPanel tacoBellPanel = createTacoBellPanel(mainPanel, tacoBellItems);
        JPanel mcDonaldsPanel = createMcDonaldsPanel(mainPanel, mcDonaldsItems);

        //adding the fast food panels to the main panel
        mainPanel.add(chikFilAPanel, "Chik-fil-A");
        mainPanel.add(pandaExpressPanel, "Panda Express");
        mainPanel.add(tacoBellPanel, "Taco Bell");
        mainPanel.add(mcDonaldsPanel, "McDonalds");

        //changes viewing panel to the Chik-Fil-A panel when the Chik-Fil-A button is clicked
        chikFilAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "Chik-fil-A");
            }
        });

        //changes viewing panel to the Panda Express panel when the Panda Express button is clicked
        pandaExpressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "Panda Express");
            }
        });

        //changes viewing panel to the Taco Bell panel when the Taco Bell button is clicked
        tacoBellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "Taco Bell");
            }
        });

        //changes viewing panel to the McDonalds panel when the McDonalds button is clicked
        mcDonaldsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "McDonalds");
            }
        });

        frame.add(mainPanel);
        frame.setVisible(true);
    }
    
    public static JPanel createChikFilAPanel(JPanel mainPanel, List<MenuItem> checkedItems) {
        JPanel chikfilaPanel = new JPanel(new CardLayout());

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(null);

        //button to navigate back to the home page
        JButton homeButton = new JButton("Home");
        homeButton.setBounds(50,25,150,25);
        menuPanel.add(homeButton);

        //takes user back to home page
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "Home");
            }
        });

        JButton breakfastButton = new JButton("Breakfast");
        breakfastButton.setBounds(50, 55, 150, 25);
        menuPanel.add(breakfastButton);

        JPanel breakfastPanel = new JPanel();
        breakfastPanel.setLayout(null);

        JLabel breakfastLabel = new JLabel("Breakfast Menu");
        breakfastLabel.setBounds(50, 50, 200, 25);
        breakfastPanel.add(breakfastLabel);

        JButton entreesButton = new JButton("Entrees");
        entreesButton.setBounds(50, 85, 150, 25);
        menuPanel.add(entreesButton);

        JPanel entreesPanel = new JPanel();
        entreesPanel.setLayout(null);

        JLabel entreesLabel = new JLabel("Entrees Menu");
        entreesLabel.setBounds(50, 50, 200, 25);
        entreesPanel.add(entreesLabel);

        JButton saladsButton = new JButton("Salads");
        saladsButton.setBounds(50, 115, 150, 25);
        menuPanel.add(saladsButton);

        JPanel saladsPanel = new JPanel();
        saladsPanel.setLayout(null);

        JLabel saladsLabel = new JLabel("Salads Menu");
        saladsLabel.setBounds(50, 50, 200, 25);
        saladsPanel.add(saladsLabel);

        JButton sidesButton = new JButton("Sides");
        sidesButton.setBounds(50, 145, 150, 25);
        menuPanel.add(sidesButton);

        JPanel sidesPanel = new JPanel();
        sidesPanel.setLayout(null);

        JLabel sidesLabel = new JLabel("Sides Menu");
        sidesLabel.setBounds(50, 50, 200, 25);
        sidesPanel.add(sidesLabel);

        JButton treatsButton = new JButton("Treats");
        treatsButton.setBounds(50, 175, 150, 25);
        menuPanel.add(treatsButton);

        JPanel treatsPanel = new JPanel();
        treatsPanel.setLayout(null);

        JLabel treatsLabel = new JLabel("Treats Menu");
        treatsLabel.setBounds(50, 50, 200, 25);
        treatsPanel.add(treatsLabel);

        JButton saucesButton = new JButton("Sauces");
        saucesButton.setBounds(50, 205, 150, 25);
        menuPanel.add(saucesButton);

        JPanel saucesPanel = new JPanel();
        saucesPanel.setLayout(null);

        JLabel saucesLabel = new JLabel("Sauces");
        saucesLabel.setBounds(50, 50, 200, 25);
        saucesPanel.add(saucesLabel);

        JButton dressingsButton = new JButton("Dressings");
        dressingsButton.setBounds(50, 235, 150, 25);
        menuPanel.add(dressingsButton);

        JPanel dressingsPanel = new JPanel();
        dressingsPanel.setLayout(null);

        JLabel dressingsLabel = new JLabel("Dressings");
        dressingsLabel.setBounds(50, 50, 200, 25);
        dressingsPanel.add(dressingsLabel);

        List<MenuItem> breakfast = chikFilAMenuItems.breakfastItems();
        List<MenuItem> entrees = chikFilAMenuItems.entrees();
        List<MenuItem> salads = chikFilAMenuItems.salads();
        List<MenuItem> sides = chikFilAMenuItems.sides(); 
        List<MenuItem> treats = chikFilAMenuItems.treats();
        List<MenuItem> sauces = chikFilAMenuItems.sauces();
        List<MenuItem> dressings = chikFilAMenuItems.dressings();

        putCheckBoxesOnPanel(breakfast, breakfastPanel, checkedItems);
        putCheckBoxesOnPanel(entrees, entreesPanel, checkedItems);
        putCheckBoxesOnPanel(salads, saladsPanel, checkedItems);
        putCheckBoxesOnPanel(sides, sidesPanel, checkedItems);
        putCheckBoxesOnPanel(treats, treatsPanel, checkedItems);
        putCheckBoxesOnPanel(sauces, saucesPanel, checkedItems);
        putCheckBoxesOnPanel(dressings, dressingsPanel, checkedItems);

        JButton breakfastBackButton = new JButton("Back");
        breakfastBackButton.setBounds(50,25,150,25);
        breakfastPanel.add(breakfastBackButton);

        breakfastBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Menu");
            }
        });

        JButton entreesBackButton = new JButton("Back");
        entreesBackButton.setBounds(50, 25, 150, 25);
        entreesPanel.add(entreesBackButton);

        entreesBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Menu");
            }
        });

        JButton saladsBackButton = new JButton("Back");
        saladsBackButton.setBounds(50, 25, 150, 25);
        saladsPanel.add(saladsBackButton);

        saladsBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Menu");
            }
        });

        JButton sidesBackButton = new JButton("Back");
        sidesBackButton.setBounds(50, 25, 150, 25);
        sidesPanel.add(sidesBackButton);

        sidesBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Menu");
            }
        });

        JButton treatsBackButton = new JButton("Back");
        treatsBackButton.setBounds(50, 25, 150, 25);
        treatsPanel.add(treatsBackButton);

        treatsBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Menu");
            }
        });

        JButton saucesBackButton = new JButton("Back");
        saucesBackButton.setBounds(50, 25, 150, 25);
        saucesPanel.add(saucesBackButton);

        saucesBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Menu");
            }
        });

        JButton dressingsBackButton = new JButton("Back");
        dressingsBackButton.setBounds(50, 25, 150, 25);
        dressingsPanel.add(dressingsBackButton);

        dressingsBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Menu");
            }
        });

        breakfastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Breakfast");
            }
        });

        entreesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Entrees");
            }
        });

        saladsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Salads");
            }
        });

        sidesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Sides");
            }
        });

        treatsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Treats");
            }
        });

        saucesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Sauces");
            }
        });

        dressingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) chikfilaPanel.getLayout();
                cl.show(chikfilaPanel, "Dressings");
            }
        });

        //order matters, whatever is first is what opens up first when chikfila is pressed
        chikfilaPanel.add(menuPanel, "Menu");
        chikfilaPanel.add(breakfastPanel, "Breakfast");
        chikfilaPanel.add(entreesPanel, "Entrees");
        chikfilaPanel.add(saladsPanel, "Salads");
        chikfilaPanel.add(sidesPanel, "Sides");
        chikfilaPanel.add(treatsPanel, "Treats");
        chikfilaPanel.add(saucesPanel, "Sauces");
        chikfilaPanel.add(dressingsPanel, "Dressings");

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 400, 100, 25);
        menuPanel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMacros(checkedItems, menuPanel);
            }
        });

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(300, 400, 100, 25);
        menuPanel.add(resetButton);

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetMacros(checkedItems, menuPanel, breakfastPanel, entreesPanel, saladsPanel, sidesPanel, treatsPanel, saucesPanel, dressingsPanel);
            }
        });

        return chikfilaPanel;
    }

    
    public static JPanel createpandaExpressPanel(JPanel mainPanel, List<MenuItem> checkedItems) {
        JPanel pandaExpressPanel = new JPanel(new CardLayout());

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(null);

        JButton homeButton = new JButton("Home");
        homeButton.setBounds(50,25,150,25);
        menuPanel.add(homeButton);

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "Home");
            }
        });

        JButton sidesButton = new JButton("Sides");
        sidesButton.setBounds(50, 55, 150, 25);
        menuPanel.add(sidesButton);

        JPanel sidesPanel = new JPanel();
        sidesPanel.setLayout(null);

        JLabel sidesLabel = new JLabel("Sides Menu");
        sidesLabel.setBounds(50, 50, 200, 25);
        sidesPanel.add(sidesLabel);

        JButton chickenButton = new JButton("Chicken");
        chickenButton.setBounds(50, 85, 150, 25);
        menuPanel.add(chickenButton);

        JPanel chickenPanel = new JPanel();
        chickenPanel.setLayout(null);

        JLabel chickenLabel = new JLabel("Chickens Menu");
        chickenLabel.setBounds(50, 50, 200, 25);
        chickenPanel.add(chickenLabel);

        JButton beefAndSeafoodButton = new JButton("Beef and Seafood");
        beefAndSeafoodButton.setBounds(50, 115, 150, 25);
        menuPanel.add(beefAndSeafoodButton);

        JPanel beefAndSeafoodPanel = new JPanel();
        beefAndSeafoodPanel.setLayout(null);

        JLabel beefAndSeafoodLabel = new JLabel("Beefs and Seafoods Menu");
        beefAndSeafoodLabel.setBounds(50, 50, 200, 25);
        beefAndSeafoodPanel.add(beefAndSeafoodLabel);

        JButton appetizersButton = new JButton("Appetizers");
        appetizersButton.setBounds(50, 145, 150, 25);
        menuPanel.add(appetizersButton);

        JPanel appetizersPanel = new JPanel();
        appetizersPanel.setLayout(null);

        JLabel appetizersLabel = new JLabel("Appetizers");
        appetizersLabel.setBounds(50, 50, 200, 25);
        appetizersPanel.add(appetizersLabel);

        List<MenuItem> sides = pandaExpressMenuItems.sides();
        List<MenuItem> chicken = pandaExpressMenuItems.chicken();
        List<MenuItem> beefAndSeafood = pandaExpressMenuItems.beefSeafood();
        List<MenuItem> appetizers = pandaExpressMenuItems.appetizers();

        putCheckBoxesOnPanel(sides, sidesPanel, checkedItems);
        putCheckBoxesOnPanel(chicken, chickenPanel, checkedItems);
        putCheckBoxesOnPanel(beefAndSeafood, beefAndSeafoodPanel, checkedItems);
        putCheckBoxesOnPanel(appetizers, appetizersPanel, checkedItems);

        JButton sidesBackButton = new JButton("Back");
        sidesBackButton.setBounds(50, 25, 150, 25);
        sidesPanel.add(sidesBackButton);

        sidesBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) pandaExpressPanel.getLayout();
                cl.show(pandaExpressPanel, "Menu");
            }
        });

        JButton chickenBackButton = new JButton("Back");
        chickenBackButton.setBounds(50, 25, 150, 25);
        chickenPanel.add(chickenBackButton);

        chickenBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) pandaExpressPanel.getLayout();
                cl.show(pandaExpressPanel, "Menu");
            }
        });

        JButton beefAndSeafoodBackButton = new JButton("Back");
        beefAndSeafoodBackButton.setBounds(50, 25, 150, 25);
        beefAndSeafoodPanel.add(beefAndSeafoodBackButton);

        beefAndSeafoodBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) pandaExpressPanel.getLayout();
                cl.show(pandaExpressPanel, "Menu");
            }
        });

        JButton appetizersBackButton = new JButton("Back");
        appetizersBackButton.setBounds(50, 25, 150, 25);
        appetizersPanel.add(appetizersBackButton);

        appetizersBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) pandaExpressPanel.getLayout();
                cl.show(pandaExpressPanel, "Menu");
            }
        });

        sidesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) pandaExpressPanel.getLayout();
                cl.show(pandaExpressPanel, "Sides");
            }
        });

        chickenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) pandaExpressPanel.getLayout();
                cl.show(pandaExpressPanel, "Chicken");
            }
        });

        beefAndSeafoodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) pandaExpressPanel.getLayout();
                cl.show(pandaExpressPanel, "Beef and Seafood");
            }
        });

        appetizersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) pandaExpressPanel.getLayout();
                cl.show(pandaExpressPanel, "Appetizers");
            }
        });

        pandaExpressPanel.add(menuPanel, "Menu");
        pandaExpressPanel.add(sidesPanel, "Sides");
        pandaExpressPanel.add(chickenPanel, "Chicken");
        pandaExpressPanel.add(beefAndSeafoodPanel, "Beef and Seafood");
        pandaExpressPanel.add(appetizersPanel, "Appetizers");

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 400, 100, 25);
        menuPanel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMacros(checkedItems, menuPanel);
            }
        });

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(300, 400, 100, 25);
        menuPanel.add(resetButton);

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetMacros(checkedItems, menuPanel, sidesPanel, chickenPanel, beefAndSeafoodPanel, appetizersPanel);
            }
        });

        return pandaExpressPanel;
    }
    


    public static JPanel createTacoBellPanel(JPanel mainPanel, List<MenuItem> checkedItems) {
        JPanel tacoBellPanel = new JPanel(new CardLayout());

        JPanel menuPanel = new JPanel(null);

        JButton homeButton = new JButton("Home");
        homeButton.setBounds(50,25,150,25);
        menuPanel.add(homeButton);

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "Home");
            }
        });

        JButton breakfastButton = new JButton("Breakfast");
        breakfastButton.setBounds(50, 55, 150, 25);
        menuPanel.add(breakfastButton);

        JPanel breakfastPanel = new JPanel(null);

        JLabel breakfastLabel = new JLabel("Breakfast Menu");
        breakfastLabel.setBounds(50, 50, 200, 25);
        breakfastPanel.add(breakfastLabel);

        JButton tacosButton = new JButton("Tacos");
        tacosButton.setBounds(50, 85, 150, 25);
        menuPanel.add(tacosButton);

        JPanel tacosPanel = new JPanel(null);

        JLabel tacosLabel = new JLabel("Tacos Menu");
        tacosLabel.setBounds(50, 50, 200, 25);
        tacosPanel.add(tacosLabel);

        JButton burritosButton = new JButton("Burritos");
        burritosButton.setBounds(50, 115, 150, 25);
        menuPanel.add(burritosButton);

        JPanel burritosPanel = new JPanel(null);

        JLabel burritosLabel = new JLabel("Burritos Menu");
        burritosLabel.setBounds(50, 50, 200, 25);
        burritosPanel.add(burritosLabel);

        JButton nachosButton = new JButton("Nachos");
        nachosButton.setBounds(50, 145, 150, 25);
        menuPanel.add(nachosButton);

        JPanel nachosPanel = new JPanel(null);

        JLabel nachosLabel = new JLabel("Nachos Menu");
        nachosLabel.setBounds(50, 50, 200, 25);
        nachosPanel.add(nachosLabel);

        JButton quesadillasButton = new JButton("Quesadillas");
        quesadillasButton.setBounds(50, 175, 150, 25);
        menuPanel.add(quesadillasButton);

        JPanel quesadillasPanel = new JPanel(null);

        JLabel quesadillasLabel = new JLabel("Quesadillas Menu");
        quesadillasLabel.setBounds(50, 50, 200, 25);
        quesadillasPanel.add(quesadillasLabel);

        JButton specialtiesButton = new JButton("Specialties");
        specialtiesButton.setBounds(50, 205, 150, 25);
        menuPanel.add(specialtiesButton);

        JPanel specialtiesPanel = new JPanel(null);

        JLabel specialtiesLabel = new JLabel("Specialties Menu");
        specialtiesLabel.setBounds(50, 50, 200, 25);
        specialtiesPanel.add(specialtiesLabel);

        JButton SidesAndSweetsButton = new JButton("Sides and Sweets");
        SidesAndSweetsButton.setBounds(50, 235, 150, 25);
        menuPanel.add(SidesAndSweetsButton);

        JPanel SidesAndSweetsPanel = new JPanel(null);

        JLabel SidesAndSweetsLabel = new JLabel("Sides and Sweets Menu");
        SidesAndSweetsLabel.setBounds(50, 50, 200, 25);
        SidesAndSweetsPanel.add(SidesAndSweetsLabel);

        JButton cravingsValueMenuButton = new JButton("Cravings Value Menu");
        cravingsValueMenuButton.setBounds(50, 265, 150, 25);
        menuPanel.add(cravingsValueMenuButton);

        JPanel cravingsValueMenuPanel = new JPanel(null);

        JLabel cravingsValueMenuLabel = new JLabel("Cravings Value Menu");
        cravingsValueMenuLabel.setBounds(50, 50, 200, 25);
        cravingsValueMenuPanel.add(cravingsValueMenuLabel);

        JButton veggieCravingsButton = new JButton("Veggie Cravings");
        veggieCravingsButton.setBounds(50, 295, 150, 25);
        menuPanel.add(veggieCravingsButton);

        JPanel veggieCravingsPanel = new JPanel(null);

        JLabel veggieCravingsLabel = new JLabel("Veggie Cravings Menu");
        veggieCravingsLabel.setBounds(50, 50, 200, 25);
        veggieCravingsPanel.add(veggieCravingsLabel);

        List<MenuItem> breakfast = tacoBellMenuItems.breakfast();
        List<MenuItem> tacos = tacoBellMenuItems.tacos();
        List<MenuItem> burritos = tacoBellMenuItems.burritos();
        List<MenuItem> nachos = tacoBellMenuItems.nachos();
        List<MenuItem> quesadillas = tacoBellMenuItems.quesadillas();
        List<MenuItem> specialties = tacoBellMenuItems.specialties();
        List<MenuItem> SidesAndSweets = tacoBellMenuItems.sidesAndSweets();
        List<MenuItem> cravingsValueMenu = tacoBellMenuItems.cravingsValueMenu();
        List<MenuItem> veggieCravings = tacoBellMenuItems.veggieCravings();

        putCheckBoxesOnPanel(breakfast, breakfastPanel, checkedItems);
        putCheckBoxesOnPanel(tacos, tacosPanel, checkedItems);
        putCheckBoxesOnPanel(burritos, burritosPanel, checkedItems);
        putCheckBoxesOnPanel(nachos, nachosPanel, checkedItems);
        putCheckBoxesOnPanel(quesadillas, quesadillasPanel, checkedItems);
        putCheckBoxesOnPanel(specialties, specialtiesPanel, checkedItems);
        putCheckBoxesOnPanel(SidesAndSweets, SidesAndSweetsPanel, checkedItems);
        putCheckBoxesOnPanel(cravingsValueMenu, cravingsValueMenuPanel, checkedItems);
        putCheckBoxesOnPanel(veggieCravings, veggieCravingsPanel, checkedItems);

        JButton breakfastBackButton = new JButton("Back");
        breakfastBackButton.setBounds(50,25,150,25);
        breakfastPanel.add(breakfastBackButton);

        breakfastBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Menu");
            }
        });

        JButton tacosBackButton = new JButton("Back");
        tacosBackButton.setBounds(50, 25, 150, 25);
        tacosPanel.add(tacosBackButton);

        tacosBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Menu");
            }
        });

        JButton burritosBackButton = new JButton("Back");
        burritosBackButton.setBounds(50, 25, 150, 25);
        burritosPanel.add(burritosBackButton);

        burritosBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Menu");
            }
        });

        JButton nachosBackButton = new JButton("Back");
        nachosBackButton.setBounds(50, 25, 150, 25);
        nachosPanel.add(nachosBackButton);

        nachosBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Menu");
            }
        });

        JButton quesadillasBackButton = new JButton("Back");
        quesadillasBackButton.setBounds(50, 25, 150, 25);
        quesadillasPanel.add(quesadillasBackButton);

        quesadillasBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Menu");
            }
        });

        JButton specialtiesBackButton = new JButton("Back");
        specialtiesBackButton.setBounds(50, 25, 150, 25);
        specialtiesPanel.add(specialtiesBackButton);

        specialtiesBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Menu");
            }
        });

        JButton SidesAndSweetsBackButton = new JButton("Back");
        SidesAndSweetsBackButton.setBounds(50, 25, 150, 25);
        SidesAndSweetsPanel.add(SidesAndSweetsBackButton);

        SidesAndSweetsBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Menu");
            }
        });

        JButton cravingsValueMenuBackButton = new JButton("Back");
        cravingsValueMenuBackButton.setBounds(50, 25, 150, 25);
        cravingsValueMenuPanel.add(cravingsValueMenuBackButton);

        cravingsValueMenuBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Menu");
            }
        });

        JButton veggieCravingsBackButton = new JButton("Back");
        veggieCravingsBackButton.setBounds(50, 25, 150, 25);
        veggieCravingsPanel.add(veggieCravingsBackButton);

        veggieCravingsBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Menu");
            }
        });

        breakfastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Breakfast");
            }
        });
        
        tacosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Tacos");
            }
        });

        burritosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Burritos");
            }
        });

        nachosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Nachos");
            }
        });

        quesadillasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Quesadillas");
            }
        });

        specialtiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Specialties");
            }
        });

        SidesAndSweetsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Sides and Sweets");
            }
        });

        cravingsValueMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Cravings Value Menu");
            }
        });

        veggieCravingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) tacoBellPanel.getLayout();
                cl.show(tacoBellPanel, "Veggie Cravings");
            }
        });

        tacoBellPanel.add(menuPanel, "Menu");
        tacoBellPanel.add(breakfastPanel, "Breakfast");
        tacoBellPanel.add(tacosPanel, "Tacos");
        tacoBellPanel.add(burritosPanel, "Burritos");
        tacoBellPanel.add(nachosPanel, "Nachos");
        tacoBellPanel.add(quesadillasPanel, "Quesadillas");
        tacoBellPanel.add(specialtiesPanel, "Specialties");
        tacoBellPanel.add(SidesAndSweetsPanel, "Sides and Sweets");
        tacoBellPanel.add(cravingsValueMenuPanel, "Cravings Value Menu");
        tacoBellPanel.add(veggieCravingsPanel, "Veggie Cravings");

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 400, 100, 25);
        menuPanel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMacros(checkedItems, menuPanel);
            }
        });

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(300, 400, 100, 25);
        menuPanel.add(resetButton);

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetMacros(checkedItems, menuPanel, breakfastPanel, tacosPanel, burritosPanel, nachosPanel, quesadillasPanel, specialtiesPanel, SidesAndSweetsPanel, cravingsValueMenuPanel, veggieCravingsPanel);
            }
        });

        return tacoBellPanel;
    }
    
    public static JPanel createMcDonaldsPanel(JPanel mainPanel, List<MenuItem> checkedItems) {
        JPanel mcDonaldsPanel = new JPanel(new CardLayout());

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(null);

        JButton homeButton = new JButton("Home");
        homeButton.setBounds(50,25,150,25);
        menuPanel.add(homeButton);

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "Home");
            }
        });

        JButton breakfastButton = new JButton("Breakfast");
        breakfastButton.setBounds(50, 55, 150, 25);
        menuPanel.add(breakfastButton);

        JPanel breakfastPanel = new JPanel();
        breakfastPanel.setLayout(null);

        JLabel breakfastLabel = new JLabel("Breakfast Menu");
        breakfastLabel.setBounds(50, 50, 200, 25);
        breakfastPanel.add(breakfastLabel);

        JButton burgersButton = new JButton("Burgers");
        burgersButton.setBounds(50, 85, 150, 25);
        menuPanel.add(burgersButton);

        JPanel burgersPanel = new JPanel();
        burgersPanel.setLayout(null);

        JLabel burgersLabel = new JLabel("Burger Menu");
        burgersLabel.setBounds(50, 50, 200, 25);
        burgersPanel.add(burgersLabel);

        JButton chickenAndFishButton = new JButton("Chicken/Fish Sandwiches");
        chickenAndFishButton.setBounds(50, 115, 150, 25);
        menuPanel.add(chickenAndFishButton);

        JPanel chickenAndFishPanel = new JPanel();
        chickenAndFishPanel.setLayout(null);

        JLabel chickenAndFishLabel = new JLabel("Chicken/Fish Sandwich Menu");
        chickenAndFishLabel.setBounds(50, 50, 200, 25);
        chickenAndFishPanel.add(chickenAndFishLabel);

        JButton mcNuggetsButton = new JButton("McNuggets");
        mcNuggetsButton.setBounds(50, 145, 150, 25);
        menuPanel.add(mcNuggetsButton);

        JPanel mcNuggetsPanel = new JPanel();
        mcNuggetsPanel.setLayout(null);

        JLabel mcNuggetsLabel = new JLabel("McNuggets Menu");
        mcNuggetsLabel.setBounds(50, 50, 200, 25);
        mcNuggetsPanel.add(mcNuggetsLabel);

        JButton friesAndSidesButton = new JButton("Fries and Sides");
        friesAndSidesButton.setBounds(50, 175, 150, 25);
        menuPanel.add(friesAndSidesButton);

        JPanel friesAndSidesPanel = new JPanel();
        friesAndSidesPanel.setLayout(null);

        JLabel friesAndSidesLabel = new JLabel("Fries and Sides Menu");
        friesAndSidesLabel.setBounds(50, 50, 200, 25);
        friesAndSidesPanel.add(friesAndSidesLabel);

        JButton sweetsAndTreatsButton = new JButton("Sweets and Treats");
        sweetsAndTreatsButton.setBounds(50, 205, 150, 25);
        menuPanel.add(sweetsAndTreatsButton);

        JPanel sweetsAndTreatsPanel = new JPanel();
        sweetsAndTreatsPanel.setLayout(null);

        JLabel sweetsAndTreatsLabel = new JLabel("Sweets and Treats Menu");
        sweetsAndTreatsLabel.setBounds(50, 50, 200, 25);
        sweetsAndTreatsPanel.add(sweetsAndTreatsLabel);

        List<MenuItem> breakfast = mcDonaldsMenuItems.breakfast();
        List<MenuItem> burgers = mcDonaldsMenuItems.burgers();
        List<MenuItem> chickenAndFish = mcDonaldsMenuItems.chickenAndFish();
        List<MenuItem> mcNuggets = mcDonaldsMenuItems.mcNuggets();
        List<MenuItem> friesAndSides = mcDonaldsMenuItems.friesAndSides();
        List<MenuItem> sweetsAndTreats = mcDonaldsMenuItems.sweetsAndTreats();

        putCheckBoxesOnPanel(breakfast, breakfastPanel, checkedItems);
        putCheckBoxesOnPanel(burgers, burgersPanel, checkedItems);
        putCheckBoxesOnPanel(chickenAndFish, chickenAndFishPanel, checkedItems);
        putCheckBoxesOnPanel(mcNuggets, mcNuggetsPanel, checkedItems);
        putCheckBoxesOnPanel(friesAndSides, friesAndSidesPanel, checkedItems);
        putCheckBoxesOnPanel(sweetsAndTreats, sweetsAndTreatsPanel, checkedItems);

        JButton breakfastBackButton = new JButton("Back");
        breakfastBackButton.setBounds(50, 25, 150, 25);
        breakfastPanel.add(breakfastBackButton);

        breakfastBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "Menu");
            }
        });

        JButton burgersBackButton = new JButton("Back");
        burgersBackButton.setBounds(50, 25, 150, 25);
        burgersPanel.add(burgersBackButton);

        burgersBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "Menu");
            }
        });

        JButton chickenAndFishBackButton = new JButton("Back");
        chickenAndFishBackButton.setBounds(50, 25, 150, 25);
        chickenAndFishPanel.add(chickenAndFishBackButton);

        chickenAndFishBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "Menu");
            }
        });

        JButton mcNuggetsBackButton = new JButton("Back");
        mcNuggetsBackButton.setBounds(50, 25, 150, 25);
        mcNuggetsPanel.add(mcNuggetsBackButton);

        mcNuggetsBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "Menu");
            }
        });

        JButton friesAndSidesBackButton = new JButton("Back");
        friesAndSidesBackButton.setBounds(50, 25, 150, 25);
        friesAndSidesPanel.add(friesAndSidesBackButton);

        friesAndSidesBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "Menu");
            }
        });

        JButton sweetsAndTreatsBackButton = new JButton("Back");
        sweetsAndTreatsBackButton.setBounds(50, 25, 150, 25);
        sweetsAndTreatsPanel.add(sweetsAndTreatsBackButton);

        sweetsAndTreatsBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "Menu");
            }
        });

        breakfastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "Breakfast");
            }
        });

        burgersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "Burgers");
            }
        });

        chickenAndFishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "Chicken and Fish Sandwiches");
            }
        });

        mcNuggetsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "McNuggets");
            }
        });

        friesAndSidesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "Fries and Sides");
            }
        });

        sweetsAndTreatsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mcDonaldsPanel.getLayout();
                cl.show(mcDonaldsPanel, "Sweets and Treats");
            }
        });

        mcDonaldsPanel.add(menuPanel, "Menu");
        mcDonaldsPanel.add(breakfastPanel, "Breakfast");
        mcDonaldsPanel.add(burgersPanel, "Burgers");
        mcDonaldsPanel.add(chickenAndFishPanel, "Chicken and Fish Sandwiches");
        mcDonaldsPanel.add(mcNuggetsPanel, "McNuggets");
        mcDonaldsPanel.add(friesAndSidesPanel, "Fries and Sides");
        mcDonaldsPanel.add(sweetsAndTreatsPanel, "Sweets and Treats");

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 400, 100, 25);
        menuPanel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMacros(checkedItems, menuPanel);
            }
        });

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(300, 400, 100, 25);
        menuPanel.add(resetButton);

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetMacros(checkedItems, menuPanel, breakfastPanel, burgersPanel, chickenAndFishPanel, mcNuggetsPanel, friesAndSidesPanel, sweetsAndTreatsPanel);
            }
        });

        return mcDonaldsPanel;
    }


    // this function creates a checkbox and its functionality for each MenuItem, and if checked adds it to the list of checked items.
    public static JCheckBox checkItems(MenuItem menuItem, List<MenuItem> checkedItems) {
        JCheckBox checkbox = new JCheckBox(menuItem.getName());
    
        checkbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkbox.isSelected()) {
                    // Only add the item if it's not already in the list
                    if (!checkedItems.contains(menuItem)) {
                        checkedItems.add(menuItem);
                    }
                } else {
                    checkedItems.remove(menuItem);  // Remove the item when unchecked
                }
            }
        });
    
        return checkbox;
    }

    public static void putCheckBoxesOnPanel(List<MenuItem> menuItemsList, JPanel panel, List<MenuItem> checkedItems) {
        int yPosition = 90;
        int xPosition = 50;
        for (MenuItem menuItem : menuItemsList) {
            if (yPosition >= 480) {
                yPosition = 90;
                xPosition += 370;
            }
            JCheckBox checkbox = checkItems(menuItem, checkedItems);
            checkbox.setBounds(xPosition, yPosition, 300, 25);
            panel.add(checkbox);

            checkbox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (checkbox.isSelected()) {
                        checkedItems.add(menuItem);
                    }

                    else {
                        menuItem.setQuantity(0);
                        checkedItems.remove(menuItem);
                    }
                }
            });
            yPosition += 30;
        }
    }

    public static void calculateMacros(List<MenuItem> checkedItems, JPanel panel) {
        int totalCalories = 0;
        int totalProtein = 0;
        int totalCarbs = 0;
        int totalFat = 0;

        Component[] components = panel.getComponents();
        for (Component component : components) {
            if (component instanceof JLabel) {
                JLabel label = (JLabel) component;
                if (label.getText().startsWith("Calories") ||
                    label.getText().startsWith("Protein") ||
                    label.getText().startsWith("Carbs") ||
                    label.getText().startsWith("Fat")) {
                        panel.remove(label);
                    }
            }
        }

        for (MenuItem item : checkedItems) {
            totalCalories += item.getCalories();
            totalProtein += item.getProtein();
            totalCarbs += item.getCarbs();
            totalFat += item.getFat();
        }

        JLabel totalCaloriesLabel = new JLabel("Calories: " + totalCalories);
        totalCaloriesLabel.setBounds(50, 450, 200, 25);
        panel.add(totalCaloriesLabel);

        JLabel totalProteinLabel = new JLabel("Protein: " + totalProtein);
        totalProteinLabel.setBounds(50, 480, 200, 25);
        panel.add(totalProteinLabel);

        JLabel totalCarbsLabel = new JLabel("Carbs:" + totalCarbs);
        totalCarbsLabel.setBounds(50, 510, 200, 25);
        panel.add(totalCarbsLabel);

        JLabel totalFatLabel = new JLabel("Fat: " + totalFat);
        totalFatLabel.setBounds(50, 540, 200, 25);
        panel.add(totalFatLabel);

        //refresh panel with final calculation output
        panel.revalidate();
        panel.repaint();
    }

    public static void resetMacros(List<MenuItem> checkedItems, JPanel... panels) {
        checkedItems.clear();

        for (JPanel panel : panels) {
            Component[] components = panel.getComponents();
            for (Component component : components) {
                if (component instanceof JCheckBox) {
                    JCheckBox checkbox = (JCheckBox) component;
                    checkbox.setSelected(false);
                }

                if (component instanceof JLabel) {
                    JLabel label = (JLabel) component;
                    if (label.getText().startsWith("Calories") ||
                        label.getText().startsWith("Protein") ||
                        label.getText().startsWith("Carbs") ||
                        label.getText().startsWith("Fat")) {
                            panel.remove(label);
                        }
                }
            }
        panel.revalidate();
        panel.repaint();
        }

       

    }
}
