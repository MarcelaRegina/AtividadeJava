package Exercicio02_Java;
import Exercicio02_Java.Homem;
import Exercicio02_Java.Mulher;
import Exercicio02_Java.Pessoa;
import Exercicio02_Java.PessoaIMC;
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("------CALCULO IMC------");

        int j = 0;

        System.out.println("Digite a quantidade de pessoas que você quer cadastrar: ");
        Scanner tamArray = new Scanner(System.in);
        int arrayTam = tamArray.nextInt();

        System.out.println("Qual você quer cadastrar: 1 - HOMEM | 2 - MULHER");
        Scanner tipoPessoa = new Scanner(System.in);
        int pessoaTipo = tipoPessoa.nextInt();

        switch (pessoaTipo) {

            case 1:
                ArrayList listaHomem = new ArrayList<Homem>();

                for (int i = 0; i < arrayTam; i++) {

                    System.out.println("\nDigite o nome do Homem: ");
                    Scanner nomePessoa = new Scanner(System.in);
                    String nome = nomePessoa.nextLine();

                    System.out.println("Digite a data de nascimento:(dd/mm/aaaa) ");
                    Scanner dataNasc = new Scanner(System.in);
                    String NascPessoa = dataNasc.nextLine();

                    System.out.println("Digite o peso: ");
                    Scanner pesoPessoa = new Scanner(System.in);
                    Double peso = pesoPessoa.nextDouble();

                    System.out.println("Digite a altura: ");
                    Scanner pessoaAltura = new Scanner(System.in);
                    Double altura = pessoaAltura.nextDouble();

                    listaHomem.add(i, (new Homem(nome, NascPessoa, peso, altura)));
                }

                while (j < listaHomem.size()) {

                    System.out.println(listaHomem.get(j));

                    j++;
                }

                break;

            case 2:
                ArrayList listaMulher = new ArrayList<Mulher>();

                for (int i = 0; i < arrayTam; i++) {

                    System.out.println("\nDigite o nome da mulher: ");
                    Scanner nomePessoa = new Scanner(System.in);
                    String nome = nomePessoa.nextLine();

                    System.out.println("Digite a data de nascimento: (dd/mm/aaaa)");
                    Scanner dataNasc = new Scanner(System.in);
                    String NascPessoa = dataNasc.nextLine();

                    System.out.println("Digite o peso: ");
                    Scanner pesoPessoa = new Scanner(System.in);
                    Double peso = pesoPessoa.nextDouble();

                    System.out.println("Digite a altura: ");
                    Scanner pessoaAltura = new Scanner(System.in);
                    Double altura = pessoaAltura.nextDouble();

                    listaMulher.add(i, (new Mulher(nome, NascPessoa, peso, altura)));
                }

                while (j < listaMulher.size()) {

                    System.out.println(listaMulher.get(j));

                    j++;
                }
            break; 

            default:  
                System.out.println("Digite 1 ou 2");
            break;

        }

        

    }
}