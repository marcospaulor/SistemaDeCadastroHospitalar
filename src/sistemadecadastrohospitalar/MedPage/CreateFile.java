/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastrohospitalar.MedPage;

import java.io.IOException;
import java.io.*;

/**
 *
 * @author marco
 */
public class CreateFile {
    public static void main(String[] args) throws IOException {
        try{
            File myObj = new File("C:\\SMH\\diagnosis\\filename.docx");
            if(myObj.createNewFile()){
                System.out.println("File created");
            } else {
                System.err.println("File already exists");
            }
        
            FileWriter file = new FileWriter("filename.docx");
            file.write("FOi escrito tudo que deseja!");
            file.close();
        } catch (IOException e) {
            System.err.println("Ocorreu algum erro");
            e.printStackTrace();
        }
    }
}
