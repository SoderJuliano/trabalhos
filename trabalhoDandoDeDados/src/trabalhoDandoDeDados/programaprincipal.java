package trabalhoDandoDeDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class programaprincipal {
	
		public static void main(String[] args) {
		
			ID id = new ID();
			/*id.adicionarID("101",10,2005);
			id.adicionarID("002",10,2008);
			id.adicionarID("005",100,27);
			id.adicionarID("015",10,2009);
			id.adicionarID("006",01,2007);
			id.adicionarID("011",12,2009);
			id.ordenar();
			System.out.println(id.getAll());
			System.out.println(id.getDados("005"));
			System.out.println("busca binaria "+id.buscaBinaria("002"));*/
			
			
			int opcao = 5;

            String valor1 = null;

            String valor2 = null;
            
            String valor3 = null;

Scanner entrada = new Scanner(System.in);
 Scanner entrada2 = new Scanner(System.in);
    Scanner entrada3 = new Scanner(System.in);

while(opcao!=0){

            System.out.println("escolha uma op��o: \n0 (sair)\n1 (adicionar dados)\n2 (buscar 1 dado usando o ID)\n3 (ver todos os registros)\n4 (fazer busca binaria de 1 registro)");

            opcao = entrada.nextInt();

            switch (opcao){
            	
                           case 0: break;

                           case 1:
                                
           boolean teste = false;
           System.out.println("ID:");
           do{
            valor1 = entrada.nextLine();
            if(valor1.isEmpty()){
                teste = false;
            }else{
                teste = true;
            }
           }while(teste==false);
           char[] validacao = valor1.toCharArray();
           if(validacao.length!=3){
               System.out.println("O ID deve possuir 3 caracteres");
               break;
           }
           
            System.out.println("bloco (3 digitos num�ricos):");

            valor2 = entrada.nextLine();
            char[] validacao2 = valor2.toCharArray();
            if(validacao2.length!=3){
               System.out.println("O bloco deve possuir 3 caracteres");
               break;
            }
            System.out.println("posi��o no bloco (2 digitos num�ricos):");

            valor3 = entrada2.nextLine();
            char[] validacao3 = valor3.toCharArray();
            if(validacao3.length!=2){
               System.out.println("a posi��o deve possuir 2 caracteres");
               break;
            }
            id.adicionarID(valor1,Integer.parseInt(valor2),Integer.parseInt(valor3));
            id.ordenar();
            break;

            case 2:
            String valor4 = null;
            while(valor4==null){
            System.out.println("entre com o ID:");
            
            valor4 = entrada2.nextLine();
            };
            System.out.println(id.getDados(valor4));

            break;

            case 3:

            	System.out.println(id.getAll());    

            break;
            
            case 4:
            	id.ordenar();
            String valor5 = null;
            while(valor5==null){
            System.out.println("entre com o ID para a procura:");
            valor5 = entrada3.nextLine();
            };
            System.out.println("busca binaria "+id.buscaBinaria("111"));
            break;
            }

}
		}

	
}