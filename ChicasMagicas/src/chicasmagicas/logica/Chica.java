package chicasmagicas.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Chica implements Serializable {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int num_chica;
   private String nombredelachica;
   private int edad;
   private String ciudaddeorigen;
   private String estadoactual;
   private String descripciondelpersonaje;
   //union de clases
   @OneToOne
   private Usuario unUsuario;
   //constructor vacio

    public Chica() {
    }
    //constructor con parametros

    public Chica(int num_chica, String nombredelachica, int edad, String ciudaddeorigen, String estadoactual, String descripciondelpersonaje, Usuario unUsuario) {
        this.num_chica = num_chica;
        this.nombredelachica = nombredelachica;
        this.edad = edad;
        this.ciudaddeorigen = ciudaddeorigen;
        this.estadoactual = estadoactual;
        this.descripciondelpersonaje = descripciondelpersonaje;
        this.unUsuario = unUsuario;
    }
    //getters y setters
    
    public int getNum_chica() {
    return num_chica;
    }

    public void setNum_chica(int num_chica) {
    this.num_chica = num_chica;
    }

    public String getNombredelachica() {
        return nombredelachica;
    }
    
    public void setNombredelachica(String nombredelachica) {
        this.nombredelachica = nombredelachica;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudaddeorigen() {
        return ciudaddeorigen;
    }

    public void setCiudaddeorigen(String ciudaddeorigen) {
        this.ciudaddeorigen = ciudaddeorigen;
    }

    public String getEstadoactual() {
        return estadoactual;
    }

    public void setEstadoactual(String estadoactual) {
        this.estadoactual = estadoactual;
    }

    public String getDescripciondelpersonaje() {
        return descripciondelpersonaje;
    }

    public void setDescripciondelpersonaje(String descripciondelpersonaje) {
        this.descripciondelpersonaje = descripciondelpersonaje;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
   
}
