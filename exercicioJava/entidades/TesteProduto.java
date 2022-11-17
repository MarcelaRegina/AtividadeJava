package exercicioJava.entidades;
import exercicioJava.entidades.Produto;
import exercicioJava.entidades.Fornecedor;
public class TesteProduto {
    
    public static void main(String[] args){
        System.out.println();

        Fornecedor forn1 = new Fornecedor
        ("1234321","978787887","Zé Maria");
        
       Produto produto1 = new Produto
       (1,"TV LCD",3500,forn1);

       Fornecedor forn2 = new Fornecedor
       ("543212345","8132314545","Cláudio");

       Produto produto2 = new Produto
       (2,"notebook",2000, forn2);

       Produto produto3 = new Produto
       (3,"impressora",232, forn2);
    }
    //Produto com o mesmo codigo 
        //Produto produto5 = new Produto(3, "Monitor", (float) 3000.00, forn2);

        ConjuntoProdutos conjuntoProdutos = new ConjuntoProdutos();  

        //Adicionar produtos
         conjuntoProdutos.adicionarProdutos(produto1);
         conjuntoProdutos.adicionarProdutos(produto2);
         conjuntoProdutos.adicionarProdutos(produto3);
         conjuntoProdutos.adicionarProdutos(produto4);
 
         
         //Remover produto
         //conjuntoProdutos.removerProdutos(1);
 
         //Atualizar o nome
         //conjuntoProdutos.atualizarNome(2, "Teclado");
 
         //Atualizar o valor 
         //conjuntoProdutos.atualizarPreco(1, (float) 230.00);
 
         //Atualizar o valor do produto de acordo com uma porcentagem
         //conjuntoProdutos.atualizarPrecoPorcentagem(1, (float)10.0);
 
         //Mostrar os produtos
         conjuntoProdutos.mostrarProdutos();
     }

}  