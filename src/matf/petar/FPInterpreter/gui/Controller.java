package matf.petar.FPInterpreter.gui;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by petar on 3.1.16..
 */

public class Controller implements Initializable {

    public TextField poljeDatoteka;
    public Button dugmeOdaberi;
    public VBox zaDatoteku;
    public TextArea poljeZaUnos;

    public VBox koren;
    public HBox kutijaUlaz;
    public HBox kutijaIzlaz;
    public VBox zaIzlaznuDatoteku;
    public TextField poljeIzlaznaDatoteka;
    public Button dugmeOdaberiIzlaznu;
    public TextArea poljeZaIzlaz;
    Tokovi aktivanUlaz;
    Tokovi aktivanIzlaz;
    private File odabranaDatoteka;
    private File odabranaIzlaznaDatoteka;

    public void odaberiDatoteku(ActionEvent actionEvent) {
        FileChooser birac = new FileChooser();
        birac.setTitle("Odaberite datoteku za ulaz programa");
        odabranaDatoteka = birac.showOpenDialog(null);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sakrijOpcijeZaUlaz();
        sakrijOpcijeZaIzlaz();
    }

    public void odabranoPoljeIzlaz(ActionEvent actionEvent) {
        aktivanIzlaz = Tokovi.IZ_TEKST_POLJA;
        sakrijOpcijeZaIzlaz();

        int indeksKutijeZaIzlaz = koren.getChildren().indexOf(kutijaIzlaz);

        koren.getChildren().add(indeksKutijeZaIzlaz + 1, poljeZaIzlaz);
    }

    public void odabranFajlIzlaz(ActionEvent actionEvent) {
        aktivanIzlaz = Tokovi.IZ_DATOTEKE;
        sakrijOpcijeZaIzlaz();

        int indeksKutijeZaIzlaz = koren.getChildren().indexOf(kutijaIzlaz);

        koren.getChildren().add(indeksKutijeZaIzlaz + 1, zaIzlaznuDatoteku);
    }

    public void odaberiIzlaznuDatoteku(ActionEvent actionEvent) {
        FileChooser birac = new FileChooser();
        birac.setTitle("Odaberite datoteku za izlaz programa");
        odabranaIzlaznaDatoteka = birac.showOpenDialog(null);
    }

    public void pokretanje(ActionEvent actionEvent) {
    }

    public void odabranoPolje(ActionEvent actionEvent) {
        aktivanUlaz = Tokovi.IZ_TEKST_POLJA;
        sakrijOpcijeZaUlaz();

        int indeksKutijeZaUlaz = koren.getChildren().indexOf(kutijaUlaz);

        koren.getChildren().add(indeksKutijeZaUlaz + 1, poljeZaUnos);
    }

    public void odabranFajl(ActionEvent actionEvent) {
        aktivanUlaz = Tokovi.IZ_TEKST_POLJA;
        sakrijOpcijeZaUlaz();

        int indeksKutijeZaUlaz = koren.getChildren().indexOf(kutijaUlaz);

        koren.getChildren().add(indeksKutijeZaUlaz + 1, zaDatoteku);
    }

    private void sakrijOpcijeZaUlaz() {
        if (koren.getChildren().contains(zaDatoteku)) {
            koren.getChildren().remove(zaDatoteku);
        }
        if (koren.getChildren().contains(poljeZaUnos)) {
            koren.getChildren().remove(poljeZaUnos);
        }
    }

    private void sakrijOpcijeZaIzlaz() {
        if (koren.getChildren().contains(zaIzlaznuDatoteku)) {
            koren.getChildren().remove(zaIzlaznuDatoteku);
        }
        if (koren.getChildren().contains(poljeZaIzlaz)) {
            koren.getChildren().remove(poljeZaIzlaz);
        }
    }

    public enum Tokovi {
        IZ_DATOTEKE, IZ_TEKST_POLJA
    }
}
