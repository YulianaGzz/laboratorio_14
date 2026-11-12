package com.gremio.agenda_web.repository;

import com.gremio.agenda_web.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository
        extends JpaRepository<Producto, Long> {
}