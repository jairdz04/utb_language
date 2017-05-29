/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springseedproject.controllers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.*;

/**
 *
 * @author Full Stack JavaScrip
 */
public class conexion {
   String resultado = "";
   
     public String conexion(String algoritmo) throws RecognitionException{
        try {
           /* FileInputStream fis = null;
            File f = new File("C:\\Users\\Full Stack JavaScrip\\Desktop\\SpringSeedProject-master\\src\\main\\java\\co\\edu\\utb\\softeng\\springseedproject\\controllers\\codigo.lbl");
            fis = new FileInputStream(f);*/
           InputStream var = new ByteArrayInputStream(algoritmo.getBytes(StandardCharsets.UTF_8));
            ANTLRInputStream input= new ANTLRInputStream(var);
            LenguajeUTBLexer lexer = new LenguajeUTBLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LenguajeUTBParser parser = new LenguajeUTBParser(tokens);
            LenguajeUTBParser.estructura_return result = parser.estructura();
            Tree t = (Tree)result.getTree();
            LenguajeUTBTree walker = new LenguajeUTBTree(new CommonTreeNodeStream(t));
            walker.estructura();
            if(walker.errores.isEmpty()){
                write_assemble wa = new write_assemble();
                wa.write(".data \n" + walker.variables + "\n .text \n"+ walker.flujo);
                 System.out.print(".data \n" + walker.variables + "\n .text \n"+ walker.flujo);
                //parser.estr;uctura();
                 //resultado = parser.estructura().getTree().    .getTree().toStringTree();
                
                resultado = t.toStringTree();//parser.estructura().getTree().toStringTree();
                  System.out.print("Estas claro");
                 // System.out.print(walker.TablaSimbolos.containsKey("$matriz"));
            }else{
                for(String a : walker.errores){
                    System.out.print(a + "\n");
                }
            }
            
            
           
        } catch (IOException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return resultado;
    } 
}
