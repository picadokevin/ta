// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package domain;

import domain.Catalogo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import javax.swing.JOptionPane;

/************************************************************/
/**
 * 
 */
public class Memorias extends Catalogo {
	/**
	 * 
	 */
	private String Resumen;
	/**
	 * 
	 */
	private String Abstract;
	/**
	 * 
	 */
	private String conferenciaPresentada;

    public Memorias(String titulo, String fechaIngreso, String Autor,String Resumen,String Abstract,String conferecinaPresentada) {
        super(titulo, fechaIngreso, Autor);
        this.Resumen=Resumen;
        this.Abstract=Abstract;
        this.conferenciaPresentada=conferenciaPresentada;
    }
    public void Agregar(Memorias memoria) {
		// TODO Auto-generated method stub
	 PrintStream ps = getPrintStream("Memorias.txt");

        ps.println(memoria.getTitulo() + ";" + memoria.getFechaIngreso()+ ";" + memoria.getAutor()+ ";" + memoria.getResumen() + ";" + memoria.getAbstract()+";"+memoria.getConferenciaPresentada());
	}
    public PrintStream getPrintStream(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ps = new PrintStream(fos);

        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "error");
            
        }
        return ps;
    }

    public String getResumen() {
        return Resumen;
    }

    public void setResumen(String Resumen) {
        this.Resumen = Resumen;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    public String getConferenciaPresentada() {
        return conferenciaPresentada;
    }

    public void setConferenciaPresentada(String conferenciaPresentada) {
        this.conferenciaPresentada = conferenciaPresentada;
    }
};
