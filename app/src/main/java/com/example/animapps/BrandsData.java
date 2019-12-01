package com.example.animapps;

import java.util.ArrayList;

public class BrandsData {
    private static String[] brandNames = {
            "Aston Martin",
            "Audi",
            "Bentley",
            "BMW",
            "Buggati",
            "Dodge",
            "Ferrari",
            "Cadillac",
            "Jaguar",
            "Jeep"
    };

    private static String[] brandDetails = {
            "Aston Martin Lagonda Global Holdings plc is a British independent manufacturer of luxury sports cars and grand tourers. It was founded in 1913 by Lionel Martin and Robert Bamford. Steered from 1947 by David Brown, it became associated with expensive grand touring cars in the 1950s and 1960s, and with the fictional character James Bond following his use of a DB5 model in the 1964 film Goldfinger. Their sports cars are regarded as a British cultural icon.",
            "Audi AG is a German automobile manufacturer that designs, engineers, produces, markets and distributes luxury vehicles. Audi is a member of the Volkswagen Group and has its roots at Ingolstadt, Bavaria, Germany. Audi-branded vehicles are produced in nine production facilities worldwide.",
            "Bentley Motors Limited is a British manufacturer and marketer of luxury cars and SUVs—and a subsidiary of the Volkswagen Group since 1998. Headquartered in Crewe, England, the company was founded as Bentley Motors Limited by W. O. Bentley in 1919 in Cricklewood, North London—and became widely known for winning the 24 Hours of Le Mans in 1924, 1927, 1928, 1929 and 1930.",
            "Bayerische Motoren Werke AG, commonly referred to as BMW, is a German multinational company which produces automobiles and motorcycles. The company was founded in 1916 as a manufacturer of aircraft engines, which it produced from 1917 until 1918 and again from 1933 to 1945. Automobiles are marketed under the brands BMW, Mini and Rolls-Royce, and motorcycles are marketed under the brand BMW Motorrad. In 2015, BMW was the world's twelfth-largest producer of motor vehicles, with 2,279,503 vehicles produced.",
            "Automobiles Ettore Bugatti was a French car manufacturer of high-performance automobiles, founded in 1909 in the then-German city of Molsheim, Alsace by the Italian-born industrial designer Ettore Bugatti. The cars were known for their design beauty and for their many race victories. Famous Bugattis include the Type 35 Grand Prix cars, the Type 41 \"Royale\", the Type 57 \"Atlantic\" and the Type 55 sports car.",
            "Dodge is an American brand of automobile manufactured by FCA US LLC (formerly known as Fiat Chrysler Group LLC), based in Auburn Hills, Michigan. Dodge vehicles currently include performance cars, though for much of its existence Dodge was Chrysler's mid-priced brand above Plymouth. Founded as the Dodge Brothers Company machine shop by brothers Horace Elgin Dodge and John Francis Dodge in the early 1900s",
            "Ferrari is an Italian luxury sports car manufacturer based in Maranello. Founded by Enzo Ferrari in 1939 out of Alfa Romeo's race division as Auto Avio Costruzioni, the company built its first car in 1940. However, the company's inception as an auto manufacturer is usually recognized in 1947, when the first Ferrari-badged car was completed.",
            "Cadillac is a division of the American automobile manufacturer General Motors (GM) that designs and builds luxury vehicles. Its major markets are the United States, Canada, and China. Cadillac vehicles are distributed in 34 additional markets worldwide. Cadillac automobiles are at the top of the luxury field within the United States. In 2017, Cadillac's U.S. sales were 156,440 vehicles and its global sales were the second highest in the brand's history at 356,467 vehicles.",
            "Jaguar is the luxury vehicle brand of Jaguar Land Rover, a British multinational car manufacturer with its headquarters in Whitley, Coventry, England. Jaguar Cars was the company that was responsible for the production of Jaguar cars until its operations were fully merged with those of Land Rover to form Jaguar Land Rover on 1 January 2013.",
            "Jeep is a brand of American automobile and division of FCA US LLC (formerly Chrysler Group, LLC), a wholly owned subsidiary of the Italian-American corporation Fiat Chrysler Automobiles. Jeep has been a part of Chrysler since 1987, when Chrysler acquired the Jeep brand, along with remaining assets, from its previous owner American Motors Corporation (AMC).",
    };

    private static int[] brandLogo = {
            R.drawable.aston_martin55,
            R.drawable.audi55,
            R.drawable.bentley55,
            R.drawable.bmw55,
            R.drawable.bugatti55,
            R.drawable.dodge55,
            R.drawable.ferrari55,
            R.drawable.cadillac55,
            R.drawable.jaguar55,
            R.drawable.jeep55
    };

    static ArrayList<Brand> getListData(){
        ArrayList<Brand> list = new ArrayList<>();
        for (int position = 0; position < brandNames.length; position++){
            Brand brand = new Brand();
            brand.setName(brandNames[position]);
            brand.setDetail(brandDetails[position]);
            brand.setPhoto(brandLogo[position]);
            list.add(brand);
        }
        return list;
    }
}
