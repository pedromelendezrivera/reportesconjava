
package controlador;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author PMELENDEZ
 */
public class GeneraExcel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        crearExcel();
    }
    
    public static void crearExcel(){
        
        Workbook book = new XSSFWorkbook(); // indica que se crea un archivo en excel
        //crear una hoja sheet en el libro book verificar compatibilidad de clases 
        org.apache.poi.ss.usermodel.Sheet sheet =  book.createSheet("java");
        try {
            FileOutputStream fileout = new FileOutputStream("ejemplo.xlsx"); //archivo de salida
            book.write(fileout); //indicar en que archivo se escribira
            fileout.close(); //indica que se cierre el archivo
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }        
    }
}

