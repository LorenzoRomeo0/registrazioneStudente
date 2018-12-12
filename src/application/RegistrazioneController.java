/**
 * Sample Skeleton for 'Registrazione.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RegistrazioneController {
	ObservableList<String> options;
	private RegistrazioneModel r;
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="inputNome"
    private TextField inputNome; // Value injected by FXMLLoader

    @FXML // fx:id="inputCognome"
    private TextField inputCognome; // Value injected by FXMLLoader

    @FXML // fx:id="inputNascita"
    private TextField inputNascita; // Value injected by FXMLLoader

    @FXML // fx:id="inputSessione"
    private ComboBox<String> inputSessione; // Value injected by FXMLLoader

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML
    private TextArea outNome;

    @FXML
    private TextArea outCognome;

    @FXML
    private TextArea outData;

    @FXML
    private TextArea outSessione;

    @FXML
    private Button btnCerca;

    @FXML
    private Button btnDelete;

    @FXML
    private ComboBox<String> deleteChoice;

    @FXML
    private ComboBox<String> selezione;
    @FXML
    private TextField dataDel;
    @FXML
    void cerca(ActionEvent event) {
    	outNome.clear();
    	outCognome.clear();
    	outData.clear();
    	outSessione.clear();
    	if(selezione.getSelectionModel().getSelectedIndex()!=-1) {
    		String op= options.get(selezione.getSelectionModel().getSelectedIndex());
    		for(String s:r.cercaNome(op))
    			outNome.appendText(s+"\n");
    		for(String s:r.cercaCognome(op))
    			outCognome.appendText(s+"\n");
    		for(String s:r.cercaNascita(op))
    			outData.appendText(s+"\n");
    		for(String s:r.cercaSessione(op))
    			outSessione.appendText(s+"\n");
    	}
    }

    @FXML
    void delete(ActionEvent event) {
    	//IL PRIMO DELETE è FUNZIONANTE, IL SECONDO NON HO FATTO IN TEMPO A IMPLEMENTARLO CON GLI SPLIT. PERò è FUNZIONANTE ANCHE QUESTP.
	    	if(selezione.getSelectionModel().getSelectedIndex()!=-1 && !dataDel.getText().isEmpty()) {
	    		ObservableList<String> o = FXCollections.observableArrayList(r.delete(dataDel.getText()));
	    		deleteChoice.setItems(options);
	    	//if(r.delete(dataDel.getText()).size()>1){
	    		//r.delete(deleteChoice.getSelectionModel().getSelectedItem(r.delete(dataDel.getText()).get(0)));
	    	//}
	    	outNome.clear();
	    	outCognome.clear();
	    	outData.clear();
	    	outSessione.clear();
	    	
    	}
    }
    
    @FXML
    void insert(ActionEvent event) {
    	if(!(inputNome.getText().isEmpty() || inputCognome.getText().isEmpty() || inputNascita.getText().isEmpty() || inputSessione.getSelectionModel().getSelectedIndex()==-1)) {
    		r.addStudente(inputNome.getText(), inputCognome.getText(), inputNascita.getText(), options.get(inputSessione.getSelectionModel().getSelectedIndex()));
    	}
    }
    
    

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert inputNome != null : "fx:id=\"inputNome\" was not injected: check your FXML file 'Registrazione.fxml'.";
        assert inputCognome != null : "fx:id=\"inputCognome\" was not injected: check your FXML file 'Registrazione.fxml'.";
        assert inputNascita != null : "fx:id=\"inputNascita\" was not injected: check your FXML file 'Registrazione.fxml'.";
        assert inputSessione != null : "fx:id=\"inputSessione\" was not injected: check your FXML file 'Registrazione.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Registrazione.fxml'.";
        options = FXCollections.observableArrayList("25 gennaio", "3 febbraio", "20 giugno");
        inputSessione.setItems(options); 
        selezione.setItems(options);
    }

	public void setModel(RegistrazioneModel model) {
		r=model;
	}
}
