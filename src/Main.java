import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("nameFile1.txt");
        Scanner scanner = new Scanner(file);
        List<Integer> numbers = new ArrayList<>();


        Integer num = 50; //от какого числа вычитаем 10?

        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        int elem = numbers.indexOf(num); //элемент который надо заменить
//цикл для проверки, если таких чисел>1
        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i).equals(num)){
                numbers.set(elem, num - 10);
                elem = numbers.indexOf(num);
            }
        }


        FileWriter fr = new FileWriter(file);

        String resStr = new String();

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                resStr += numbers.get(i);
            } else {
                resStr += numbers.get(i) + " ";
            }
        }
        fr.write(resStr);
        fr.close();
    }
}