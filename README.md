# ¿Qué es graphql?

GraphQL es un lenguaje de datos desarrollado para habilitar aplicaciones que recuperen datos de servidores. Tiene un estilo declarativo y autodocumentativo. En una operación de GraphQL el cliente especifica cómo estructurar los datos cuando el servidor los devuelve. Esto hace que el cliente pueda consultar solo los datos que necesite, en el formato en que los necesite.

GraphQL tiene tres operaciones de nivel superior:

- Consulta: recuperación de solo lectura

- Mutación: escritura, seguida de una obtención de datos

- Suscripción: conexión de larga duración para recibir datos

GraphQL expone estas operaciones a través de un esquema que define las capacidades de una API. Un esquema se compone de tipos, que pueden ser tipos raíz (consulta, mutación o suscripción) o tipos definidos por el usuario. Los desarrolladores comienzan con un esquema para definir las capacidades de su API de GraphQL, con la que se comunicará una aplicación cliente.


