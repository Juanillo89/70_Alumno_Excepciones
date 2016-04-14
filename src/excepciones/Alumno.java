package excepciones;

public class Alumno
{
	private String nombre;
	private int edad;
	private double nota;

	public Alumno(String nombre, int edad) throws IllegalArgumentException
	{
		if(edad < 0)
		{
			throw new IllegalArgumentException("Edad no válida.");
		}
		this.nombre = nombre;
		this.edad = edad;
	}

	public double getNota()
	{
		return nota;
	}
	public void setNota(double nota) throws IllegalArgumentException
	{
		if(nota < 0 || nota > 10)
		{

			throw new IllegalArgumentException("Nota no válida.");
		}
		this.nota = nota;
	}
	public String getNombre()
	{
		return nombre;
	}
	public int getEdad()
	{
		return edad;
	}
}