package src.Ejercicio1_Pendulo;
import javax.swing.JOptionPane;
/**
 * @author Jeison
 */
public class CalculoPendulo 
{
    public static void main(String[] args) 
    {
    Pendulo Cal = new Pendulo();
    String Opciones[] = {"Crear calculo", "Salir"};
    int sel;
        do 
        {
            sel = JOptionPane.showOptionDialog(null,
            "Escoja una opcion ",
            "Calculo  de oscilacion del pendulo",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            Opciones,
            "Salir");
            switch (sel) 
            {
               case 0: 
                int longitud = Integer.parseInt( JOptionPane.showInputDialog("Ingrese la longitud"));
                int aceleracion = Integer.parseInt( JOptionPane.showInputDialog("Ingrese la aceleracion"));
                JOptionPane.showMessageDialog(null,
                "El el periodo de oscilacion del pendulo es:\n"
                +String.format("%.3f",Cal.getPeriodo_ocilacion(longitud, aceleracion)));
                break;
               case 1: 
                JOptionPane.showMessageDialog(null,"Fue un placer atenderte");
                break;
            }
        } while (sel !=1);
    }
}