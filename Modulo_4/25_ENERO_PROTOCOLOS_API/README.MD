# Protocolos HTTP y TCP/IP
Los protocolos son conjuntos de normas para formatos de mensaje y procedimientos que permiten a las máquinas y los programas de aplicación intercambiar información. Cada máquina implicada en la comunicación debe seguir estas normas para que el sistema principal de recepción pueda interpretar el mensaje.

## TCP/IP

El protocolo TCP/IP (Transmission Control Protocol/Internet Protocol) es un conjunto de protocolos de comunicación que se utiliza para la transmisión de datos en redes de computadoras. Este conjunto de protocolos es fundamental para el funcionamiento de Internet y se utiliza para la transmisión de datos a través de redes, ya sean redes locales (LAN) o redes globales como Internet.

Aquí hay una breve descripción de los dos principales componentes del protocolo TCP/IP:

1. **Protocolo de Control de Transmisión (TCP - Transmission Control Protocol):**
   - Es un protocolo orientado a la conexión, lo que significa que antes de la transmisión de datos se establece una conexión entre el remitente y el destinatario.
   - Proporciona un flujo de datos confiable y ordenado entre los dispositivos conectados.
   - Divide los datos en paquetes y se encarga de reensamblarlos en el orden correcto en el extremo receptor.
   - Garantiza la entrega de los datos sin errores y en el orden correcto.

2. **Protocolo de Internet (IP - Internet Protocol):**
   - Es responsable del direccionamiento y enrutamiento de los paquetes de datos.
   - Asigna direcciones únicas a cada dispositivo conectado a la red (direcciones IP) para identificarlos de manera única.
   - Permite el enrutamiento de los paquetes de datos a través de diferentes nodos de la red para llegar desde el remitente hasta el destinatario.
   - Se encarga de la fragmentación y reensamblaje de los paquetes en caso de que la red no pueda manejar el tamaño original del paquete.

El conjunto completo de protocolos TCP/IP incluye otros protocolos adicionales, como el Protocolo de Control de Mensajes de Internet (ICMP) para el manejo de mensajes de error y control, y el Protocolo de Configuración Dinámica de Host (DHCP) para asignar direcciones IP de manera dinámica.

En resumen, TCP/IP es esencial para la comunicación efectiva de datos en redes de computadoras, proporcionando un conjunto de reglas y estándares que permiten la transmisión de información de manera confiable y eficiente.

## Protocolo HTTP

El Protocolo de Transferencia de Hipertexto (HTTP - Hypertext Transfer Protocol) es un protocolo de comunicación utilizado para la transmisión de información en la World Wide Web. Desarrollado en la década de 1990, HTTP es un protocolo de aplicación que se encuentra en la capa de aplicación del modelo OSI (Open Systems Interconnection).

Aquí hay algunas características clave de HTTP:

1. **Protocolo sin estado:**
   - HTTP es un protocolo sin estado, lo que significa que cada solicitud del cliente al servidor es independiente de las solicitudes anteriores. La conexión entre el cliente y el servidor no mantiene información sobre el estado anterior.

2. **Cliente-Servidor:**
   - HTTP opera bajo el modelo cliente-servidor, donde un cliente (por lo general, un navegador web) realiza solicitudes y un servidor web responde proporcionando los recursos solicitados.

3. **Basado en texto:**
   - Las comunicaciones HTTP se realizan mediante mensajes de texto legibles por humanos. Las solicitudes y las respuestas consisten en líneas de texto que contienen encabezados y, opcionalmente, un cuerpo que puede contener datos adicionales.

4. **Métodos de solicitud:**
   - HTTP define varios métodos de solicitud, siendo los más comunes GET y POST. 
     - **GET:** Se utiliza para solicitar datos de un recurso específico.
     - **POST:** Se utiliza para enviar datos al servidor para ser procesados.

5. **Encabezados HTTP:**
   - Los encabezados son parte fundamental de las solicitudes y respuestas HTTP. Proporcionan información adicional sobre la solicitud o la respuesta, como el tipo de contenido, la longitud del contenido, cookies, etc.

6. **Códigos de estado:**
   - HTTP utiliza códigos de estado para indicar el resultado de una solicitud. Algunos ejemplos comunes son 200 OK (éxito), 404 Not Found (recurso no encontrado) y 500 Internal Server Error (error interno del servidor).

7. **Seguridad:**
   - HTTP no es un protocolo seguro por sí mismo. Sin embargo, HTTPS (HTTP Secure) utiliza una capa de seguridad adicional mediante el uso de SSL/TLS para cifrar las comunicaciones entre el cliente y el servidor, proporcionando así una capa de seguridad para la transmisión de datos.

En resumen, HTTP es el protocolo fundamental para la transferencia de información en la web. Aunque ha evolucionado con el tiempo y se ha mejorado en términos de seguridad y eficiencia, su naturaleza sin estado y su simplicidad son características clave que han contribuido a su amplia adopción en el mundo de Internet.

## Fuentes

[Protocolos TCP/IP](https://www.ibm.com/docs/es/aix/7.2?topic=protocol-tcpip-protocols)

[Familia_de_protocolos_de_internet](https://es.wikipedia.org/wiki/Familia_de_protocolos_de_internet)

[Protocolo HTTP](https://www.ionos.es/digitalguide/hosting/cuestiones-tecnicas/protocolo-http/)