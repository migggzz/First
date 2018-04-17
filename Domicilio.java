import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;
import java.lang.Runtime;

public class Domicilio implements Serializable {

	protected String calle, numint, numext, colonia;
	protected String cp;
	protected Pais pais;

	public Domicilio() {
		this.calle = "";
		this.numint = "";
		this.numext = "";
		this.colonia = "";
		this.cp = "";
		this.pais = new Pais();
	}

	public Domicilio(String g_calle, String g_numint, String g_numext, String g_colonia, String g_cp, Pais g_pais) {
		this.calle = g_calle;
		this.numint = g_numint;
		this.numext = g_numext;
		this.colonia = g_colonia;
		this.cp = g_cp;
		this.pais = g_pais;
	}

	public void setCalle(String g_calle) {this.calle = g_calle;}
	public void setNumInt(String g_numint) {this.numint = g_numint;}
	public void setNumExt(String g_numext) {this.numext = g_numext;}
	public void setColonia(String g_colonia) {this.colonia = g_colonia;}
	public void setCP(String g_cp) {this.cp = g_cp;}
	public void setPais(Pais g_pais) {this.pais = g_pais;}

	public String getCalle() {return this.calle;}
	public String getNumInt() {return this.numint;}
	public String getNumExt() {return this.numext;}
	public String getColonia() {return this.colonia;}
	public String getCP() {return this.cp;}
	public Pais getPais() {return this.pais;}
}