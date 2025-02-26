package chicasmagicas.logica;

import chicasmagicas.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombrechica, String estadoact, String eda, String descripcion, String ciudad, String corre) {
        
        Chica chica = new Chica();
        
        chica.setNombredelachica(nombrechica);
        chica.setEstadoactual(estadoact);
        chica.setEdad(0);
        chica.setDescripciondelpersonaje(descripcion);
        chica.setCiudaddeorigen(ciudad);
        //Chic.setcorre(corre)
        
        Usuario user = new Usuario();
        
        user.setCorreo(corre);
        user.setCreador(ciudad);
        
       controlPersis.guardar(user,chica);
        
    }

    public List<Chica> traerMascotas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
