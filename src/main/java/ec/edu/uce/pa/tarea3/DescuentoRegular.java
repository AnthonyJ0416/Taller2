package ec.edu.uce.pa.tarea3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
@Named("regular")
public class DescuentoRegular implements CalculadoraDescuento {

    private double porcentajeDescuento = 0.05;

    @Override
    public double calcular(double monto) {
     //   System.out.println("Calculando Descuento Regular");
        double descuento = monto * porcentajeDescuento;
        return descuento;

    }

}
