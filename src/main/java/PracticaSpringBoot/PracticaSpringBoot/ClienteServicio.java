package PracticaSpringBoot.PracticaSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio{
   @Autowired
   ClienteRepositorio cr;
	   
   public Cliente Guardar(Cliente cliente) {
	  return cr.save(cliente);
   }
}
