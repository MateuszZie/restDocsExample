package org.mateuszziebura.restDocsExample.web.mappers;

import org.mapstruct.Mapper;
import org.mateuszziebura.restDocsExample.domain.Beer;
import org.mateuszziebura.restDocsExample.web.model.BeerDto;

@Mapper(componentModel = "spring", uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
