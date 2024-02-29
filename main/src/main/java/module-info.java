module cf.cplace.helloSpringModules.main {
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.web;

    exports cf.cplace.hellospringmodules;
    opens cf.cplace.hellospringmodules to spring.context, spring.core;
}
