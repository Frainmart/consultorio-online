# Árbol definitivo - Consultorio Online

Este ZIP contiene únicamente el esqueleto organizado del proyecto. No se implementa lógica de negocio en esta etapa.

## Capas

Controller → Service → ServiceImpl → Repository → Entity

DTO ↔ Mapper ↔ Entity

## Convención
- Interfaces de servicio: `com.consultorioonline.service`
- Implementaciones: `com.consultorioonline.service.impl` con sufijo `Impl`
- DTO agrupados por dominio
- Mappers en `mapper`
- Repositories en `repository`
- Pruebas en `src/test/java/com/consultorioonline`
