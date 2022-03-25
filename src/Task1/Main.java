package Task1;

import java.util.*;
public class Main {
    public static ArrayList<User> getSortByName (ArrayList<User> users){
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
        Map<String, List<User>> userMap = new TreeMap<>();
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"Marat",30));
        users.add(new User(2,"Aslan",50));
        users.add(new User(3, "Anar",20));
        userMap.put("Madagaskar",users);
        ArrayList<User> users2 = new ArrayList<>();
        users2.add(new User(4,"Maral",20));
        users2.add(new User(5,"Asan",56));
        users2.add(new User(6, "Max",25));
        userMap.put("Shrek", users2);
        for (Map.Entry<String,List<User>> m : userMap.entrySet()){
            System.out.println(m);
        }

        ArrayList<User> users3 = new ArrayList<>();
        users3.add(new User(10, "Leo", 26));
        users3.add(new User(11, "Alex", 33));
        users3.add(new User(12, "Ais", 15));
        userMap.put("Ice period", users3);

        ArrayList<User> users1 = new ArrayList<>();
        users1.add(new User(21, "Aino", 1));
        users1.add(new User(22, "Sammy", 28));
        users1.add(new User(23, "Grammy", 62));
        userMap.put("Mortal Kombat", users1);

        for (Map.Entry<String, List<User>> map: userMap.entrySet()){
            List<User> usersMap1 = getSortByName((ArrayList<User>) map.getValue());
            map.setValue(usersMap1);
            System.out.println(map);
        }




    }
}