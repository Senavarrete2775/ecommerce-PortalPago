package cl.ecommerce.portal_pago.controler;


import cl.ecommerce.portal_pago.dto.PagoRequest;
import cl.ecommerce.portal_pago.models.Boleta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {

    @PostMapping("/procesar")
    public ResponseEntity<Boleta> procesarPago(@RequestBody PagoRequest request) {

        Boleta boleta = new Boleta();
        boleta.setIdTransaccion(UUID.randomUUID().toString());
        boleta.setPlan(request.getNombrePlan());
        boleta.setMonto(request.getValor());
        boleta.setFecha(LocalDateTime.now());
        boleta.setTotal(request.getValor() * 1.19);

        return ResponseEntity.ok(boleta);
    }

    



}
