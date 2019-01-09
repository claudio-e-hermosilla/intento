public class alumno implements imprimible2
{
    protected String nombre;
    protected double[] notas;
    public alumno(String newnombre)
    {
        this.nombre=newnombre;
        this.notas=new double[5]; // en el main agregaremos los valores del arreglo
    }
    public double promedioalumno()
    {
        double suma=0.0;
        for(int i =0;i<this.notas.length;i++)
        {
            suma=suma+notas[i];
        }
        return (suma/this.notas.length);
    }
    public void imprimir(){}
}