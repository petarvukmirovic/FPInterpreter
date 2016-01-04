package matf.petar.FPInterpreter.gui;

public class SyntaxErrorReport {
    private final int _lineNr;
    private final int _charNr;
    private final String _msg;

    public SyntaxErrorReport(int lineNr, int charNr, String msg) {
        this._lineNr = lineNr;
        this._charNr = charNr;
        this._msg = msg;
    }

    public int getCharNr() {
        return _charNr;
    }

    public int getLineNr() {
        return _lineNr;
    }

    public String getMsg() {
        return _msg;
    }
}
