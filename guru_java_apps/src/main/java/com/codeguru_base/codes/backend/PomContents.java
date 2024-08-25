/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.backend;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class PomContents {


    public String Code(String springVersion, String group, String artifact, String appVersion, String description, String java_version) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
                + "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">\n"
                + "    <modelVersion>4.0.0</modelVersion>\n"
                + "    <parent>\n"
                + "        <groupId>org.springframework.boot</groupId>\n"
                + "        <artifactId>spring-boot-starter-parent</artifactId>\n"
                + "        <version>" + springVersion + "</version>\n"
                + "        <relativePath/> <!-- lookup parent from repository -->\n"
                + "    </parent>\n"
                + "    <groupId>com." + group + "</groupId>\n"
                + "    <artifactId>"+artifact+"</artifactId>\n"
                + "    <version>"+appVersion+"</version>\n"
                + "    <name>"+artifact+"</name>\n"
                + "    <description>"+description+"</description>\n"
                + "    <properties>\n"
                + "        <java.version>"+java_version+"</java.version>\n"
                + "    </properties>\n"
                + "    <dependencies>\n"
                + "       \n"
                + "        <dependency>\n"
                + "            <groupId>org.springframework.boot</groupId>\n"
                + "            <artifactId>spring-boot-starter-data-jpa</artifactId>\n"
                + "        </dependency>\n"
                + "        <dependency>\n"
                + "            <groupId>org.springframework.boot</groupId>\n"
                + "            <artifactId>spring-boot-starter-web</artifactId>\n"
                + "        </dependency>\n"
                + "        <dependency>\n"
                + "            <groupId>com.mysql</groupId>\n"
                + "            <artifactId>mysql-connector-j</artifactId>\n"
                + "            <scope>runtime</scope>\n"
                + "        </dependency>\n"
                + "        <dependency>\n"
                + "            <groupId>org.mariadb.jdbc</groupId>\n"
                + "            <artifactId>mariadb-java-client</artifactId>\n"
                + "            <scope>runtime</scope>\n"
                + "        </dependency>\n"
                + "        <dependency>\n"
                + "            <groupId>org.projectlombok</groupId>\n"
                + "            <artifactId>lombok</artifactId>\n"
                + "            <optional>true</optional>\n"
                + "        </dependency>\n"
                + "        <dependency>\n"
                + "            <groupId>org.springframework.boot</groupId>\n"
                + "            <artifactId>spring-boot-starter-test</artifactId>\n"
                + "            <scope>test</scope>\n"
                + "        </dependency>\n"
                + "        <dependency>\n"
                + "            <groupId>io.springfox</groupId>\n"
                + "            <artifactId>springfox-boot-starter</artifactId>\n"
                + "            <version>3.0.0</version>\n"
                + "        </dependency>\n"
                + "        \n"
                + "        \n"
                + "        <!--this is to help converting the model to a dto in order to load data lazily-->\n"
                + "        <dependency>\n"
                + "            <groupId>org.modelmapper</groupId>\n"
                + "            <artifactId>modelmapper</artifactId>\n"
                + "            <version>3.1.0</version>\n"
                + "        </dependency>\n"
                + "        \n"
                + "        <dependency>\n"
                + "            <groupId>javax.validation</groupId>\n"
                + "            <artifactId>validation-api</artifactId>\n"
                + "            <type>jar</type>\n"
                + "        </dependency>  \n"
                + "        <dependency>\n"
                + "            <groupId>org.springframework.boot</groupId>\n"
                + "            <artifactId>spring-boot-starter-data-redis</artifactId>\n"
                + "        </dependency>  \n"
                + "        <!--CASHING--> \n"
                + "        \n"
                + "        \n"
                + "        <!-- https://mvnrepository.com/artifact/redis.clients/jedis -->\n"
                + "        <dependency>\n"
                + "            <groupId>redis.clients</groupId>\n"
                + "            <artifactId>jedis</artifactId>\n"
                + "        </dependency>\n"
                + "\n"
                + "        <dependency>\n"
                + "            <groupId>commons-io</groupId>\n"
                + "            <artifactId>commons-io</artifactId>\n"
                + "            <version>2.4</version>\n"
                + "        </dependency>\n"
                + "        <!-- https://mvnrepository.com/artifact/commons-net/commons-net -->\n"
                + "        <dependency>\n"
                + "            <groupId>commons-net</groupId>\n"
                + "            <artifactId>commons-net</artifactId>\n"
                + "            <version>3.8.0</version>\n"
                + "        </dependency>\n"
                + "\n"
                + "    </dependencies>\n"
                + "\n"
                + "    <build>\n"
                + "        <finalName>\n"
                + "            ${artifactId}\n"
                + "        </finalName>\n"
                + "        <plugins>\n"
                + "            <plugin>\n"
                + "                <groupId>org.springframework.boot</groupId>\n"
                + "                <artifactId>spring-boot-maven-plugin</artifactId>\n"
                + "                <executions>\n"
                + "                    <execution>\n"
                + "                        <goals>\n"
                + "                            <goal>build-info</goal>\n"
                + "                        </goals>\n"
                + "                    </execution>\n"
                + "                </executions>\n"
                
                + "            </plugin>\n"
                + "            <plugin>\n"
                + "                <groupId>org.apache.maven.plugins</groupId>\n"
                + "                <artifactId>maven-war-plugin</artifactId>\n"
                + "                <configuration>\n"
                + "                    <archive>\n"
                + "                        <manifestEntries>\n"
                + "                            <Dependencies>jdk.unsupported</Dependencies>\n"
                + "                        </manifestEntries>\n"
                + "                    </archive>\n"
                + "                </configuration>\n"
                + "            </plugin> \n"
                + "        </plugins>\n"
                + "    </build>\n"
                + "    <repositories>\n"
                + "        <repository>\n"
                + "            <id>spring-milestones</id>\n"
                + "            <name>Spring Milestones</name>\n"
                + "            <url>https://repo.spring.io/milestone</url>\n"
                + "            <snapshots>\n"
                + "                <enabled>false</enabled>\n"
                + "            </snapshots>\n"
                + "        </repository>\n"
                + "        <repository>\n"
                + "            <id>spring-snapshots</id>\n"
                + "            <name>Spring Snapshots</name>\n"
                + "            <url>https://repo.spring.io/snapshot</url>\n"
                + "            <releases>\n"
                + "                <enabled>false</enabled>\n"
                + "            </releases>\n"
                + "        </repository>\n"
                + "    </repositories>\n"
                + "    <pluginRepositories>\n"
                + "        <pluginRepository>\n"
                + "            <id>spring-milestones</id>\n"
                + "            <name>Spring Milestones</name>\n"
                + "            <url>https://repo.spring.io/milestone</url>\n"
                + "            <snapshots>\n"
                + "                <enabled>false</enabled>\n"
                + "            </snapshots>\n"
                + "        </pluginRepository>\n"
                + "        <pluginRepository>\n"
                + "            <id>spring-snapshots</id>\n"
                + "            <name>Spring Snapshots</name>\n"
                + "            <url>https://repo.spring.io/snapshot</url>\n"
                + "            <releases>\n"
                + "                <enabled>false</enabled>\n"
                + "            </releases>\n"
                + "        </pluginRepository>\n"
                + "    </pluginRepositories>\n"
                + "\n"
                + "</project>\n"
                + "";
    }
}
