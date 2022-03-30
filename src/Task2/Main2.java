package Task2;

import java.util.ArrayList;

public class Main2 {
    public static ArrayList<Integer> getSortNumbs(ArrayList<Integer> numbs) throws ArrayThreeNumberException {
        for (int i = 0; i < numbs.size() - 1; i++) {
            for (int j = 0; j < numbs.size() - i - 1; j++) {
                if (numbs.get(j) > numbs.get(j + 1)) {
                    Integer temp = numbs.get(j);
                    numbs.set(j, numbs.get(j + 1));
                    numbs.set(j + 1, temp);
                }
            }
        }
        int k = 0;

        for (int i = 0; i < numbs.size(); i++) {
            System.out.println(numbs.get(i));
            if (numbs.get(i) % 3 == 0) {
                k++;
                if (k > 5) {
                    throw new ArrayThreeNumberException(i, "Чисел делящихся на 3 больше 5");
                }
            }
        }
        return numbs;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.add(5);
        numbs.add(15);
        numbs.add(45);
        numbs.add(5);
        numbs.add(63);
        numbs.add(47);
        numbs.add(21);
        numbs.add(66);
        numbs.add(88);
        numbs.add(95);
        numbs.add(3);
        numbs.add(36);
        numbs.add(41);

        try{getSortNumbs(numbs);}
        catch (ArrayThreeNumberException e){
            System.out.println(e.getIndex()+" "+e.getMessage());
        }
    }
}
