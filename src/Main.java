import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    /**
     * Abre a janela de inputs a serem escritas.
     * Extrai do arquivo de entrada os comandos e determina o nome e diretorio do arquivo de saida.
     * @param args
     */
    public static void main(String[] args) {//1. Create the frame.
        JFrame frame = new JFrame("Name Input");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel emptyLabel = new JLabel("Insira o nome do arquivo de entrada");
        frame.getContentPane().add(emptyLabel, BorderLayout.PAGE_START);

        JTextField fileNameInput = new JTextField(20);
        frame.add(fileNameInput, BorderLayout.CENTER);
        JButton submit = new JButton("Submit");
        frame.getContentPane().add(submit, BorderLayout.PAGE_END);
        frame.pack();

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputFileName = "inputs/"+fileNameInput.getText();
                String outputFileName = inputFileName;
                while (outputFileName.length()>6){
                    outputFileName= outputFileName.substring(1,outputFileName.length());
                }
                outputFileName = "outputs/output"+outputFileName;
                //System.out.println(inputFileName);
                //System.out.println(outputFileName);
                ArrayList<String> reader = OperaArquivo.LerArquivo(inputFileName);
                if(reader!=null){
                    String printInOutput = InterpretarArquivo.exercutarCommandos(reader);
                    OperaArquivo.EscreverArquivo(outputFileName, printInOutput);
                }else{
                    JOptionPane.showMessageDialog(frame, "ERRO: Arquivo Nao Encontrado");
                }
            }
        });
        frame.setVisible(true);

        /*
        Grafo grafo = new Grafo();
        grafo.adicionaNo(1);
        grafo.adicionaNo(2);
        grafo.adicionaNo(3);
        grafo.adicionaNo(4);
        System.out.println(grafo.connectedComponents);
        if(!grafo.relacionaNo(1,1)) System.out.println("CICLO!");
        */
    }
}
