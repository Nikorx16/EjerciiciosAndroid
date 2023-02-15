package abstract_builder;

public class Pizza extends Thread  {
    private  String nombre="";
    private String salsa;
    private String relleno;
    
 
//-----------------------GET&SETTER--------------------------------------

public void setNombre(String nombre) {
    this.nombre = nombre;
}

// ---------------------------------

public String getNombre() {
    return nombre;
}

// ---------------------------------

public String getRelleno() {
    return relleno;
}

// ---------------------------------

public String getSalsa() {
    return salsa;
}

// ---------------------------------

public void setRelleno(String relleno) {
    this.relleno = relleno;
}

// ---------------------------------

public void setSalsa(String salsa) {
    this.salsa = salsa;
}

// ---------------------------------

}
