package org.example.cap2.addSRP;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyzer {

    private static final String RESOURCES = "C:\\Users\\joaov\\IdeaProjects\\DSRJ\\src\\main\\java\\org\\example\\cap2\\addSRP\\transacoes.csv";

    public static void main(String[] args) throws IOException {
        final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();

        final Path path = Paths.get(RESOURCES);

        final List<String> lines = Files.readAllLines(path);


        final List<BankTransaction> bankTransactions = bankStatementCSVParser.parseLinesFromCSV(lines);


    }

}
