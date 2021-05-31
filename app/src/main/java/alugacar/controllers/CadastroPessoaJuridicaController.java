package alugacar.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CadastroPessoaJuridicaController implements Initializable {

    @FXML
    private Label labelClienteCNPJ;

    @FXML
    private Label labelClienteEndereco;

    @FXML
    private Label labelClienteNome;

    @FXML
    private Button buttonInserir;

    @FXML
    private Button buttonLimpar;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
