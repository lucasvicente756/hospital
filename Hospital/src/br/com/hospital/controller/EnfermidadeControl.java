package br.com.hospital.controller;

import java.awt.TextField;
import java.io.IOException;

import application.Main;
import br.com.hospital.DAO.EnfermidadeDAO;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class EnfermidadeControl extends Main{

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTipo;

    @FXML
    private Button btnEntrar;

    @FXML
    private TextArea txtDescricao;

    @FXML
    private Button btnVoltar;

    @FXML
    void EntrarSistema(ActionEvent event) {
    	String tipo = txtTipo.getText();
    	String nome = txtNome.getText();
    	String descricao = txtDescricao.getText();
    	EnfermidadeControl e = new EnfermidadeControl();
    	EnfermidadeDAO  enf = new EnfermidadeDAO();
    	e.setTipo(tipo);
    	e.setNome(nome);
    	e.setDescricao(descricao);
        enf.save(e);
    }

    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
