package cl.ecommerce.portal_pago.dto;

import lombok.Data;

@Data
public class PagoRequest {
    private Long idCompra;
    private String nombrePlan;
    private Integer valor;
    private String estado;
}
