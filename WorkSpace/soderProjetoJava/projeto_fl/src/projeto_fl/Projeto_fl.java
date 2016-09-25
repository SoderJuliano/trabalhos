package projeto_fl;

import Telas.InterfacePrensas;
import java.io.File;
import java.io.FileInputStream;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import javafx.scene.control.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import projeto_fl.Classes.Persistencias.Caminho_Persistencia;
import projeto_fl.Classes.Persistencias.Persistencia;
import projeto_fl.Classes.Siblo;

/**
 *
 * @author soder
 */
public class Projeto_fl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         /*Calendar calendario = Calendar.getInstance();
         System.out.println(calendario.get(Calendar.DAY_OF_MONTH));*/
        
        Siblo prensas = new Siblo();
        
        //System.out.println( prensas.pegarDescricao());
        
        Caminho_Persistencia p = new Caminho_Persistencia();
        Caminho_Persistencia p1 = new Caminho_Persistencia();
        
        Caminho_Persistencia producao = new Caminho_Persistencia();
        
       p.persistencia("FUNCIONARIOS _LINHA.txt");
       p1.persistencia("FUNCIONARIOS.txt");
       
         String DB = p.getCaminho();
         String DB1 = p1.getCaminho();
         
        Persistencia db = new Persistencia(DB);
        Persistencia db1 = new Persistencia(DB1);
        
        HashMap listaPessoas = db.leitura(1, 0);
        HashMap listaPessoas1 = db1.leitura(1, 0);
        
       InterfacePrensas ip = new InterfacePrensas();
       ip.setVisible(true);
    }
    
}
