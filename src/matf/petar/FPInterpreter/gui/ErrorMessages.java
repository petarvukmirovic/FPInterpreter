package matf.petar.FPInterpreter.gui;

import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

    public static String generisiIzvestaj(List<SyntaxErrorReport> sveGreske,
                                          String tekstPrograma) {
        ArrayList<String> linije = new ArrayList<>(Arrays.asList(tekstPrograma.split("\n")));

        sveGreske.sort(new Comparator<SyntaxErrorReport>() {
            @Override
            public int compare(SyntaxErrorReport o1, SyntaxErrorReport o2) {
                return o1.getLineNr() == o2.getLineNr() ?
                        o1.getCharNr() - o2.getCharNr() :
                        o1.getLineNr() - o2.getLineNr();
            }
        });

        int offset = 0;
        for (SyntaxErrorReport greska : sveGreske) {
            int red = greska.getLineNr() - 1;
            int kolona = greska.getCharNr();
            String poruka = greska.getMsg().trim();


            StringBuilder razmaci = new StringBuilder();
            for (int i = 0; i < kolona - 1; i++)
                razmaci.append(' ');


            linije.add(red + 1 + offset, razmaci + poruka);
            linije.add(red + 1 + offset, razmaci + "^");

            offset += 2;
        }

        StringBuilder izlaz = new StringBuilder();
        for (String linija : linije) {
            izlaz.append(linija).append('\n');
        }
        return izlaz.toString();
    }
}
