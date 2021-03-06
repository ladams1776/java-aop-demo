package com.aop.demo;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration // Spring pure java configuration
@EnableAspectJAutoProxy // Spring aop proxy support
@ComponentScan("com.aop.demo.*") // component scan for components and aspects - recurse packages
public class DemoConfig {



}
