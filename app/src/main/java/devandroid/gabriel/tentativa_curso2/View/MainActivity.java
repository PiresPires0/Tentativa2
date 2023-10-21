package devandroid.gabriel.tentativa_curso2.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.gabriel.tentativa_curso2.Model.Pessoa;
import devandroid.gabriel.tentativa_curso2.R;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    Pessoa novaPessoa;
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

        pessoa = new Pessoa();  //Criaçao do objeto(Instaciando)
        pessoa.setPrimeiroNome("Gabriel");
        pessoa.setSegundoNome("Pires");
        pessoa.setCursoDesejado("Melhor Curso");
        pessoa.setTelefoneContato("45");

        novaPessoa = new Pessoa();

        novaPessoa.setPrimeiroNome("carlos");
        novaPessoa.setSegundoNome("Magno");
        novaPessoa.setCursoDesejado("Segundo Melhor");
        novaPessoa.setTelefoneContato("Segundo Melhor");

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

           Toast.makeText(MainActivity.this,"Salvo",Toast.LENGTH_LONG).show();
       });



    }



}