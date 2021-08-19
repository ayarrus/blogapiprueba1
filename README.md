Restful CRUD API para un blog usando Spring Boot, Mysql, JPA and Hibernate.

La app corre en <http://localhost:8080>


### Auth

| Metodo | URL | Descripcion | Ejemplo | 
| ------ | --- | ---------- | --------------------------- |
| POST   | /api/auth/signup | Registrarse | [JSON](#signup) |
| POST   | /api/auth/signin | Entrar | [JSON](#signin) |

### Users

| Metodo | URL | Descripcion | Sample Valid Request Body |
| ------ | --- | ----------- | ------------------------- |
| GET    | /api/users/me | Iniciar sesión en el perfil de usuario | |
| GET    | /api/users/{username}/profile | Obtener perfil de usuario por nombre de usuario | |
| GET    | /api/users/{username}/posts | Obtener publicaciones creadas por el usuario | |
| GET    | /api/users/checkUsernameAvailability | Compruebe si el nombre de usuario está disponible para registrarse 
 | |

### Posts

| Metodo | URL | Descripcion | Sample Valid Request Body |
| ------ | --- | ----------- | ------------------------- |
| GET    | /api/posts | Obtener todas las publicaciones  | |
| GET    | /api/posts/{id} | Obtener publicación por id  | |
| POST   | /api/posts | Crear nueva publicación (por usuario registrado)  | [JSON](#postcreate) |
| PUT    | /api/posts/{id} | Actualizar publicación (si la publicación pertenece al usuario que inició sesión o el usuario que inició sesión es administrador)  | [JSON](#postupdate) |
| DELETE | /api/posts/{id} | Eliminar publicación (si la publicación pertenece al usuario que inició sesión o el usuario que inició sesión es administrador)  | |

### Comments

| Metodo | URL | Descripcion | Sample Valid Request Body |
| ------ | --- | ----------- | ------------------------- |
| GET    | /api/posts/{postId}/comments | Obtenga todos los comentarios que pertenecen a la publicación con id = postId  | |
| GET    | /api/posts/{postId}/comments/{id} | Obtener comentario por id si pertenece a la publicación con id = postId  | |
| POST   | /api/posts/{postId}/comments |Crear un nuevo comentario para la publicación con id = postId (por usuario que inició sesión)  | [JSON](#commentcreate) |
| PUT    | /api/posts/{postId}/comments/{id} | Actualice el comentario por id si pertenece a la publicación con id = postId (si el comentario pertenece al usuario que inició sesión o el usuario que inició sesión es administrador)  | [JSON](#commentupdate) |
| DELETE | /api/posts/{postId}/comments/{id} | Eliminar el comentario por id si pertenece a la publicación con id = postId (si el comentario pertenece al usuario que inició sesión o el usuario que inició sesión es administrador)  | |


## Ejemplos
##### <a id="signup">Registrarse -> /api/auth/signup</a>
```json
{
	"firstName": "Agustin",
	"lastName": "Yarrus",
	"username": "ayarrus",
	"password": "123456",
	"email": "ayarrus@outlook.com"
}
```

##### <a id="signin">Entrar -> /api/auth/signin</a>
```json
{
	"usernameOrEmail": "ayarrus",
	"password": "123456"
}
```

##### <a id="usercreate">Crear usuario -> /api/users</a>
```json
{
	"firstName": "Agustin",
	"lastName": "Yarrus",
	"username": "ayarrus",
	"password": "123456",
	"email": "ayarrus@gmail.com"
}
```

##### <a id="userupdate">Actualizar usuario -> /api/users/{username}</a>
```json
{
	"firstName": "Agustin",
	"lastName": "Yarrus",
	"username": "ayarrus",
	"password": "123456",
	"email": "ayarrus@outlook.com"
}
```

##### <a id="userinfoupdate">Actualizar usuario -> /api/users/setOrUpdateInfo</a>
```json
{
	"street": "Boulogne Sur Mer 804",
	"suite": "9 A",
	"city": "BS AS"
}
```

##### <a id="postcreate">Crear post -> /api/posts</a>
```json
{
	"title": "Titulo de ejemplo",
	"body": "Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto"
}
```

##### <a id="postupdate">Actualizar post -> /api/posts/{id}</a>
```json
{
	"title": "Titulo de ejemplo actualizado",
	"body": "Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto"
}
```

##### <a id="commentcreate">Crear comentario -> /api/posts/{postId}/comments</a>
```json
{
	"body": "Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto"
}
```


##### <a id="commentupdate">Actualizar comentario -> /api/posts/{postId}/comments/{id}</a>
```json
{
	"body": "Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto"
}
```
