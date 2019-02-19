/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.edu.br.Livro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Cliente
 */
public class PersistirEmArquivo implements LivroIF{

    @Override
    public void salvar(Livro livro) {
      
          File file = new File("livro.txt");

 
       if (!file.exists()) {
              try {
                  file.createNewFile();
                 
                  ObjectOutputStream ot = new ObjectOutputStream(new FileOutputStream(file));
                  ot.writeObject(livro);
                  ot.close();
                } catch (IOException ex) {
                  Logger.getLogger(PersistirEmArquivo.class.getName()).log(Level.SEVERE, null, ex);
              }
               
            }
        
   
    }

    
    
    
}
    
