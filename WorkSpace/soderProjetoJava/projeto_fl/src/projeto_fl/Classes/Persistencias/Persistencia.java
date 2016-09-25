package projeto_fl.Classes.Persistencias;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.HashMap;

 

public class Persistencia {
                private File arq;
                  
                private int indice;
                private int valor;
                
                public Persistencia(String nomeArq){
                               arq = new File(nomeArq);
                }
                public void escrita(String s, String i){

                               try{

                                               FileWriter fileWriter = new FileWriter(arq, true);

                                               PrintWriter printWriter = new PrintWriter(fileWriter, true);

                                               String item = s+";"+i;

                                               printWriter.println(item);

                                               printWriter.flush();

                                               printWriter.close();

                               }catch(Exception e){
                                               System.out.println(e);
                               }

                }

                public HashMap leitura(int indice,int valor){

                               String linhaLida = "";

                               HashMap retorno = new HashMap();

                               String[] conteudoSeparado = new String[2];

                               try{

                                               FileReader arqLeitura = new FileReader(arq);

                                               BufferedReader leitor = new BufferedReader(arqLeitura);

                                               while((linhaLida=leitor.readLine())!=null){
                                                                
                                                               conteudoSeparado = linhaLida.split(";");
                                                                
                                                               String indicex = conteudoSeparado[indice];
                                                               String valory = conteudoSeparado[valor];
                                                               valory = valory.trim();

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