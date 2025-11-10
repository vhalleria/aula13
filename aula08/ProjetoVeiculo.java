public class ProjetoVeiculo {

     public static void main(String[] args) {
    
    Carro V1= new Carro();
    Moto  V2 = new Moto();
    Onibus V3 = new Onibus();

   
        V1.setmarca("Toyota");
        V1.setmodelo("Corolla");
        V1.setAno(2022);
        
    System.out.println("Abrindo o porta-malas do carro " + V1.getModelo() );




       V2.setmarca("Honda");
       V2.setmodelo("Cg");
       V2.setAno(2021);
        
    System.out.println("A moto está empinando! " + V2.getModelo() );



  
       V3.setmarca("Mercedes");
       V3.setmodelo("Urbano");
       V3.setAno(2020);
        
    System.out.println("AbrindoaportadoônibusUrbano" + V3.getModelo() );

     }



    
}