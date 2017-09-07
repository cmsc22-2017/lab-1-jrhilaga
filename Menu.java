interface Menu {}

class soup implements Menu{
  Info soup;
  boolean isVeg;
  
  soup(Info soup, boolean isVeg){
    this.soup = soup;
    this.isVeg = isVeg;
  }
}
class salad implements Menu{
  Info salad;
  boolean isVeg;
  String dressing;
 
  salad(Info salad, boolean isVeg, String dressing){
    this.salad = salad;
    this.isVeg = isVeg;
    this.dressing = dressing;
  }
}
class sandwich implements Menu{
  Info sandwich;
  String bread;
  String fill1;
  String fill2;
  
  sandwich(Info sandwich, String bread, String fill1, String fill2){
    this.sandwich = sandwich;
    this.bread = bread;
    this.fill1 = fill1;
    this.fill2 = fill2;
  }
}
class Info{
  String name;
  double price;
  
  Info(String name, double price){
    this.name = name;
    this.price = price;
  }
}
class ExamplesMenu{
  Info soup1 = new Info("Veggie soup", 100);
  Menu Soup_1 = new soup(soup1,true);
  Info soup2 = new Info("Meatie soup", 100);
  Menu Soup_2 = new soup(soup2,false);
  Info salad1 = new Info("Veggie Salad", 100);
  Menu Salad_1 = new salad(salad1,true,"Vege sauce");
  Info salad2 = new Info("Meatie Salad", 100);
  Menu Salad_2 = new salad(salad2,false,"Meat sauce");
  Info sw1 = new Info("Sand wich", 100);
  Menu Sandwich_1 = new sandwich(sw1,"Toasted","Peanut butter","Jelly");
  Info sw2 = new Info("Stone wich", 100);
  Menu Sandwich_2 = new sandwich(sw1,"Gardenia","Ham","Cheese");
}
