package trabalhoDandoDeDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ID {

	static ArrayList<Integer> list = new ArrayList();
	static ArrayListAnySize<String> id = new ArrayListAnySize();
	static HashMap bloco = new HashMap();
	static HashMap posicao = new HashMap();
	
	public static void adicionarID(String id1, int bloco1, int posicao1){
		
			id.add(id1, id1);
			bloco.put(Integer.parseInt(id1), bloco1);
			posicao.put(bloco1+Integer.parseInt(id1), posicao1);
	}
	public void adicionarApenasBlocoPosicao(int id, int bloco1, int posicao1){
		bloco.put(id, bloco1);
		posicao.put(bloco1, posicao1);
	}
	public static String getDados(String id1){
		String mega;
		//System.out.println(" conteins "+id1);
		if(list.contains(Integer.parseInt(id1))){
			int b = (int) bloco.get(Integer.parseInt(id1));
			int a = Integer.parseInt(id1);
			mega = "ID: "+id1+" Bloco: "+bloco.get(Integer.parseInt(id1))+" Posi��o: "+posicao.get(b+a);
		}else{
			mega = "erro!";
			//int a = Integer.parseInt(id1);
			//System.out.println(" conteins "+list.get(0));
		}
		return mega;
	}
	public static String getAll(){
		String mega = "";
		for(int i = 0; i<list.size(); i++){
			int a =list.get(i);
			int b = (int) bloco.get(list.get(i));
		//	System.out.println(a+b);
				mega+="\nID: "+list.get(i)+" Bloco: "+bloco.get(list.get(i))+" Posi��o: "+posicao.get(a+b)+" // nova linha...";
			
		}
		return mega;
	}
	public static void ordenar(){
		for(int i = 0; i<id.size(); i++){
			if(id.get(i)!=null){
				if(!list.contains(Integer.parseInt(id.get(i)))){
					list.add(Integer.parseInt(id.get(i)));
					//System.out.println(" adicionado "+id.get(i));
				}else{
					//if interno
				}
				}else{
				//System.out.println(" removido "+id.get(i));
			}
		}
		//System.out.println(" -> "+list.get(3));
	}
	public static boolean buscaBinaria(String in){
		int procura = Integer.parseInt(in);
		int dados = list.size();
		int indice = 0;
		int y = 0;
		if(!list.contains(Integer.parseInt(in))){
			System.out.println("n�o foi encontrado "+in);
		}else{
			while(indice==0){
				for(int x=0; x< list.size(); x++){
					if(list.get(x)==Integer.parseInt(in)){
						indice = y;
					}
					y++;
				}
				}
		        int meio;     
		        int inicio = 0;     
		        int fim = dados;     
		        while (inicio <= fim) {    
		                 meio = (inicio + fim)/2;
		                 if (procura == list.get(meio))     
		                          return true;     
		                 if (procura < list.get(meio))     
		                          fim = meio - 1;     
		                 else     
		                          inicio = meio + 1; 
		        }   
		    }
		return false;     
		}
	public boolean checkArray(){
		if(list.isEmpty()){
			return false;
		}else{
			return true;
		}
	}
		
}