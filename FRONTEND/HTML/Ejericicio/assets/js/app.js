function miFuncion() {
  var outputElement = document.getElementById("egg");
  var paragraphElement = document.createElement("h1");
  var message = 'Egg';
  const spacing = "10px";
  var styles = `padding: ${spacing}; background-color: black; color:
yellow; font-style:
italic; border: 1px solid black; font-size: 2em;`;
  //console.log('%cEGG', styles);

  paragraphElement.style = styles;
  paragraphElement.textContent = message;
  outputElement.appendChild(paragraphElement);
}

function miFuncion1() {
  //document.getElementById("demo").innerHTML = "Parrafo cambiado!.";
  let cadena = "Hola";
  console.log(cadena.length);

}



 