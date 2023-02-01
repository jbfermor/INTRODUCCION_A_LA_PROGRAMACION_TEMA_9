public class Main {

  public static void main(String[] args) {

    Cliente cliente = new Cliente(30, "John", "666666666", 1000);
    System.out.println(cliente.toString()); 

    Trabajador trabajador = new Trabajador(30, "John", "666666666", 2000);
    System.out.println(trabajador.toString()); 
  }
  
}