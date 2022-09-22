
public class Conjunto {

    private String[] _Ca, _Cb, _Cr;
    private int _LongA, _LongB;

    //Constructor    
    public void ConjuntoCa(int LongA) {
        _LongA = LongA;
        _Ca = new String[_LongA];
    }

    public void ConjuntoCb(int LongB) {
        _LongB = LongB;
        _Cb = new String[_LongB];
    }

    //Metodos Set
    public void Ca(String Ca, int Indice) {
        _Ca[Indice] = Ca;
    }

    public void Ca(String[] Ca) {
        _Ca = Ca;
    }

    public void Cb(String Cb, int Indice) {
        _Cb[Indice] = Cb;
    }

    public void Cb(String[] Cb) {
        _Cb = Cb;
    }

    //Metodos Get
    public int LongA() {
        return _LongA;
    }

    public int LongB() {
        return _LongB;
    }

    public String Ca(int Indice) {
        return _Ca[Indice];
    }

    public String[] Ca() {
        return _Ca;
    }

    public String Cb(int Indice) {
        return _Cb[Indice];
    }

    public String[] Cb() {
        return _Cb;
    }

    public boolean Contiene(String dato) {
        boolean equals = false;

        for (int i = 0; i < _LongA; i++) {
            equals = _Ca[i].equals(dato);
            if (equals == true) {
                break;
            }

        }
        return equals;
    }

    public void Agregar(String dato) {
        _Cb = new String[_LongA + 1];
        for (int i = 0; i < _LongA; i++) {
            _Cb[i] = _Ca[i];
        }
        _Cb[_LongA] = dato;
    }

    public void Eliminar(String dato) {
        boolean equals = false;
        for (int i = 0; i < _LongA; i++) {
            equals = _Ca[i].equals(dato);
            if (equals == true) {
                _Ca[i] = null;
            }

        }
    }

    public boolean esIgual() {
        boolean equals = true;
        int i = 0;
        while (equals == true && i < _LongA) {

            equals = _Ca[i].equals(_Cb[i]);
            i++;

        }
        return equals;
    }

    public boolean esSubConjunto() {
        boolean equals = false;
        for (int i = 0; i < _LongA; i++) {

            for (int j = 0; j < _LongB; j++) {
                if (_Ca[i].equals(_Cb[j])) {
                    equals = true;
                } else {
                    equals = false;
                }
            }

        }
        return equals;
    }

    //OPERACIONES DE CONJUNTOS
    //Union
    public String Union() {
        int _Contador = 0;
        int _Bandera = 0;
        String _Cadena = "";

        _Cr = new String[_LongA + _LongB];
        for (int i = 0; i < _LongA; i++) {
            _Cr[i] = _Ca[i];
        }

        _Contador = _LongA;

        for (int i = 0; i < _LongB; i++) {
            _Bandera = 0;
            for (int j = 0; j < _LongA + _LongB; j++) {
                if (_Cb[i].equals(_Cr[j])) {
                    _Bandera = 1;
                }
            }
            if (_Bandera == 0) {
                _Cr[_Contador] = _Cb[i];
                _Contador++;
            }
        }

        for (int i = 0; i < _LongA + _LongB; i++) {
            if (_Cr[i] != null) {
                _Cadena = _Cadena + _Cr[i] + ";";
            }
        }
        return _Cadena;
    }

    //Interceccion
    public String Interseccion() {
        int _Contador = 0;
        int _Bandera = 0;
        String _Cadena = "";
        _Cr = new String[_LongA + _LongB];
        for (int i = 0; i < _LongA; i++) {
            _Bandera = 0;
            for (int j = 0; j < _LongB; j++) {
                if (_Ca[i].equals(_Cb[j])) {
                    _Bandera = 1;
                }
            }
            if (_Bandera == 1) {
                _Cr[_Contador] = _Ca[i];
                _Contador++;
            }
        }

        for (int i = 0; i < _LongA + _LongB; i++) {
            if (_Cr[i] != null) {
                _Cadena = _Cadena + _Cr[i] + ";";
            }
        }
        return _Cadena;
    }

    //Diferencia
    public String Diferencia() {
        int _Contador = 0;
        int _Bandera = 0;
        String _Cadena = "";
        _Cr = new String[_LongA + _LongB];

        for (int i = 0; i < _LongA; i++) {
            _Bandera = 0;
            for (int j = 0; j < _LongB; j++) {
                if (_Ca[i].equals(_Cb[j])) {
                    _Bandera = 1;
                }
            }
            if (_Bandera == 0) {
                _Cr[_Contador] = _Ca[i];
                _Contador++;
            }
        }

        for (int i = 0; i < _LongA + _LongB; i++) {
            if (_Cr[i] != null) {
                _Cadena = _Cadena + _Cr[i] + ";";
            }
        }
        return _Cadena;
    }

}
