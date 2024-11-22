package com.atguigu.spring6.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component(value = "user") // 不写的话默认为首字母小写； <bean id="user" class="...">
//@Repository
//@Service
@Controller
public class User {

    /*
    @Component
    该注解用于描述 Spring 中的 Bean，它是一个泛化的概念，仅仅表示容器中的一个组件(Bean)，并且可以作用在应用的任何层次，
    例如 Service 层、Dao层等。 使用时只需将该注解标注在相应类上即可。
    @Repository
    该注解用于将数据访问层(Dao 层)的类标识为 Spring 中的 Bean，其功能与@Component 相同
    @Service
    该注解通常作用在业务层(Service 层)，用于将业务层的类标识为 Spring 中的 Bean，其功能与 @Component 相同。
    @Controller
    该注解通常作用在控制层(如SpringMVC 的 Controller)，用于将控制层的类标识为Spring 中的 Bean，其功能与 @Component 相同
     */
}
