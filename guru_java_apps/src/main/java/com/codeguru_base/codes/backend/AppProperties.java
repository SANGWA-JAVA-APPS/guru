package com.codeguru_base.codes.backend;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class AppProperties {

    String code(String db_user, String db_password, String artifact, String port) {
        return "#Spring boot profiles\n"
                + "#spring.profiles.active=dev\n"
                + "\n"
                + "\n"
                + "spring.datasource.driver-class-name=org.mariadb.jdbc.Driver\n"
                + "spring.jpa.database-platform=org.hibernate.dialect.MariaDBDialect\n"
                + "spring.datasource.url=jdbc:mariadb://localhost:3300/" + artifact + "?createDatabaseIfNotExist=true\n"
                + "spring.datasource.username=" + db_user + "\n"
                + "spring.datasource.password=" + db_password + "\n"
                + "\n"
                + "\n"
                + "#spring.datasource.driver-class-name=org.mariadb.jdbc.Driver\n"
                + "#spring.jpa.database-platform=org.hibernate.dialect.MariaDBDialect\n"
                + "#spring.datasource.url=jdbc:mariadb://localhost:3306/" + artifact + "?createDatabaseIfNotExist=true\n"
                + "#spring.datasource.username=root\n"
                + "#spring.datasource.password=" + db_password + "\n"
                + "\n"
                + "spring.jp.properties.hibernate.jdbc.lob.non_contextual_creation= true\n"
                + "spring.jpa.hibernate.ddl-auto=none\n"
                + "#spring.jpa.show-sql=true\n"
                + "#spring.jpa.generate-ddl=true\n"
                + "\n"
                + "\n"
                + "server.port = " + port + "\n"
                + "\n"
                + "\n"
                + "#The path to the swagger UI\n"
                + "#http://{IP}:{port}/"+ artifact + "/api/swagger-ui/index.html\n"
                + "springfox.documentation.swagger-ui.base-url=/"+ artifact + "/api\n"
                + "springfox.documentation.swagger.v2.path=/"+ artifact + "/api/docs\n"
                + "spring.mvc.pathmatch.matching-strategy=ant-path-matcher\n"
                + "\n"
                + "#spring.data.rest.basePath=/api/v1\n"
                + "\n"
                + "\n"
                + "logging.level.com."+ artifact + "=info\n"
                + "logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} - %msg%n\n"
                + "#logging.pattern.file=%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n\n"
                + "logging.pattern.file=%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36}.%M\\(%line\\) - %msg%n\n"
                + "logging.path=logs\n"
                + "logging.file.name=MyAppLogs/myapp.log\n"
                + "";
    }
}
