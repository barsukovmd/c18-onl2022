package task1;

// * 1) Список каталога
// * Написать метод который циклически просматривает содержимое заданного каталога и выводит на печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах.
// * Используем рекурсию.


import java.io.File;

import static java.util.Objects.nonNull;

public class Main {
    public static final String INPUT = "/Users/yauhenbarsukov";

    public static void main(String[] args) {
        readAllFilesFromDirectory(new File(INPUT));
    }

    public static void readAllFilesFromDirectory(File directory) {
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (nonNull(files)) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName() + " files name");
                    } else {
                        System.out.println(file.getName() + " catalog's name");
                        readAllFilesFromDirectory(file);
                    }
                }
            }
        }
    }
}
