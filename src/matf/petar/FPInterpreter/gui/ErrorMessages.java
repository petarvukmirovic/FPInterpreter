package matf.petar.FPInterpreter.gui;

import javafx.scene.control.Alert;

/**
 * Created by petar on 3.1.16..
 */
public class ErrorMessages {
    public static void Greska(String poruka) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Greška");
        alert.setHeaderText("Došlo je do greške pri prevodjenju:");
        alert.setContentText(poruka);

        alert.showAndWait();
    }
}
