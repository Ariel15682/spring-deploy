# spring-deploy
[![Run on Repl.it](https://replit.com/badge/github/Ariel15682/spring-deploy)](https://replit.com/new/github/Ariel15682/spring-deploy)

# Despliegue de apps Spring Boot en Heroku

....
java.runtime.version = 17
....

1. Crear cuenta en Heroku.com y Github.com.
2. Tener configurago Git en el ordenador:
   1. 'git config --global user.name "Ariel Diaz"'
   2. 'git config --global user.email "arieldiaz@mail.com"'
3. Subir el proyecto a GitHub desde IntelliJ IDEA desde la opcion: VCS > Share project on GitHub
4. DEsde Heroku, crear app y elegir metodo GitHub y buscar el repositorio subido
5. Habilitar o no Deploy Automatico y ejecutar el Deploy

## Ejercicio 1
* Probar empaquetar la aplicacion con Maven Package desde IntelliJ
* Desde terminal en IntelliJ verificar que se ejecuta correctamente con el comando:
   
   ....
   java -jar target/spring-deploy.jar
   ....

* Crear un perfil para dev y otro para test co una propiedad nueva que carguemos en el controlador


## Ejercicio 2
 
* Desplegar el API REST de Laptops en Heroku y verificar funcionamiento desde Postman

## Proveedores Cloud
* Heroku -- Java, Spring, Postgree SQL
* Netlify -- Frontend (React, Angular....)
* Vercel -- Frontend (React, Angular....)