package maps;
import java.util.HashMap;
import java.util.Map;

public class RestaurantExplorer {
    public static void main(String [] args) {
        // Step 1. Create a new empty HashMap.
        // The keys should be the names of the restaurant.
        // The values should be the restaurant objects.

        Map<String, Restaurant> restaurantMap = new HashMap<>();

        // Step 2. Add five restaurants to the map (hint: use put()).

        Restaurant shish = new Restaurant("Shish","med",4);
        Restaurant padThai = new Restaurant("Pad Thai","thai",3);
        Restaurant chickfila = new Restaurant("Chick-Fil-A","fast food", 5);
        Restaurant kimchi = new Restaurant("Kimchi and Tofu House", "korean",4);
        restaurantMap.put("Kyoto", new Restaurant("Kyoto","japanese",4));
        restaurantMap.put("Shish",shish);
        restaurantMap.put("Pad Thai",padThai);
        restaurantMap.put("Chick-Fil-A",chickfila);
        restaurantMap.put("Kimchi and Tofu House",kimchi);


        // Step 3. Print the names of each restaurant (hint: use keySet()).

        System.out.println(restaurantMap.keySet()); //keyset returns all the keys in the map

        //loop,stream print
        for(String i:restaurantMap.keySet()){
            System.out.println(i);
        }

        // Step 4. Remove one of the restaurants by name. Check to make sure
        // it no longer exists and print out the result (hint: use containsKey()).

        if(restaurantMap.containsKey("Chick-Fil-A")) {restaurantMap.remove("Chick-Fil-A");}
        System.out.println(restaurantMap.get("Chick-Fil-A"));

        // Step 5. Print the restaurant objects (hint: use values())

        //System.out.println(restaurantMap.values());

        for (Restaurant r:restaurantMap.values()){
            System.out.println(r);
        }

        // Step 6. Print the restaurant names and objects (hint: use entrySet()).

        System.out.println(restaurantMap.entrySet()); //prints everything keys and values

        for(Map.Entry r: restaurantMap.entrySet()){
            System.out.println(r);
        }

    }
}
