package devandroid.gabriel.tentativa_curso2.Model;

import androidx.annotation.NonNull;

public class Pessoa {
    //Criando os atributos
        private String primeiroNome;
        private String segundoNome;
        private String cursoDesejado;
        private String telefoneContato;
    //CONSTRUCTOR
    public Pessoa(){}
        public String getPrimeiroNome(){
            return primeiroNome;
        }

        public void setPrimeiroNome(String primeiroNome){
            this.primeiroNome = primeiroNome;}

         public String getSegundoNome(){return segundoNome;}

        public void setSegundoNome(String segundoNome){this.segundoNome = segundoNome;}

        public String getCursoDesejado(){return cursoDesejado;}

        public void setCursoDesejado(String cursoDesejado){this.cursoDesejado= cursoDesejado;}

        public String getTelefoneContato(){return telefoneContato;}

        public void setTelefoneContato(String telefoneContato){this.telefoneContato = telefoneContato;}

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", segundoNome='" + segundoNome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}