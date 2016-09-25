package projeto_fl.Classes.Persistencias;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.HashMap;

 

public class PersistenciaProducao {
                private File arq;
                  
                private int indice;
                private int valor;
                
                public PersistenciaProducao(String nomeArq){
                               arq = new File(nomeArq);
                }
                public void escrita(String m, String p, String i){  // m = máquina p = meta i = producao/irog

                               try{

                                               FileWriter fileWriter = new FileWriter(arq, true);

                                               PrintWriter printWriter = new PrintWriter(fileWriter, true);

                                               String prod = m+";"+p+";"+i;

                                               printWriter.println(prod);

                                               printWriter.flush();

                                               printWriter.close();

                               }catch(Exception e){
                                               System.out.println(e);
                               }

                }

                public HashMap leitura(int indice,int valor){

                               String linhaLida = "";

                               HashMap retorno = new HashMap();

                               String[] conteudoSeparado = new String[3];

                               try{

                                               FileReader arqLeitura = new FileReader(arq);

                                               BufferedReader leitor = new BufferedReader(arqLeitura);

                                               while((linhaLida=leitor.readLine())!=null){
                                                                
                                                               conteudoSeparado = linhaLida.split(";");
                                                                
                                                               String indicex = conteudoSeparado[indice].trim();
                                                               ArrayList<String> valory = new ArrayList();
                                                               valory.add(conteudoSeparado[valor].trim());
                                                               valory.add(conteudoSeparado[2].trim());

                                                               retorno.put(indicex, valory);

                                               }

                                               arqLeitura.close();

                                               leitor.close();

                               }catch(Exception e){

                                               System.out.println(e);

                               }

                               return retorno;

                }

}