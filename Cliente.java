public class Cliente extends Persona {
  private int credito;

  public Cliente(int edad, String nombre, String telefono, int credito){
    this.edad = edad;
    this.nombre = nombre;
    this.telefono = telefono;
    this.credito = credito;
  }

  public String toString(){
    return "edad: " + edad + ", nombre: " + nombre + ", telefono: " + telefono + ", credito: " + credito;
  }
  
}