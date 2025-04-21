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
3. Ingresamos a la siguiente url:
```bash
http://localhost:8080/swagger-ui.html
