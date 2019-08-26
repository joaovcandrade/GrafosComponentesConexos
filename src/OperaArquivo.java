import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;


public class OperaArquivo {

    /**
     * Lê um determinado arquivo .txt no diretório local.
     * @param fileName nome do arquivo .txt
     * @return conteúdo do arquivo.
     */
    public static ArrayList<String> LerArquivo(String fileName) {
        try {
            FileReader file = new FileReader(fileName);
            BufferedReader readFile = new BufferedReader(file);
            ArrayList<String> lines = new ArrayList<>();
            String contentLine = readFile.readLine();
            while (contentLine != null) {
                lines.add(contentLine);
                contentLine = readFile.readLine();
            }
            file.close();
            return  lines;
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
            return null;
        }
    }

    /**
     * Escreve em um arquivo destino nomeado fileName a string content
     * @param fileName nome do arquivo com diretorio e extensao onde sera escrito
     * @param content String a ser escrita no arquivo filename
     */
    public static void EscreverArquivo(String fileName, String content) {
        try {
            FileWriter file = new FileWriter(fileName);
            PrintWriter writeFile = new PrintWriter(file);
            writeFile.printf(content);
            file.close();

        } catch (IOException e) {
            System.out.println("Erro ao gravar um arquivo");
        }
    }

}

