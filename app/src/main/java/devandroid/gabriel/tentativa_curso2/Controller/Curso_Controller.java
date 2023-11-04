package devandroid.gabriel.tentativa_curso2.Controller;


import java.util.ArrayList;
import java.util.List;

import devandroid.gabriel.tentativa_curso2.Model.Curso_desejado;

public class Curso_Controller {

public List lista_desejada;

public List getLista_desejada(){

    lista_desejada = new ArrayList<Curso_desejado>();
    lista_desejada.add(new Curso_desejado("Java"));
    lista_desejada.add(new Curso_desejado("flutter"));
    lista_desejada.add(new Curso_desejado("Python"));
    lista_desejada.add(new Curso_desejado("C e C#"));
    lista_desejada.add(new Curso_desejado("JavasCript"));

    return lista_desejada;
};

public ArrayList<String> lista_spínner(){

    ArrayList<String> Dados = new ArrayList<>();

    for (int i = 0; i < getLista_desejada().size(); i++) {
        Curso_desejado objeto = (Curso_desejado) getLista_desejada().get(i);
        Dados.add(objeto.getNome_do_curso());
    }
    return Dados;
}
}
