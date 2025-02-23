package chicasmagicas.logica;

public class Usuario {
    private int num_creador;
    private String creador;
    private String correo;
    //constructor vacio para crear una instancia dueño para uso de metodos
    public Usuario() {
    }
    //constructor con parametros
    public Usuario(int num_creador, String creador, String correo) {
        this.num_creador = num_creador;
        this.creador = creador;
        this.correo = correo;
    }
    //metodos-->getters y setters    
    public int getNum_creador() {
        return num_creador;
    }

    public void setNum_creador(int num_creador) {
        this.num_creador = num_creador;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
