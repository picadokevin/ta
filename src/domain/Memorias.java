// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package domain;

import domain.Catalogo;

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

    public Memorias(String titulo, String fechaIngreso, Autores Autor,String Resumen,String Abstract,String conferecinaPresentada) {
        super(titulo, fechaIngreso, Autor);
        this.Resumen=Resumen;
        this.Abstract=Abstract;
        this.conferenciaPresentada=conferenciaPresentada;
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
