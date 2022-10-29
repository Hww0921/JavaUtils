package beanUtils.test;

import beanUtils.entity.PersonDO;
import beanUtils.entity.PersonDTO;
import beanUtils.mapstruct.PersonConverter;
//import beanUtils.otherBeanUtils.BeanCopyCompare;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class BeanUtilsTest {

    @Test
    public void  mapstruct() {
        PersonDO personDO = new PersonDO();
        personDO.setName("韩雯雯");
        personDO.setAge(18);
        personDO.setBirthday(new Date());
        personDO.setId(1);
        PersonDTO personDTO = PersonConverter.INSTANCE.do2dto(personDO);
        System.out.println(personDTO);


    }



//    @Test
//    public void  main() throws InvocationTargetException, IllegalAccessException {
//        PersonDO personDO = new PersonDO();
//        personDO.setName("韩雯雯");
//        personDO.setAge(18);
//        personDO.setBirthday(new Date());
//        personDO.setId(1);
//
////        BeanCopyCompare.mappingByApacheUtils(personDO,100);
//
//        BeanCopyCompare.mappingBySpringUtils(personDO,1);
////        BeanCopyCompare.mappingByCglibBeanCopier(personDO,1);
//
//    }
}