package br.com.hospital.controller;

import java.io.IOException;

import application.Main;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DashControl extends Main{

    @FXML
    private Button voltaTela;

    @FXML
    private Button funcionario;

    @FXML
    private Button medico;

    @FXML
    private Button paciente;

    @FXML
    private Button atendimento;
    
    @FXML
    private Button enfermeiro;
    
    @FXML
    private Button enfermidade;

    @FXML
    private Button enfermidadePessoal;

    @FXML
    private Button entradaPaciente;

    @FXML
    private Button adm;

    @FXML
    private Button gerente;

    @FXML
    void VoltaLogin(ActionEvent event) throws IOException {
    	openpage(Rotas.LOGIN);
	}

    @FXML
    void telaAdm(ActionEvent event) throws IOException {
    	openpage(Rotas.ADMINISTRADOR);
    }

    @FXML
    void telaAtendimento(ActionEvent event) throws IOException {
    	openpage(Rotas.ATENDIMENTO);
    }

    @FXML
    void telaEnfermidadePessoal(ActionEvent event) throws IOException {
    	openpage(Rotas.ENFERMIDADEPESSOAL);
    }

    @FXML
    void telaEntradaPaciente(ActionEvent event) throws IOException {
    	openpage(Rotas.ENTRADA);
    }

    @FXML
    void telaFuncionario(ActionEvent event) throws IOException {
    	openpage(Rotas.FUNCIONARIO);
    }

    @FXML
    void telaGerente(ActionEvent event) throws IOException {
    	openpage(Rotas.GERENTE);
    }

    @FXML
    void telaMedico(ActionEvent event) throws IOException {
    	openpage(Rotas.MEDICO);
    }

    @FXML
    void telaPaciente(ActionEvent event) throws IOException {
    	openpage(Rotas.PACIENTE);
    }
    @FXML
    void telaEnfermeiro(ActionEvent event) throws IOException {
    	openpage(Rotas.ENFERMEIRO);
    }
    @FXML
    void telaEnfermidade(ActionEvent event) throws IOException {
    	openpage(Rotas.ENFERMIDADE);
    }

}
