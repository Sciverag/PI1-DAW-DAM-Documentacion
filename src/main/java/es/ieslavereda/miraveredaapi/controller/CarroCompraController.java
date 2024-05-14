package es.ieslavereda.miraveredaapi.controller;


import es.ieslavereda.miraveredaapi.service.CarroCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controlador para la gestión del carro de la compra.
 */
@RestController
@RequestMapping("/carro")
public class CarroCompraController {

    @Autowired
    private CarroCompraService carroCompraService;

}
