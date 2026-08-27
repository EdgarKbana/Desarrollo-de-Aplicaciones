package pe.edu.upeu.pagatu_catalogo_ms.mapper;

import pe.edu.upeu.pagatu_catalogo_ms.dto.ProductoRequest;
import pe.edu.upeu.pagatu_catalogo_ms.dto.ProductoResponse;
import pe.edu.upeu.pagatu_catalogo_ms.entity.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {

    public Producto toEntity(ProductoRequest request) {
        return Producto.builder()
                .nombre(request.getNombre())
                .descripcion(request.getDescripcion())
                .precio(request.getPrecio())
                .activo(request.getActivo())
                .build();
    }

    public ProductoResponse toResponse(Producto producto) {
        return ProductoResponse.builder()
                .id(producto.getId())
                .nombre(producto.getNombre())
                .descripcion(producto.getDescripcion())
                .precio(producto.getPrecio())
                .activo(producto.getActivo())
                .categoriaId(producto.getCategoria().getId())
                .build();
    }
}