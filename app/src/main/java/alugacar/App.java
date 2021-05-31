package alugacar;

import alugacar.database.DatabaseSQLite;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Objects;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/Main.fxml")));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setScene(scene);
        stage.setTitle("Alugacar");
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) throws SQLException {

        Connection conn = DatabaseSQLite.getInstance().getConnection();

        conn.createStatement().execute("CREATE TABLE IF NOT EXISTS cliente(id integer PRIMARY KEY);");

        launch(args);
    }
}
