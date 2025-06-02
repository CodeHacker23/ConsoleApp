package org.example;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("1 - add word");
            System.out.println("2 - list words");

            System.out.println("3 - repetition");
            System.out.println("4 or ... - exit");

            String command = scanner.nextLine();
            switch (command) {
                case "1" -> {
                    Word word = createWord();
                    DataBase.list.add(word);
                }
                case "2" -> {
                    printWord(DataBase.list);
                }
                case "3" -> {


                }
                default -> {
                    return;
                }
            }
        }
    }

    public Word createWord() {
        System.out.println("Please enter word on RUS");
        String wordRus = scanner.nextLine();

        System.out.println("Please enter word on ENG");
        String wornEng = scanner.nextLine();

        return new Word(GenerationID.getId(), wordRus, wornEng);
    }

    public void printWord(List<Word> words) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (Word word : words) {
            stringBuilder.append(count).append(" ")
                    .append("RU - ").append(word.getRus())
                    .append(" | ")
                    .append(word.getEng()).append(" - EN")
                    .append("\n");
        }

        System.out.println(stringBuilder.toString());

    }
}
