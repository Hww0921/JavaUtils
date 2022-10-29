package beanUtils.mapstruct;

import beanUtils.entity.PersonDO;
import beanUtils.entity.PersonDTO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-29T13:28:43+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class PersonConverterImpl implements PersonConverter {

    @Override
    public PersonDTO do2dto(PersonDO personDO) {
        if ( personDO == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setUsername( personDO.getName() );
        personDTO.setAge( personDO.getAge() );
        personDTO.setBirthday( personDO.getBirthday() );

        return personDTO;
    }
}
