# Code Challenge - Softtek

<table>
  <tr>
    <th>Method</th>
    <th>URL</th>
    <th>Parameters</th>
    <th>Param</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>POST</td>
    <td>/api/v1/student</td>
    <td>NO</td>
    <td></td>
    <td>Crear nuevo estudiante</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/api/v1/student</td>
    <td>NO</td>
    <td></td>
    <td>Obtener todos los estudiantes</td>
  </tr>
  <tr>
    <td>UPDATE</td>
    <td>/api/v1/student/update</td>
    <td>SI</td>  
    <td>id_student</td>
    <td>Tipo de la busqueda (ID).</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/api/v1/student/find</td>
    <td>SI</td>  
    <td>name</td>
    <td>Tipo de la busqueda (fullName).</td>
  </tr>
  <tr>
    <td>DELETE</td>
    <td>/api/v1/student/delete</td>
    <td>SI</td>  
    <td>id_student</td>
    <td>Tipo de la busqueda (ID).</td>
  </tr>
</table>

## BODY - CREATE

```json
{
  "firstName": "Isaias",
  "lastName": "Quiroz",
  "status": true,
  "age": "12",
  "credits": 12,
  "semester": 2,
  "average": 14.5
}
```

### [postman collection](tools/Code-Challenge.postman_collection.json) # reto-tecnico-softtek

