package alugacar.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Main implements Initializable {

    @FXML
    private MenuItem menuItemCadastroCliente;

    @FXML
    private MenuItem menuItemCadastroVeiculos;

    @FXML
    private AnchorPane anchorPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void handleMenuItemCadastroClienteJuridico() throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/CadastroPessoaJuridica.fxml")));
        anchorPane.getChildren().setAll(a);

    }
}
