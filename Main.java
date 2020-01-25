import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static String[] string = {"стол", "стул", "монитор", "колонки", "доска", "телефон", "стол",
            "шкаф", "телевизор", "монитор", "потолок", "пол", "лампа", "клавиатура",
            "телевизор", "мышка", "окно", "стакан", "шкаф", "ручка", "ручка", "ручка", "запятая"};

    public static void main(String[] args) {
        Main main = new Main();
        PhoneBook phoneBooks = new PhoneBook();
        System.out.println(main.listSearch(string));
        System.out.println(main.sameWord(string));
        phoneBooks.phoneBookMethod(new Person("Ivanov", "ivanov_1@mail.ru", "89111111111"));
        phoneBooks.phoneBookMethod(new Person("Ivanov", "ivanov_2@mail.ru", "89222222222"));
        phoneBooks.phoneBookMethod(new Person("Ivanov", "ivanov_3@mail.ru", "89333333333"));
        phoneBooks.phoneBookMethod(new Person("Petrov", "petrov_1@mail.ru", "89444444444"));
        phoneBooks.phoneBookMethod(new Person("Sidorov","sidorov_1@mail.ru", "89555555555"));
        phoneBooks.phoneBookMethod(new Person("Sidorov","sidorov_2@mail.ru", "89666666666"));
        phoneBooks.phoneBookMethod(new Person("Pavlov", "pavlov_1@mail.ru", "89777777777"));
        phoneBooks.phoneBookMethod(new Person("Pavlov", "pavlov_2@mail.ru", "89888888888"));
        phoneBooks.phoneBookMethod(new Person("Alekseev", "alekseev_1@mail.ru", "89999999999"));
        phoneBooks.phoneBookMethod(new Person("Dmitriev", "dmitriev_1@mail.ru", "89123456789"));
        System.out.println(phoneBooks.phoneBook);
        phoneBooks.getPhoneNumber(phoneBooks.phoneBook, "Ivanov");
        phoneBooks.getEmail(phoneBooks.phoneBook,"Ivanov");
    }

    // Первое задание.
    private ArrayList <String> listSearch(String[] array) {
        HashSet <String> sortArray = new HashSet<>();
        ArrayList <String> differentWord = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            sortArray.add(array[i].toLowerCase());
        }
        for (String word : sortArray) {
            differentWord.add(word);
        }
        return differentWord;
    }

    private HashMap <String,Integer> sameWord (String[] array) {
        HashMap <String, Integer> words = new HashMap<>();
        int count = 1;
        for(int i = 0; i < array.length; i++) {
            if(words.containsKey(array[i])){
                count = words.get(array[i]);
                words.put(array[i], count +1);
                count = 1;
            } else { words.put(array[i],count); }
        } return words;
    }
}
