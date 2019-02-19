/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.edu.br.main;

import ifpb.edu.br.Livro.Livro;
import ifpb.edu.br.Livro.LivroIF;
import ifpb.edu.br.Livro.PersistirEmArquivo;
import ifpb.edu.br.Livro.PersistirEmSGBD;
import java.util.List;

/**
 *
 * @author Cliente
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Livro livro = new Livro("teste","escritor","abril",100,"testando descricao");
       LivroIF livroArquivo= new PersistirEmArquivo();
        LivroIF livroBD= new PersistirEmSGBD();
        
      
        livroBD.salvar(livro);
        livroArquivo.salvar(livro);
        
    }
    
}
