package filereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileReader {
    
    public static void main(String[] args) {
        
        FileWriter arqW = null;
        try {
            BufferedReader lerArq = null;
            lerArq = new BufferedReader(new InputStreamReader(new FileInputStream("dataset.txt"), "UTF-8"));
            
            String linha = lerArq.readLine();
            int count = 0;
            while (linha != null) {
                arqW = new FileWriter("./datas/data_"+count+".txt");
                PrintWriter gravarArq = new PrintWriter(arqW);
                gravarArq.print(linha);
                arqW.close();
                count++;
                linha = lerArq.readLine();
            }
            
            
            } catch (IOException ex) {
                Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
