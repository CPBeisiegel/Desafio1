package br.digitalhouse.Entregavel;

public class Principal {

    public static void main(String[] args) {

       DigitalHouseManager dHManager = new DigitalHouseManager();

       dHManager.registrarProfessorTitular("Vinicius","Oliveira",1234,"Full Stack");
      dHManager.registrarProfessorTitular("Felipe","Alves",1235,"IOS");

       dHManager.registrarProfessorAdjunto("Natalia","Lira",1236,12);
       dHManager.registrarProfessorAdjunto("Luciana","Pinheiro",1237,10);

       dHManager.registrarCurso("Full Stack",20001,3);
       dHManager.registrarCurso("Android",20002,2);



       dHManager.alocarProfessores(20001,1235,1236);





    }
}
