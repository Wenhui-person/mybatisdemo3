# mybatisdemo3
一、动态Mapper开发
二、需要注意的点：
1、pom文件中需要加入
<build>
        <resources>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
            </resource>
        </resources>
    </build>
2、需要在mybatis.xml文件中加入包声明（mapper和实体类）
3、在*Ma pper.xml文件中，namespace不能随便写，必须要写mapper接口的完全限定名
4、id属性必须要写接口中的方法名
