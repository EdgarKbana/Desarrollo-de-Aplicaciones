package pe.edu.upeu.pagatu_catalogo_ms.mapper;

import pe.edu.upeu.pagatu_catalogo_ms.dto.CategoriaRequest;
import pe.edu.upeu.pagatu_catalogo_ms.dto.CategoriaResponse;
import pe.edu.upeu.pagatu_catalogo_ms.entity.Categoria;
import org.springframework.stereotype.Component;

@Component
public class CategoriaMapper {

    public Categoria toEntity(CategoriaRequest request) {
        return Categoria.builder()
                .nombre(request.getNombre())
                .descripcion(request.getDescripcion())
                .build();
    }

    public CategoriaResponse toResponse(Categoria categoria) {
        return CategoriaResponse.builder()
                .id(categoria.getId())
                .nombre(categoria.getNombre())
                .descripcion(categoria.getDescripcion())
                .build();
    }
}