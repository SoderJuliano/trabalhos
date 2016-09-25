/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_fl.Classes.Persistencias;

import java.util.HashMap;

/**
 *
 * @author soder
 */
public class Caminho_Persistencia {

    private String caminhoMaquinas = "C/Users/soder/Desktop/SoderC_db/DB/MAQUINAS/";
    private String caminhoPadrao = "C:/Users/soder/Desktop/SoderC_db/DB/";
    private String caminhoProducao2016 = "C:/Users/soder/Desktop/SoderC_db/DB/PRODUCAO2016/";
    
    private String caminhoMaquinasRetorno ;
    private String caminhoPadraoRetorno ;
    private String caminhoProducao2016Retorno ;


    public void setArquivoNome(String nome){
        this.caminhoMaquinasRetorno = (caminhoMaquinas+nome);
    }
    public String getArquivoNome(){
        return this.caminhoMaquinasRetorno;
    }
    public void persistencia(String nomeArquivo){
        this.caminhoPadraoRetorno = (caminhoPadrao+nomeArquivo);
    }
    public String getCaminho(){
        return this.caminhoPadraoRetorno;
    }
    public void setCaminhoProducao(String linha, String arquivo){
        this.caminhoProducao2016Retorno = (caminhoProducao2016+linha+"/"+arquivo+".txt");
    }
    public String getCaminhoProducao2016Retorno(){
        return this.caminhoProducao2016Retorno;
    }
}
