package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static ArrayList<User> getSortByName(ArrayList<User> users){
        for (int i=0; i< users.size()-1; i++){
            for (int j=0; j< users.size()-i-1; j++){
                if (users.get(j).getName().compareTo(users.get(j+1).getName())>0){
                    User temp = users.get(j);
                    users.set(j, users.get(j+1));
                    users.set(j+1, temp);
                }
            }
        }
        return users;
    }
    public static void main(String[] args) {
        User user = new User();
        user.setId(111);
        user.setName("Ais");
        user.setAge(4);

        User user1 = new User(222, "Aino", 1);
        User user2 = new User(333, "Sammy", 28);
        User user3 = new User(444, "Jan", 32);
        User user4 = new User(555, "Tanya", 62);

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user3);
        users.add(user2);
        users.add(user4);
        Map<String, List<User>> userMap = new TreeMap<>();
        userMap.put("Family", users);

        ArrayList<User> users1 = new ArrayList<>();
        users1.add(new User(20, "Messi", 35));
        users1.add(new User(21, "Ronaldo", 37));
        users1.add(new User(22, "Neymar", 31));
        users1.add(new User(23, "Mbappe", 26));
        users1.add(new User(24, "Bale", 33));
        userMap.put("FootbalPlayers", users1);

        for (Map.Entry<String, List<User>> m: userMap.entrySet()){
            System.out.println(m);
        }

        ArrayList<User> users2 = new ArrayList<>();
        users2.add(new User(1, "Abyl", 30));
        users2.add(new User(2, "Oskar", 32));
        users2.add(new User(3, "Rake", 29));
        users2.add(new User(4, "China", 25));
        users2.add(new User(5, "Kana", 35));
        userMap.put("Friends", users2);

        for (Map.Entry<String, List<User>> map: userMap.entrySet()){
            ArrayList<User> users3 = getSortByName((ArrayList<User>)map.getValue());
            map.setValue(users3);
            System.out.println(map);
        }
    }
}