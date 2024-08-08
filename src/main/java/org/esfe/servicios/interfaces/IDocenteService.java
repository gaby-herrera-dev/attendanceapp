package org.esfe.servicios.interfaces;

import org.esfe.modelos.Docente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IDocenteService {
    Page<Docente> buscarTodosPaginados(Pageable pageable);

    List<Docente> obtenertodos();

    Optional<Docente> buscarPorId(Integer id);

    Docente crearOeditar(Docente docente);

    void eliminarPorId(Integer id);

}
