//package beanUtils.otherBeanUtils;
//
//import beanUtils.entity.PersonDO;
//import beanUtils.entity.PersonDTO;
//import org.springframework.beans.BeanUtils;
//import org.springframework.cglib.beans.BeanCopier;
//import org.springframework.util.StopWatch;
//
//import java.lang.reflect.InvocationTargetException;
//
//public class BeanCopyCompare {
//
//    /**
//     * 使用springframework 下的包
//     * @param personDO
//     * @param times
//     */
//    public static void mappingBySpringUtils(PersonDO personDO, int times){
//        // 用户记录代码执行的时间
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//
//        for (int i = 0; i < times; i++) {
//            PersonDTO personDTO = new PersonDTO(pname);
//            BeanUtils.copyProperties(personDO,personDTO);
//            System.out.println(personDTO);
//        }
//        stopWatch.stop();
//        System.out.println("org.springframework.beans.BeanUtils cost :" + stopWatch.getTotalTimeMillis());
//
//    }
//
//
//
//    /**
//     * 使用Cglib BeanCopier
//     * @param personDO
//     * @param times
//     */
//    public static void mappingByCglibBeanCopier(PersonDO personDO,int times){
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//
//        for (int i = 0; i < times; i++) {
//            PersonDTO personDTO = new PersonDTO(pname);
//            BeanCopier beanCopier = BeanCopier.create(PersonDO.class, PersonDTO.class,false);
//            beanCopier.copy(personDO,personDTO,null);
//        }
//
//        stopWatch.stop();
//        System.out.println(" org.springframework.cglib.beans cost:" + stopWatch.getTotalTimeMillis());
//    }
//
//
//    /**
//     * 使用Apache BeanUtils下的包
//     * @param personDO
//     * @param times
//     */
//    public static void mappingByApacheUtils(PersonDO personDO,int times) throws InvocationTargetException, IllegalAccessException {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//
//        for (int i = 0; i < times; i++) {
//            PersonDTO personDTO = new PersonDTO(pname);
//            org.apache.commons.beanutils.BeanUtils.copyProperties(personDTO,personDO);
//        }
//
//        stopWatch.stop();
//        System.out.println("org.apache.commons.beanutils.BeanUtils cost:" + stopWatch.getTotalTimeMillis());
//    }
//
//
//}
