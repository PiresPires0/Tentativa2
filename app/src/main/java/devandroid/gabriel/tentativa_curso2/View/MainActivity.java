package devandroid.gabriel.tentativa_curso2.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.gabriel.tentativa_curso2.Controller.PessoaControler;
import devandroid.gabriel.tentativa_curso2.Model.Pessoa;
import devandroid.gabriel.tentativa_curso2.R;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;

    SharedPreferences preferences;

    PessoaControler pessoaControler;


    EditText txt_Nome;
    EditText txt_sobrenome;
    EditText txt_Tipo_Curso;
    EditText txt_telefone0;

    Button button_Salvar;
    Button button_Limpar;
    Button button_Enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = getSharedPreferences("Lista",0);
        SharedPreferences.Editor Lista_Modificadora = preferences.edit();

        pessoaControler = new PessoaControler();


        pessoa = new Pessoa();  //Criaçao do objeto(Instaciando)
        pessoa.setPrimeiroNome(preferences.getString("Nome",""));
        pessoa.setSegundoNome(preferences.getString("Sobrenome",""));
        pessoa.setTelefoneContato(preferences.getString("Tipo_de_Curso",""));
        pessoa.setCursoDesejado(preferences.getString("Telefone",""));
//        pessoa.setPrimeiroNome("Nome");
//        pessoa.setSegundoNome("Sobrenome");
//        pessoa.setCursoDesejado("Tipo De Curso");
//        pessoa.setTelefoneContato("Telefone");



        txt_Nome = findViewById(R.id.txt_Nome);
        txt_sobrenome = findViewById(R.id.txt_sobrenome);
        txt_telefone0 = findViewById(R.id.txt_telefone0);
        txt_Tipo_Curso = findViewById(R.id.txt_Tipo_Curso);

        button_Enviar = findViewById(R.id.button_Enviar);
        button_Limpar = findViewById(R.id.button_Limpar);
        button_Salvar = findViewById(R.id.button_Salvar);

        txt_Nome.setText(pessoa.getPrimeiroNome());
        txt_sobrenome.setText(pessoa.getSegundoNome());
        txt_telefone0.setText(pessoa.getCursoDesejado());
        txt_Tipo_Curso.setText(pessoa.getTelefoneContato());

        button_Limpar.setOnClickListener((View v) -> {
            txt_Nome.setText(" ");
            txt_sobrenome.setText(" ");
            txt_telefone0.setText(" ");
            txt_Tipo_Curso.setText(" ");
            Lista_Modificadora.clear();
            Lista_Modificadora.apply();

        });

        button_Enviar.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this,"Volte Sempre",Toast.LENGTH_LONG).show();
            finish();
        });

        button_Salvar.setOnClickListener(v -> {
            pessoa.setPrimeiroNome(txt_Nome.getText().toString());
            pessoa.setSegundoNome(txt_sobrenome.getText().toString());
            pessoa.setCursoDesejado(txt_Tipo_Curso.getText().toString());
            pessoa.setTelefoneContato(txt_telefone0.getText().toString());
            pessoaControler.salvar(pessoa);

            Lista_Modificadora.putString("Nome",pessoa.getPrimeiroNome());
            Lista_Modificadora.putString("Sobrenome",pessoa.getSegundoNome());
            Lista_Modificadora.putString("Tipo_de_Curso",pessoa.getCursoDesejado());
            Lista_Modificadora.putString("Telefone",pessoa.getTelefoneContato());
            Lista_Modificadora.apply();

            Toast.makeText(MainActivity.this,"Salvo",Toast.LENGTH_LONG).show();
        });



    }



}