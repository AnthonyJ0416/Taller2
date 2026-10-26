package ec.edu.uce.pa.tarea3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("vip") 
public class DescuentoVIP implements CalculadoraDescuento{

     private double porcentajeDescuento = 0.15;

    @Override
    public double calcular(double monto) {
      //  System.out.println("Calculando Descuento VIP");
        double descuento = monto * porcentajeDescuento;
        return descuento;

    }

}
