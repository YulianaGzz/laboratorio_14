# Laboratorio 14: Inventario de Productos Tecnológicos

## Descripción

Inventario de Productos Tecnológicos es una aplicación web desarrollada con Spring Boot que permite gestionar productos mediante operaciones CRUD (Create, Read, Update y Delete).

El sistema fue desarrollado como proyecto final del Laboratorio 14 de Programación Orientada a Objetos, aplicando los conocimientos adquiridos sobre desarrollo web con Java, Spring Boot, Thymeleaf, JPA y MySQL.

La aplicación permite registrar, consultar, editar y eliminar productos tecnológicos almacenados en una base de datos MySQL, ofreciendo una interfaz amigable para la administración de inventario.

---

## Objetivo

Desarrollar una aplicación web funcional que implemente las operaciones CRUD completas sobre una base de datos relacional, aplicando una arquitectura organizada por capas y utilizando tecnologías modernas del ecosistema Java.

---

## Tecnologías Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven
- HTML5
- CSS3

---

## Arquitectura del Proyecto

La aplicación se encuentra organizada siguiendo el patrón MVC y una arquitectura por capas:

```text
Controller
   ↓
Service
   ↓
Repository
   ↓
Base de Datos MySQL
```

### Capas

#### Controller
Gestiona las solicitudes HTTP realizadas por el usuario desde el navegador.

#### Service
Contiene la lógica de negocio de la aplicación y actúa como intermediario entre el Controller y el Repository.

#### Repository
Permite acceder y manipular la información almacenada en la base de datos mediante Spring Data JPA.

#### Model
Representa la entidad Producto y sus atributos.

---

## Entidad Principal

### Producto

Cada producto almacena la siguiente información:

| Campo | Descripción |
|---------|-------------|
| id | Identificador único |
| nombre | Nombre del producto |
| marca | Marca del producto |
| categoria | Categoría tecnológica |
| precio | Precio del producto |
| stock | Cantidad disponible |

---

## Funcionalidades

### Crear Producto

Permite registrar nuevos productos tecnológicos dentro del inventario.

---

### Consultar Productos

Muestra todos los productos almacenados en una tabla dinámica.

---

### Editar Producto

Permite modificar la información de un producto existente.

---

### Eliminar Producto

Permite eliminar un producto del inventario mediante una confirmación previa.

---

## Estructura del Proyecto

```text
inventario-web/

├── pom.xml
├── src/
│
├── main/
│   ├── java/
│   │   └── com/gremio/
│   │
│   ├── controller/
│   │   └── ProductoController.java
│   │
│   ├── service/
│   │   └── ProductoService.java
│   │
│   ├── repository/
│   │   └── ProductoRepository.java
│   │
│   ├── model/
│   │   └── Producto.java
│   │
│   └── AgendaWebApplication.java
│
└── resources/
    ├── templates/
    │   ├── productos.html
    │   └── formulario.html
    │
    └── application.properties
```

---

## Base de Datos

Crear la base de datos:

```sql
CREATE DATABASE inventario;
```

La aplicación genera automáticamente la tabla mediante Hibernate gracias a la configuración:

```properties
spring.jpa.hibernate.ddl-auto=update
```

---

## Configuración

Configurar el archivo:

```properties
application.properties
```

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventario
spring.datasource.username=root
spring.datasource.password=TU_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Ejecución

### Windows

```bash
mvnw.cmd spring-boot:run
```

### Linux / Mac

```bash
./mvnw spring-boot:run
```

---

## Acceso al Sistema

Una vez iniciada la aplicación:

```text
http://localhost:8080/productos
```

---

## CRUD Implementado

| Operación | Método HTTP | URL |
|------------|------------|------|
| Crear | POST | /guardar |
| Consultar | GET | /productos |
| Editar | GET | /editar/{id} |
| Actualizar | POST | /actualizar |
| Eliminar | GET | /eliminar/{id} |

---

## 📸 Evidencias

El proyecto incluye evidencia de:

- Registro de productos.
- Consulta de productos.
- Edición de productos.
- Eliminación de productos.
- Persistencia de datos en MySQL.
- Consultas realizadas mediante Hibernate.

---

## Aprendizajes Obtenidos

Durante el desarrollo de este proyecto se reforzaron conocimientos relacionados con:

- Programación Orientada a Objetos.
- Desarrollo web con Spring Boot.
- Arquitectura MVC.
- Spring Data JPA.
- Persistencia de datos con MySQL.
- Integración de formularios mediante Thymeleaf.
- Uso de Git y GitHub para el control de versiones.

---

## Autora

**Yuliana González**

Proyecto Final - Laboratorio 14  
Programación Orientada a Objetos
UANL

---
