# AWSLambdaGateway

Este laboratorio usa Amazon Gateway y Lambda para crear un servicio que reciba un número y retorna el cuadrado del mismo.

El servicio será consumido desde una máquina EC2 de Amazon. A continuacion se muestra el proceso general.


Lo primero que se hizo fue crear el servicio de Gateway API anotar el URL de este.
![](https://github.com/dcifuentesR/AWSLambdaGateway/blob/master/img/URL%20API%20Gateway.PNG)


Esta URL se usa en el servidor para invocar el servicio.
![](https://github.com/dcifuentesR/AWSLambdaGateway/blob/master/img/URL%20API%20Gateway%20-%20en%20aplicacion%20web.PNG)


Una vez se termina de implementar la aplicacion se crea una instancia EC2 en AWS.
![](https://github.com/dcifuentesR/AWSLambdaGateway/blob/master/img/DNS%20publico%20de%20la%20maquina%20en%20que%20esta%20corriendo.PNG)


Se ejecuta la aplicación.
![](https://github.com/dcifuentesR/AWSLambdaGateway/blob/master/img/La%20aplicacion%20corriendo%20en%20el%20servidor.PNG)


Se puede usar la aplicacion desde el browser.
![](https://github.com/dcifuentesR/AWSLambdaGateway/blob/master/img/Peticion%20desde%20del%20browser%20al%20EC2.PNG)
![](https://github.com/dcifuentesR/AWSLambdaGateway/blob/master/img/Resultado%20de%20la%20peticion.PNG)
