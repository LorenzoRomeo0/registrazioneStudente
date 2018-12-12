package application;

import java.time.LocalDate;

public class Studente {
	private String nome;
	private String cognome;
	private String nascita;
	private String sessione;
	Studente(String n, String c, String nascita, String sessione){
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
	public String getNascita() {
		return nascita;
	}
	public void setNascita(String nascita) {
		this.nascita = nascita;
	}
	public String getSessione() {
		return sessione;
	}
	public void setSessione(String sessione) {
		this.sessione = sessione;
	}
}	
