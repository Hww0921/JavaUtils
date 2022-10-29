package beanUtils.mapstruct;

import beanUtils.entity.PersonDO;
import beanUtils.entity.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface PersonConverter {
    PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);

    /**
     * @desc personDO ==> PersonDTO
     * @param personDO 数据库实体
     * @return 业务实体
     */
    @Mapping(target = "birthday",dateFormat = "yyyy-MM-dd HH:mm:ss")
    PersonDTO do2dto(PersonDO personDO);
}
