//Ejercicio 1 //
function clima() {
  let clima = prompt(
    "¿Cómo está el día de hoy? (soleado, nublado, lloviendo)."
  );
  alert("“El día de hoy está: " + " " + clima);
}

//Ejercicio 2 //

function calcularPi() {
  let radio = parseFloat(
    prompt("Ingrese el valor del radio para calcular el área y el perimetro")
  );
  alert(`
    el valor ingresado es: ${radio}
    el área es : ${Math.PI * (radio * radio)}
    el perímetro es: ${2 * Math.PI * radio} 
    `);
}

//Ejercicio 3 //

function calcularEdad() {
  let edad = parseInt(
    prompt("Ingrese su edad para verificar si es mayor o menor de edad")
  );

  edad = edad >= 18 ? "Es mayor de edad " : "Es menor de edad";
  alert(edad);
}

//Ejercicio 4 //

function correctoIncorrecto() {
  let flag = true;
  do {
    let verificar = prompt("Ingrese el caracter 'S' o 'N' para verificar ");
    if (verificar === "S" || verificar === "N") {
      alert("Es correcto");
      flag = false;
    } else {
      alert("Es incorrecto");
    }
  } while (flag);
}

//Ejercicio 5 //

function operaciones() {
  let a = 0,
    num1 = 0,
    num2 = 0,
    resl = 0;
  do {
    a = parseInt(
      prompt(`Bienvenido a la calculadora Javascript aquí podra hacer las siguientes operaciones:
      1. Sumar
      2. Restar
      3. Multiplicación
      4. División
      5. Salir
      `)
    );

    switch (a) {
      case 1:
        alert("¡Vamos a Sumar!");
        num1 = parseInt(prompt("Ingrese el primer valor númerico"));
        num2 = parseInt(prompt("Ingrese el segundo valor númerico"));
        resl = num1 + num2;
        alert("El resultado es:" + resl);
        break;
      case 2:
        alert("¡Vamos a Restar!");
        num1 = parseInt(prompt("Ingrese el primer valor númerico"));
        num2 = parseInt(prompt("Ingrese el segundo valor númerico"));
        resl = num1 - num2;
        alert("El resultado es:" + resl);
        break;
      case 3:
        alert("¡Vamos a multiplicar!");
        num1 = parseInt(prompt("Ingrese el primer valor númerico"));
        num2 = parseInt(prompt("Ingrese el segundo valor númerico"));
        resl = num1 * num2;
        alert("El resultado es:" + resl);
        break;
      case 4:
        alert("¡Vamos a Dividir!");
        num1 = parseInt(prompt("Ingrese el primer valor númerico"));
        num2 = parseInt(prompt("Ingrese el segundo valor númerico"));
        num2 =
          num2 === 0
            ? alert(
                "No se puede realizar la operación es un valor indeterminado"
              )
            : (resl = num1 / num2) + alert("El resultado es: " + resl);

        break;
      case 5:
        alert("Saliste del programa");
      default:
        break;
    }
  } while (a != 5);
}

//Ejercicio 6 //
function parImpar() {
  let num = 0,
    resl = 0;

  num = parseInt(prompt("Ingrese un número para verificar si es par o Impar"));
  if (num === 0) {
    alert("El número: " + num + "  no es ni par ni impar");
  } else {
    resl = num % 2;
    num =
      resl === 0 && num > 0
        ? alert("El número:  " + num + " es par ")
        : alert("El número:  " + num + " es impar");
  }
}

//Ejercicio 7 //
function limitePositivo() {
  let num = 0,
    sum = 0,
    cont = 0;

  num = parseInt(prompt("Ingrese un valor limite positivo"));
  while (sum <= num) {
    const numeros = parseInt(prompt("Ingrese un número"));
    sum += numeros;
    cont++;
  }
  alert(`Se ingresaron  ${cont}  números `);
  alert(`La suma total es: ${sum}`);
}

//Ejercicio 8 //
function numeroEnteros() {
  let numero = 0,
    max = 0,
    min = 0,
    sumar = 0,
    cont = 1;

  while (true) {
    const numero = parseInt(prompt("Ingrese número (Ingrese 0 para salir): "));

    if (numero === 0) {
      break; // Salir del bucle si se ingresa 0
    }

    if (numero > max) {
      max = numero;
    }

    if (numero !== 0 && numero < min) {
      min = numero;
    }

    sumar += numero;
    cont++;
  }

  if (cont === 0) {
    alert("No se ingresaron números");
  } else {
    const promedio = sumar / cont;

    alert(`El máximo número ingresado es: ${max}`);
    alert(`El mínimo número ingresado es: ${min}`);
    alert(`El promedio de los números ingresados es: ${promedio}`);
  }
}

//Ejercicio 9 //
function frase() {
  let word = prompt("Ingrese una palabra ");
  let espacio = " ";

  for (let i = 0; i < word.length; i++) {
    espacio += word.substring(i, i + 1) + " ";
  }

  alert("La nueva palabra es: " + espacio);
}

//Ejercicio 10 //
function fraseReves() {
  invertirPalabra = (palabra) => palabra.split("").reverse().join("");

  let palabra = prompt("Ingrese una palabra ");
  let palabraInvertida = invertirPalabra(palabra);
  alert(`La nueva frase es: ${palabraInvertida} `);
}

//Ejercicio 11 //
function fraseLarga() {
  let cadena = prompt("Ingrese una palabra para verificar");
  const palabras = cadena.split(" ");
  let palabraMasLarga = "";

  for (const palabra of palabras) {
    if (palabra.length > palabraMasLarga.length) {
      palabraMasLarga = palabra;
    }
  }

  alert(`La nueva palabra es: ${palabraMasLarga}`);
}

//Ejercicio 12 //
function retornarTipo() {
  const retornarTipoDato = (dato) => typeof dato;
  let dato = prompt("Ingrese un dato para verificar ");
  let numero = parseInt(dato);
  let datoIngresado = retornarTipoDato(dato);

  if (!isNaN(numero)) {
    alert(`El dato ingresado es un ${retornarTipoDato(numero)}`);
  } else if (dato === "true" || dato === "false") {
    alert(`El dato ingresado es un boolean`);
  } else {
    alert(`El dato ingresado es: ${datoIngresado}`);
  }
}

//Ejercicio 13 //
function retornarPersona() {
  var persona = {
    nombre: prompt("Ingrese su nombre "),
    edad: parseInt(prompt("Ingrese su edad ")),
    sexo: prompt("Ingrese su tipo de sexo "),
    peso: parseFloat(prompt("Ingrese su peso ")),
    altura: parseFloat(prompt("Ingrese su altura ")),
  };

  alert(` Los datos son:
        El nombre: ${persona.nombre}
        La edad es: ${persona.edad}
        El sexo es: ${persona.sexo}
        El peso es: ${persona.peso}
        La altura es: ${persona.altura}
  `);
}

//Ejercicio 14 //
function retornarLibro() {
  var libro = {
    ISBN: prompt("Ingrese el ISBN: "),
    titulo: prompt("Ingrese el título: "),
    autor: prompt("Ingrese el autor: "),
    npaginas: parseInt(prompt("Ingrese el número de páginas: ")),
  };

  alert(`Los datos del libro son:
          El ISBN es: ${libro.ISBN}
          El título es: ${libro.titulo}
          El autor es: ${libro.autor}
          El número de páginas es: ${libro.npaginas}
  `);
}

//Ejercicio 15 //
function calcularPerimetro() {
  let radio = parseFloat(
    prompt(
      "Ingrese el valor del radio para calcular el perimetro y área de un circulo"
    )
  );
  let perimetro = 2 * Math.PI * radio;
  let area = Math.PI * Math.pow(radio, 2);

  alert(` El resultado de calcular es:
          Perimetro del círculo es: ${perimetro}
          Área del cículo es: ${area}
  
  `);
}

//Ejercicio 16 //
function llenarVectores() {
  let vector1 = [],
    vector2 = [],
    variable = 5;

  for (let index = 0; index < variable; index++) {
    vector1[index] = Math.floor(Math.random() * 10);
    vector2[index] = Math.floor(Math.random() * 10);
  }

  vector1.forEach(function (elemento1) {
    alert(`Elementos del vector 1: ${elemento1}`);
    console.log(`Elementos del vector 1 ${elemento1}`);
  });

  vector2.forEach(function (elemento2) {
    alert(`Elementos del vector 2: ${elemento2}`);
    console.log(`Elementos del vector 2 ${elemento2}`);
  });
}

//Ejercicio 17//
function eliminarElementoVector() {
  let vector = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
  alert(`El vector tiene los siguientes elementos: ${vector}`);
  let indice = parseInt(prompt("Ingrese el indice a eliminar "));

  if (indice <= 10 && indice > 0) {
    var elementoEliminado = vector.splice(indice, 1);
    alert(`Elemento eliminado: ${elementoEliminado}`);
    alert(`El vector tiene los siguientes elementos: ${vector}`);
  } else {
    alert("No existe el elemento en el vector");
  }
}

//Ejercicio 18//
function vectorValores() {
  var valores = [true, 5, false, "hola", "adios", 2];

  let pal1 = valores[3];
  let pal2 = valores[4];
  let verdadero = valores[0];
  let falso = valores[2];
  let a = valores[1];
  let b = valores[5];

  if (pal1.length > pal2.length) {
    alert(`La segunda palabra es mayor ${pal1}`);
    alert(`El valor de la operación es: ${falso}`);
  } else {
    alert(`La segunda palabra es mayor ${pal2}`);
    alert(`El valor de la operación es: ${verdadero}`);
    alert(`El resultado de la operación suma es: ${a + b}`);
    alert(`El resultado de la operación resta es: ${a - b}`);
    alert(`El resultado de la operación multiplicación es: ${a * b}`);
    alert(`El resultado de la operación división es: ${a / b}`);
    alert(`El resultado de la operación exponenciación es: ${Math.pow(a, b)}`);
  }
}

//Ejericicio 19 //
function vectoresAB() {
  let vectorA = [],
    vectorB = [],
    tamA = 50;
  tamB = 20;
  vectorOrdenado = [];

  for (let index = 0; index < tamA; index++) {
    vectorA[index] = Math.floor(Math.random() * 50);
  }

  vectorOrdenado = vectorA.sort((a,b)=> a - b);

  for (let index = 0; index < 10; index++) {
    vectorB[index] = vectorOrdenado[index]; 
  }

  for (let index = 10; index < 20; index++){
    vectorB[index] = 0.5;

  }

  console.log(vectorOrdenado);
  console.log(vectorB);
}

//Ejercicio 23 //

