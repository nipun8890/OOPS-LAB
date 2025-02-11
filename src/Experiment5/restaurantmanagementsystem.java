package Experiment5;
import java.util.ArrayList;
import java.util.List;

// Base class Chef
class Chef {
    public void makeSpecialDish() {
        System.out.println("The chef is making a special dish.");
    }
}

// Subclass ItalianChef
class ItalianChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making pasta!");
    }
}

// Subclass ChineseChef
class ChineseChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making dumplings!");
    }
}

// Subclass MexicanChef
class MexicanChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making tacos!");
    }
}

public class restaurantmanagementsystem {
    public static void main(String[] args) {
        // Using an ArrayList (more flexible than a fixed-size array)
        List<Chef> chefs = new ArrayList<>();
        chefs.add(new ItalianChef());
        chefs.add(new ChineseChef());
        chefs.add(new MexicanChef());

        System.out.println("Using ArrayList:");
      
        for (Chef chef : chefs) {
            chef.makeSpecialDish(); 
        }
        Chef[] chefsArray = new Chef[3];
        chefsArray[0] = new ItalianChef();
        chefsArray[1] = new ChineseChef();
        chefsArray[2] = new MexicanChef();

        System.out.println("\nUsing Array:");
        for (Chef chef : chefsArray) {
            chef.makeSpecialDish(); 
        }
    }
}
