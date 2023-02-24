**Spring**
将类声明为一个JAVA BEAN的注解：@Component @Repository @Service @Controller

**@AutoWired @Resource**
@AutoWired 优先通过类型注入、如果没有匹配，则通过名称注入
@Resource  优先通过名称注入、如果没有匹配，通过类型注入

对于一个@Qualifier +@AutoWired 配合使用


**Bean作用域Scope**
singleton ： 
protoType :


**单例BEAN线程安全**
在 Bean 中尽量避免定义可变的成员变量。
定义ThreadLocal 成员变量,将需要的可变变量保存到ThreadLocal 


**BEAN生命周期**


**SPRING-AOP**
spring-aop核心是面向切面编程；在Spring框架中最常见的AOP的应用是声明式事务、日志框架、权限系统等

spring-aop 是基于动态代理实现的。spring的动态代理分为 JDK动态代理  、AspectJ 动态代理



