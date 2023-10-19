package devandroid.gabriel.tentativa_curso2.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.gabriel.tentativa_curso2.Model.Pessoa;
import devandroid.gabriel.tentativa_curso2.R;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa; //Declaraçao de objeto

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa(); //Criaçao do objeto(Instaciando)
    }
}