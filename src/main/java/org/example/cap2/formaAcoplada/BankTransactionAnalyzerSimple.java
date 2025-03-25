package org.example.cap2.formaAcoplada;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "C:\\Users\\joaov\\IdeaProjects\\DSRJ\\src\\main\\java\\org\\example\\cap2\\formaAcoplada\\transacoes.csv";

    public static void main(String[] args) throws IOException {

        final Path path = Paths.get(RESOURCES);

        final List<String> lines = Files.readAllLines(path);

        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        double total = 0d;

        double total2 = 0d;

        for(final String line: lines){
            final String[] columns = line.split(",");

            final double amount = Double.parseDouble(columns[1]);

            final LocalDate date = LocalDate.parse(
                    columns[0], dateTimeFormatter
            );

            if (date.getMonth() == Month.JANUARY){
                final double amountMont = Double.parseDouble(columns[1]);
                total2 += amountMont;
            }



            total += amount;

        }


        System.out.println("O total para todas transações é : " + total);
        System.out.println("O total para todas transações em Janeiro foi : " + total2);

    }

}
