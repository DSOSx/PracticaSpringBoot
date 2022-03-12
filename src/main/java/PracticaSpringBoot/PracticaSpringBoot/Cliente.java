package PracticaSpringBoot.PracticaSpringBoot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="cliente")
public class Cliente {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   int id;
   @Column(name="nombre")
   String Nombre;
   @Column(name="edad")
   int edad;
   public Cliente(String Nombre,int edad) {
	   this.Nombre=Nombre;
	   this.edad=edad;
   }
public int getId() {
	return id; 
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String toString() {
	return this.getId()+" "+this.getNombre()+" "+this.getEdad();
}
}
