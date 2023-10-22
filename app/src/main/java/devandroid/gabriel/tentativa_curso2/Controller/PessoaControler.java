package devandroid.gabriel.tentativa_curso2.Controller;

import android.util.Log;

import devandroid.gabriel.tentativa_curso2.Model.Pessoa;

public class PessoaControler {


    public void salvar(Pessoa pessoa) {
        Log.i("MVC_CONTROLLER","salvo" + pessoa.toString());
    }
}
