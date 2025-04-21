# 🐳 Spring Boot Backend API - Proyecto Dockerizado
Este repositorio contiene un proyecto hecho con Java 17 y Spring Boot, para realizar pruebas de despliegue en cualquier plataforma. El proyecto ya se encuentra Dockerizado, listo para desplegarlo.
Además, provee de una interzas de Swagger para poder hacer consultas y verificar y despliegue con éxito.
Este proyecto además tiene implementado CI (Integracion continua).

---

## 🚀 Características

- API RESTful desarrollada con Spring Boot
- Documentación interactiva con Swagger (OpenAPI)
- Imagen publicada en Docker Hub: [`luisorihuela92/back-test`](https://hub.docker.com/r/luisorihuela92/back-test)
- Listo para desplegar en cualquier plataforma compatible con Docker, como:
  - 🟢 AWS EC2
  - 🟢 AWS Lightsail
  - 🟢 Servidores virtuales con Docker (ej. Ubuntu Server)
  - 🟢 Railway, Render, Fly.io (con adaptaciones)

---

## Tecnologias usadas
- **Java 17**
- **Spring Boot**
- **Swagger (para la documentación)**
- **Docker**
- **GitHub Actions (CI)**

## 📦 Instalación y uso

### 🔹 Opción 1: Usando Docker

1. Asegúrate de tener Docker instalado en tu máquina o servidor virtual.
2. Ejecuta el siguiente comando para descargar y correr el contenedor:

```bash
docker run -p 8080:8080 luisorihuela92/back-test
```
3. Ingresamos a la siguiente url (la url dependerá de que entorno se desplegará):
   
```bash
http://localhost:8080/swagger-ui-custom.html
http://IP-SERVER:8080/swagger-ui-custom.html
```

### 🔹 Opción 2: Clonar el repositorio y correrlo de manera local
1. Clona este repositorio:
 
```bash
git clone https://github.com/LuisOrihuela08/backend-test-deploy.git
cd backend-test-deploy
```

2. Asegúrate de tener Java 17 y Maven instalados.
3. Ejecuta el proyecto con:

```bash
./mvnw spring-boot:run
```

4. Visita Swagger en:
```bash
http://localhost:8080/swagger-ui-custom.html
```
