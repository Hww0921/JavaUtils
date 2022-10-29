package beanUtils.mapstruct;

import beanUtils.entity.PersonDO;
import beanUtils.entity.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonConverter {
    PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);

    PersonDTO do2dto(PersonDO personDO);
}
