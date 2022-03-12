package PracticaSpringBoot.PracticaSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestClientes {
   @Autowired
   ClienteServicio cs;
   
   @GetMapping("/")
   public String Saludo() {
	   return "Hola mundo xd";
   }
   @PostMapping("/")
   public Cliente CrearCliente(@RequestBody Cliente cliente){
	  return cs.Guardar(cliente);
   }
}
