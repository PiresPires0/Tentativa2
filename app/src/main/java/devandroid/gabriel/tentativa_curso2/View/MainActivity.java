package devandroid.gabriel.tentativa_curso2.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.gabriel.tentativa_curso2.Model.Pessoa;
import devandroid.gabriel.tentativa_curso2.R;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa; //Declaraçao de objeto
    Pessoa novaPessoa;

    String dadosPessoa;
    String dadosNovaPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa(); //Criaçao do objeto(Instaciando)
        pessoa.setPrimeiroNome("Gabriel");
        pessoa.setSegundoNome("Pires");
        pessoa.setCursoDesejado("Melhor Curso");
        pessoa.setTelefoneContato("45");

        novaPessoa = new Pessoa();

        novaPessoa.setPrimeiroNome("carlos");
        novaPessoa.setSegundoNome("Magno");
        novaPessoa.setCursoDesejado("Segundo Melhor");
        novaPessoa.setTelefoneContato("Segundo Melhor");

        dadosPessoa = "Primeiro Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa = "Segundo Nome: ";
        dadosPessoa += pessoa.getSegundoNome();
        dadosPessoa = "Curso Escolhido ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa = "Numero De Telefone ";
        dadosPessoa += pessoa.getTelefoneContato();


        dadosNovaPessoa = "Primeiro Nome: ";
        dadosNovaPessoa += novaPessoa.getPrimeiroNome();
        dadosNovaPessoa = "Segundo Nome: ";
        dadosNovaPessoa += novaPessoa.getSegundoNome();
        dadosNovaPessoa = "Curso Escolhido ";
        dadosNovaPessoa += novaPessoa.getCursoDesejado();
        dadosNovaPessoa = "Numero De Telefone ";
        dadosNovaPessoa += novaPessoa.getTelefoneContato();

    }



}