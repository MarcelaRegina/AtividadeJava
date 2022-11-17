package exercicioJava.entidades;

public class Produto {
    private int codigo;
    private String nome;
    private float valor;
    private Fornecedor fornecedor;

    public Produto() {
    }


    public Produto(int codigo, String nome, float valor, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public Float atualizaPreco(Float porcentagem){
        if(porcentagem == 0 ){
            System.out.println("Porcentagem Invalida");
        } else{
            this.valor = this.valor * ((porcentagem/100)+1);  
        }   

        return this.valor;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Float getValor() {
        return valor;
    }


    public void setValor(Float valor) {
        this.valor = valor;
    }


    public Fornecedor getFornecedor() {
        return fornecedor;
    }


    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", fornecedor=" + fornecedor + "]";
    }
    
}
    