package chicasmagicas.logica;

import chicasmagicas.persistencia.ControladoraPersistencia;

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
    
    
}
