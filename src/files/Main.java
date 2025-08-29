package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//
//        Song деген класс тузолу(свойства:
//        title, author, text).
//        File тузуп, ырдын атын, авторун
//        жана текстин жазалы.
//                Fileды ачып, маалыматтарды song
//        деген объектке берели.
//                song деген объекттин
//        маалыматтарын консольго
//        чыгаралы.
        FileWriter fileWriter = new FileWriter("java19.txt");
        fileWriter.write("""
                Эрнис 	Жайчибеков\s
                Абдували	Бакытбеков
                Айбийке	Азимжанова\s
                Бектурсун	Анарбеков\s
                Анара	Джунушбекова \s
                Асгадбек	Ниязов\s
                Султан	Жумабеков\s
                Эрнис	Тургунбай уулу
                Бекмурат	Аманов
                Тансулуу	Маманова
                Лукман	Нурмаматов
                Сайкал	Касмаалиева\s
                Жакыпбек	Жамшитбек уулу \s
                Аяна	Урматова
                Марлен	Асанов
                Искендер	Абдихалил уулу
                Бекнур	Кубатов
                Нурпери	Эсенбайева
                Нурпазыл	Набиев
                """);
        fileWriter.close();


        FileReader fileReader = new FileReader("java19.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        fileReader.close();

    }
}
