package ge.edu.btu.davaleba2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        final Logger logger=Logger.getLogger(Main.class);
        File file = new File("C:\\Users\\user\\Downloads");
        Scanner scanner = new Scanner(System.in);
        System.out.println("shemoitanet sityva");
        String sityva = scanner.nextLine();
        String[] saxelebi = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File direktoria, String saxeli) {

                if (saxeli.toUpperCase().contains(sityva.toUpperCase())) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        logger.info("sityva: " + sityva);
        for (String fileName : saxelebi) {
            logger.info("shedegi: " + fileName);
        }
    }
}