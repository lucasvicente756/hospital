package br.com.hospital.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import br.com.hospital.DAO.AtendimentoDAO;
import br.com.hospital.model.Funcionario;
import br.com.hospital.util.Rotas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import br.com.hospital.DAO.FuncionarioDAO;

public class EditarFuncControl extends Main  implements Initializable{
 
    @FXML
    private TableColumn<Funcionario, String> idStatus;

    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnExcluir;

    @FXML
    private TableColumn<Funcionario, String> idLogin;

    @FXML
    private TableView<Funcionario> ListaFuncionario;

    @FXML
    private TableColumn<Funcionario, String> idSenha;

    @FXML
    void EntrarSistema(ActionEvent event) {
    	
    }
    
 

    @FXML
    void voltarTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
   
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		idSenha.setCellValueFactory(new PropertyValueFactory<>("login"));
		idLogin.setCellValueFactory(new PropertyValueFactory<>("senha"));
		idStatus.setCellValueFactory(new PropertyValueFactory<>("statusUsuario"));
		
		FuncionarioDAO atdao = new FuncionarioDAO();
		List<Funcionario> funcionarios = atdao.select();

		System.out.println("Func " + funcionarios.size());
		ObservableList<Funcionario> obsFun = FXCollections.observableArrayList(funcionarios);

		ListaFuncionario.setItems(obsFun);
		
	}
    

}
