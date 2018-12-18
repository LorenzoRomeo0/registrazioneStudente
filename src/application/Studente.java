package application;

import java.sql.Date;

public class Studente {
	private String nome;
	private String cognome;
	//private String nascita;
	private Date nascita;
	private String sessione;
	
	Studente(String n, String c, Date nascita, String sessione){
		nome=n;
		cognome=c;
		this.nascita=nascita;
		this.sessione=sessione;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getNascita() {
		return nascita;
	}
	public void setNascita(Date nascita) {
		this.nascita = nascita;
	}
	public String getSessione() {
		return sessione;
	}
	public void setSessione(String sessione) {
		this.sessione = sessione;
	}
}	
