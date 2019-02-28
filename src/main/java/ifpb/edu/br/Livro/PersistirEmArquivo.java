/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.edu.br.Livro;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliente
 */
public class PersistirEmArquivo implements LivroIF {

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
