package cl.ecommerce.portal_pago.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Boleta {
    private String idTransaccion;
    private String plan;
    private double monto;
    private LocalDateTime fecha;
    private double total;


}
