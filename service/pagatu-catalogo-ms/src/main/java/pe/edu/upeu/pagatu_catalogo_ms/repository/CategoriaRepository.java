package pe.edu.upeu.pagatu_catalogo_ms.repository;

import pe.edu.upeu.pagatu_catalogo_ms.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}   