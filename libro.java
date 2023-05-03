

public class libro {
   private String autor;
   private String editorial;
   private String nombre;

   public libro(String autor, String editorial, String nombre) {
	this.autor = autor;
	this.editorial = editorial;
	this.nombre = nombre;
}
public libro() {
	// TODO Auto-generated constructor stub
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
}
