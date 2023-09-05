# LAB03
# Integrantes 
Gabriel Alejandro Silva Lozada
Santiago Nicolas Parra Giraldo

# ACTUALIZAR Y CREAR DEPENDENCIAS EN EL PROYECTO
ingresar a la pagina del repositorio de maven

![image](https://github.com/Parralol/LAB03/assets/123813120/7189c017-1d12-4439-8834-9d76f0f1b678)

Despues elegir el Jnunit elegir la actulización 4.13.2

![image](https://github.com/Parralol/LAB03/assets/123813120/ed06f84d-b7ea-4348-bb4c-17a478e17d2c)

# entrar a la pestaña maven 

![image](https://github.com/Parralol/LAB03/assets/123813120/cf08e6c2-4407-4347-8e2e-774f1b96ae9b)

Copiar el código de la pestaña maven y pegar el encabezado de “propiedades” con el fin de cambiar la versión del compilador a la  version 8 java

``` <!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
<properties>
<maven.compiler.target>1.8</maven.compiler.target>
<maven.compiler.source>1.8</maven.compiler.source>
</properties> ```

Una vez dentro del editor de codigo intellj , dentro del archive pom , editamos las propiedades
Y dependencias para que el codigo compile

![image](https://github.com/Parralol/LAB03/assets/123813120/43b66f06-0bf0-445e-a980-c374bb0347e4)

# Compilar y ejecutar
Ejecutamos los commandos mvn package dentro de la terminal de intelligj
``` mvn package ```

y el comando

``` mvn compile ```

























