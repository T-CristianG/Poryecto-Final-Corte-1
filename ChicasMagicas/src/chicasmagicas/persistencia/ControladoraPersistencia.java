package chicasmagicas.persistencia;

import chicasmagicas.logica.Chica;
import chicasmagicas.logica.Usuario;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    ChicaJpaController chicaJpa = new ChicaJpaController();

    public void guardar(Usuario user, Chica chica) {
        
        // crear en la DB el Dueño
        
        usuarioJpa.create(user);
        
        // crear en la DB mascota
        
        chicaJpa.create(chica);
        
    }
    
    
    
}
