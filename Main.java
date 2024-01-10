import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class Main{
    public static void main(String args[]){
        AnalisaCodigo();
    }

    public static void AnalisaCodigo(){
        List<String> ListaFeminina = new LinkedList<>();
        List<String> ListaMasculina = new LinkedList<>();

        Scanner s = new Scanner(System.in);
        boolean situation = true;

        while(situation){
            String sexo, nome;

            System.out.println("\nDigite o sexo da pessoa ou  'Sair' para sair: ");
            sexo = s.next();

            if(sexo.equalsIgnoreCase("Sair")){
                situation = false;
                continue;
            }

            System.out.println("Digite o nome da pessoa: ");
            nome = s.next();

            if(sexo.equalsIgnoreCase("Masculino")){
                ListaMasculina.add(nome);
            }
            if(sexo.equalsIgnoreCase("feminino")){
                ListaFeminina.add(nome);
            }
        }
        System.out.println("lista de nomes masculinos: " + ListaMasculina);
        System.out.println("lista de nomes Femininos: " + ListaFeminina);

    }
}