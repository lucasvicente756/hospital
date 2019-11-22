package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import br.com.hospital.DAO.MedicoDAO;
import br.com.hospital.conexao.Conexao;
import br.com.hospital.util.Rotas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	static Stage stageAtual;
	static FXMLLoader loader;
	
	@Override
	public void start(Stage Stage) throws Exception {
		stageAtual = Stage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource(Rotas.LOGIN));
		
		
	try {
		Parent root = loader.load();
		Scene scene = new Scene(root,600,400);
		scene.getStylesheets().add(getClass().getResource("/css/app.css").toExternalForm());
		stageAtual.setScene(scene);
		stageAtual.show();
		}catch(IOException a) {
			a.printStackTrace();
		}
	}

	public void openpage(String rota) throws IOException {
		
		  loader = new FXMLLoader(getClass().getResource(rota));
			Scene scene = new Scene(loader.load());
			stageAtual.setScene(scene);
			stageAtual.show();
	}
	
	public static void main (String[] args) throws SQLException {
		launch(args);
	}


}