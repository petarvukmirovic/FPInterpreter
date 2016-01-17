package matf.petar.FPInterpreter.gui;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import matf.petar.FPInterpreter.FPAbstractSyntaxTree.FPProgramNode;
import matf.petar.FPInterpreter.TreeRewriteVisitor;
import matf.petar.FPInterpreter.gen.FPParserLexer;
import matf.petar.FPInterpreter.gen.FPParserParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.ResourceBundle;

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
    public RadioButton dugmeUnos;
    public CheckBox poljeKorakPoKorak;
    public TextField poljeDatotekaKPK;
    public Button dugmeOdaberiKPK;
    public HBox kuijaKPK;
    private Tokovi aktivanUlaz;
    private Tokovi aktivanIzlaz;
    private File odabranaDatoteka;
    private File odabranaIzlaznaDatoteka;
    // korak po korak datoteka
    private File odabranaKPKDatoteka;

    public void odaberiDatoteku(ActionEvent actionEvent) {
        FileChooser birac = new FileChooser();
        birac.setTitle("Odaberite datoteku za ulaz programa");
        if (odabranaDatoteka != null) {
            birac.setInitialDirectory(odabranaDatoteka.getParentFile());
        }
        odabranaDatoteka = birac.showOpenDialog(null);

        if (odabranaDatoteka != null) {
            poljeDatoteka.setText(odabranaDatoteka.getAbsolutePath());
        }
    }

    public void odaberiIzlaznuDatoteku(ActionEvent actionEvent) {
        FileChooser birac = new FileChooser();
        if (odabranaIzlaznaDatoteka != null) {
            birac.setInitialDirectory(odabranaIzlaznaDatoteka.getParentFile());
        }
        birac.setTitle("Odaberite datoteku za izlaz programa");
        odabranaIzlaznaDatoteka = birac.showSaveDialog(null);

        if (odabranaIzlaznaDatoteka != null) {
            poljeIzlaznaDatoteka.setText(odabranaIzlaznaDatoteka.getAbsolutePath());
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sakrijOpcijeZaUlaz();
        sakrijOpcijeZaIzlaz();
    }

    public void odabranoPoljeIzlaz(ActionEvent actionEvent) {
        aktivanIzlaz = Tokovi.TEKST_POLJE;
        sakrijOpcijeZaIzlaz();

        int indeksKutijeZaIzlaz = koren.getChildren().indexOf(kutijaIzlaz);

        koren.getChildren().add(indeksKutijeZaIzlaz + 1, poljeZaIzlaz);
    }

    public void odabranFajlIzlaz(ActionEvent actionEvent) {
        aktivanIzlaz = Tokovi.DATOTEKA;
        sakrijOpcijeZaIzlaz();

        int indeksKutijeZaIzlaz = koren.getChildren().indexOf(kutijaIzlaz);

        koren.getChildren().add(indeksKutijeZaIzlaz + 1, zaIzlaznuDatoteku);
    }

    public void odabranoPolje(ActionEvent actionEvent) {
        aktivanUlaz = Tokovi.TEKST_POLJE;
        sakrijOpcijeZaUlaz();

        int indeksKutijeZaUlaz = koren.getChildren().indexOf(kutijaUlaz);

        koren.getChildren().add(indeksKutijeZaUlaz + 1, poljeZaUnos);
    }

    public void odabranFajl(ActionEvent actionEvent) {
        aktivanUlaz = Tokovi.DATOTEKA;
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

    public void pokretanje(ActionEvent actionEvent) {
        if (aktivanUlaz == null || aktivanIzlaz == null) {
            ErrorMessages.Greska("Morate odabrati tip ulaza i izlaza.");
        } else {
            ANTLRInputStream ais;
            if (aktivanUlaz == Tokovi.TEKST_POLJE) {
                ais = new ANTLRInputStream(poljeZaUnos.getText());
            } else {
                if (odabranaDatoteka == null) {
                    ErrorMessages.Greska("Morate odabrati ulaznu datoteku.");
                    return;
                }
                try {
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream(odabranaDatoteka)));
                    ais = new ANTLRInputStream(br);
                } catch (IOException ioe) {
                    ErrorMessages.Greska("Ulazna datoteka se ne moze otvoriti : " +
                            ioe.getMessage());
                    return;
                }
            }

            FPParserLexer fppl = new FPParserLexer(ais);
            CommonTokenStream cts = new CommonTokenStream(fppl);
            FPParserParser fpp = new FPParserParser(cts);

            ArrayList<SyntaxErrorReport> sveGreske =
                    new ArrayList<>();

            fpp.addErrorListener(new ANTLRErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object o,
                                        int i, int i1, String s, RecognitionException e) {
                    sveGreske.add(new SyntaxErrorReport(i, i1, s));
                }

                @Override
                public void reportAmbiguity(Parser parser, DFA dfa, int i,
                                            int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
                    ErrorMessages.Greska("Dvosmislena gramatika!");
                }

                @Override
                public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1,
                                                        BitSet bitSet, ATNConfigSet atnConfigSet) {
                    // upozorenje
                }

                @Override
                public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1,
                                                     int i2, ATNConfigSet atnConfigSet) {
                    // upozorenje
                }
            });

            TreeRewriteVisitor trv = new TreeRewriteVisitor();

            FPProgramNode program = (FPProgramNode) trv.visitProgram(fpp.program());

            String rezultat = "";
            if (program != null) {
                OutputStreamWriter izlaz = null;
                if (poljeKorakPoKorak.isSelected()) {
                    if (odabranaKPKDatoteka == null) {
                        ErrorMessages.Greska("Morate odabrati datoteku za ispis izvestaja"
                                + " 'korak-po-korak'.");
                    } else {
                        try {
                            izlaz = new OutputStreamWriter(
                                    new FileOutputStream(odabranaKPKDatoteka));

                            rezultat = program.run(izlaz);
                            try {
                                izlaz.flush();
                                izlaz.close();
                            } catch (IOException e) {
                                ErrorMessages.Greska(e.getMessage());
                            }
                        } catch (FileNotFoundException e) {
                            ErrorMessages.Greska("Datoteka " + odabranaKPKDatoteka + " nije nadjena");
                        }
                    }
                } else {
                    rezultat = program.run();
                }
            } else {
                rezultat = "";
            }

            if (sveGreske.size() != 0) {
                String izvestaj =
                        ErrorMessages.generisiIzvestaj(sveGreske, _uzmiTekstPrograma());
                ErrorMessages.Greska("Doslo je do sintaksne greske.");

                dugmeUnos.setSelected(true);
                odabranoPolje(null);
                poljeZaUnos.setText(izvestaj);
            } else {
                if (aktivanIzlaz == Tokovi.DATOTEKA &&
                        odabranaIzlaznaDatoteka != null) {
                    try {
                        Files.write(Paths.get(odabranaIzlaznaDatoteka.getAbsolutePath()),
                                rezultat.getBytes());
                    } catch (IOException ioe) {
                        ErrorMessages.Greska("Izlazna datoteka se ne moze otvoriti : " +
                                ioe.getMessage());
                        return;
                    }
                } else if (aktivanIzlaz == Tokovi.TEKST_POLJE) {
                    poljeZaIzlaz.setText(rezultat);
                } else {
                    ErrorMessages.Greska("Mora se odabrati izlazna datoteka.");
                    return;
                }

                poljeZaUnos.setText(_uzmiTekstPrograma());
                dugmeUnos.setSelected(true);
                odabranoPolje(null);
            }
        }
    }

    private String _uzmiTekstPrograma() {
        String tekstPrograma;
        if (aktivanUlaz == Tokovi.TEKST_POLJE) {
            tekstPrograma = poljeZaUnos.getText();
        } else {
            try {
                tekstPrograma =
                        new String(Files.readAllBytes
                                (Paths.get(odabranaDatoteka.getAbsolutePath())));
            } catch (IOException e) {
                tekstPrograma = "";
                e.printStackTrace();
            }
        }
        return tekstPrograma;
    }

    public void odaberiKPK(ActionEvent actionEvent) {
        FileChooser birac = new FileChooser();
        if (odabranaKPKDatoteka != null) {
            birac.setInitialDirectory(odabranaKPKDatoteka.getParentFile());
        }
        birac.setTitle("Odaberite datoteku za izlaz programa");
        odabranaKPKDatoteka = birac.showSaveDialog(null);

        if (odabranaKPKDatoteka != null) {
            poljeDatotekaKPK.setText(odabranaKPKDatoteka.getAbsolutePath());
        }
    }

    public void kpkAktivirano(ActionEvent actionEvent) {
        kuijaKPK.setVisible(poljeKorakPoKorak.isSelected());
    }

    public enum Tokovi {
        DATOTEKA, TEKST_POLJE
    }
}
