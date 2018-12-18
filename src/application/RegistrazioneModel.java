package application;

import java.sql.Date;
import java.util.ArrayList;

public class RegistrazioneModel {
	ArrayList<Studente> studenti;
	
	RegistrazioneModel(){
		studenti=new ArrayList<Studente>();
	}
	
	void addStudente(String nome, String cognome, Date nascita, String sessione) {
		studenti.add(new Studente(nome, cognome, nascita, sessione));
		System.out.println(studenti.toString());
		//System.out.println(studenti.get(studenti.size()).getNome() +" "+studenti.get(studenti.size()).getCognome() +" "+studenti.get(studenti.size()).getNascita() +" "+studenti.get(studenti.size()).getSessione());
	}
	
	public ArrayList<String> cercaNome(String sessione){
		ArrayList<String> s=new ArrayList<String>();
		for(Studente p:studenti) {
			if(p.getSessione().equals(sessione))
				s.add(p.getNome());
		}
		return s;
	}
	public ArrayList<String> cercaCognome(String sessione){
		ArrayList<String> s=new ArrayList<String>();
		for(Studente p:studenti) {
			if(p.getSessione().equals(sessione))
				s.add(p.getCognome());
		}
		return s;
	}
	public ArrayList<Date> cercaNascita(String sessione){
		ArrayList<Date> s=new ArrayList<Date>();
		for(Studente p:studenti) {
			if(p.getSessione().equals(sessione))
				s.add(p.getNascita());
		}
		return s;
	}
	public ArrayList<String> cercaSessione(String sessione){
		ArrayList<String> s=new ArrayList<String>();
		for(Studente p:studenti) {
			if(p.getSessione().equals(sessione))
				s.add(p.getSessione());
		}
		return s;
	}
	
	public ArrayList<String> delete(String data) {
		ArrayList<String> s=new ArrayList<String>();
		for(Studente p:studenti) {
			if(p.getNascita().equals(data))
				s.add(p.getNome()+" "+ p.getCognome());
		}
		if(s.size()==1)
			studenti.remove(0);
		return s;
	}
	
	public void delete(String nome, String cognome, String data, String sessione) {
		ArrayList<String> s=new ArrayList<String>();
		for(Studente p:studenti) {
			if(p.getNascita().equals(data) && p.getNome().equals(nome)&& p.getCognome().equals(cognome)&& p.getSessione().equals(sessione))
				s.add(p.getNome()+" "+ p.getCognome());
		}
		if(s.size()==1)
			studenti.remove(0);
	}
	
}
