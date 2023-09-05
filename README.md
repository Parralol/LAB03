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


##Diseño de pruebas


1) De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería
arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.

	a) deberia lanzar excepcion cuando:
		- La edad sea menor a 0 o mayor o igual a 150
		- La tarifa base sea negativa
		- Los dias de antelacion sean menores a 0 
		
2) | Número | Clase de equivalencia (en lenguaje natural o matematico) | Resultado |
   | ------ | -------------------------------------------------------- | --------- |
   | 1      | 0 > edad <= 150 										   | Incorrecto |
   | 2      | tarifa_base < 0                                          | Incorrecto |
   | 3      | dias < 0												   | Incorrecto |
   | 4      | Con edad de 17 años no tener el 5% aplicado a descuento  | Incorrecto |
   | 5      | Con edad > 65 no tener el 8% aplicado a descuento		   | Incorrecto |
   | 6      | No tener el descuento del 15% aplicado con 20 dias de antelacion | Incorrecto |
   | 7      | Tener el descuento acumulado de menor de edad y 20 dias de antelacion | Correcto |
   | 8		| Tener el descuento acumulado de mayor de 65 y 20 dias de antelacion | Correcto |
   
   
3) 
	**Caso de prueba 1**
	Parametros: 
				TarifaBase = 51651
				diasAntelacion = 15
				edad = 0
				
				Resultado esperado: ExcepcionParametrosInvalidos.EDAD_FUERA_RANGO
				
	**Caso de prueba 2**
	Parametros:
				TarifaBase = -1
				diasAntelacion = 15
				edad = 18
				
				Resultado esperado: ExcepcionParametrosInvalidos.EDAD_FUERA_RANGO
				
	**Caso de prueba 3**
	Parametros:
				TarifaBase = 16516
				diasAntelacion = -1
				edad = 20
				
				Resultado esperado: ExcepcionParametrosInvalidos.EDAD_FUERA_RANGO
				
	**Caso de prueba 4**
	Parametros:
				TarifaBase = 123456
				diasAntelacion = 20
				edad = 18
				
				Resultado esperado: 117283.2
				
	**Caso de prueba 5**
	Parametros:
				TarifaBase = 123456
				diasAntelacion = 20
				edad = 66
				
				Resultado esperado: 113579.52

	**Caso de prueba 6**
	Parametros:
				TarifaBase = 123456
				diasAntelacion = 21
				edad = 18
				
				Resultado esperado: 104937.6
				
	**Caso de prueba 7**
	Parametros:
				TarifaBase = 123456
				diasAntelacion = 21
				edad = 17
				
				Resultado esperado: 98764.8
				
	**Caso de prueba 8**
	Parametros:
				TarifaBase = 123456
				diasAntelacion = 21
				edad = 66
				
				Resultado esperado: 95061.12
				
4) Condiciones Limite
		
	caso 1:
		0> edad <=150
	caso 2:
		tarifa_base<0
	caso 3:
		diasAntelacion < 0
	caso 4:
		condiciones de caso 1,2,3
	caso 5:
		condiciones de caso 1,2,3
	caso 6:
		condiciones de caso 1,2,3
	caso 7:
		condiciones de caso 1,2,3
	caso 8:
		condiciones de caso 1,2,3

5) Casos de pruebas

	Caso 1






















