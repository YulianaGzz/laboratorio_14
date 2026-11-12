package com.gremio.agenda_web.controller;

import com.gremio.agenda_web.model.Producto;
import com.gremio.service.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @GetMapping("/productos")
    public String listar(Model model) {
        model.addAttribute("productos",
                service.listarTodos());

        return "productos";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("producto",
                new Producto());

        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Producto producto) {
        service.guardar(producto);
        return "redirect:/productos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id,
                         Model model) {

        model.addAttribute(
                "producto",
                service.buscarPorId(id));

        return "formulario";
    }

    @PostMapping("/actualizar")
    public String actualizar(
            @ModelAttribute Producto producto) {

        service.guardar(producto);

        return "redirect:/productos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);

        return "redirect:/productos";
    }
}