/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springseedproject.controllers;

import java.io.*;
/**
 *
 * @author JairA
 */
public class write_assemble {
    public void write(String codigo){
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        
        try{
          f = new File("E:\\Documentos\\LenguajeU-master\\src\\main\\webapp\\WEB-INF\\assets\\codigo_assembler.txt");
          w = new FileWriter(f);
          bw = new BufferedWriter(w);
          wr = new PrintWriter(bw);
          wr.write(codigo);
          wr.close();
          bw.close();
          
        
        }catch(Exception ex){
            System.out.print("Error " + ex);
        }
    }
}
