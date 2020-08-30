
package src.Ejercicio1_Pendulo;
 public class Pendulo {
	private double longitud,aceleracion;
	public void setDatos(double longitud,double aceleracion) {
	aceleracion=aceleracion;
        longitud=longitud;
	}
        public double getPeriodo_ocilacion(double longitud, double aceleracion) {
	return (2*Math.PI)*(Math.sqrt(aceleracion/longitud));
        }
}