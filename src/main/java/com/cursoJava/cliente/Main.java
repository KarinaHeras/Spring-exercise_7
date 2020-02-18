package com.cursoJava.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cursoJava.modelo.Factura;

public class Main {

    public static void main(String[] args) {

        ApplicationContext contenedor = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(contenedor.getBean("beanFactura", Factura.class));
    }

}
