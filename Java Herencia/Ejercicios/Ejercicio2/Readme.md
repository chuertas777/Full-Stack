<h1>Ejercicio 2</h1>

Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:</br></br>
• Un constructor vacío.</br>
• Un constructor con todos los atributos pasados por parámetro.</br>
Los métodos a implementar son:</br></br>
• Métodos getters y setters de todos los atributos.</br>
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.</br></br>
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.</br></br>

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.</br></br>
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. </br></br> 

Esta es la lista de precios:
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.</br></br>
Los constructores que se implementarán serán:</br></br>
• Un constructor vacío.</br></br>
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.</br></br>
Los métodos que se implementara serán:</br></br>
• Método get y set del atributo carga.</br></br>
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.</br></br>
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.</br></br>
Los constructores que se implementarán serán:</br></br>
• Un constructor vacío.</br>
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.</br></br>
LETRA PRECIO</br>
 A 	$1000</br>
 B 	$800</br>
 C 	$600</br>
 D	$500</br>
 E 	$300</br>
 F 	$100</br>

PESO PRECIO</br>
Entre 1 y 19 kg $100</br>
Entre 20 y 49 kg $500</br>
Entre 50 y 79 kg $800</br>
Mayor que 80 kg $1000</br>

Los métodos que se implementara serán:</br></br>
• Método get y set de los atributos resolución y sintonizador TDT.</br>
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.</br>
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.</br>
Finalmente, en el main debemos realizar lo siguiente:</br></br>
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
