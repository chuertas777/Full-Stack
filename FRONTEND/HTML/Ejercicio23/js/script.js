function pintarParrafo() {
  let parrafo = document.getElementById("pintar");
  let rta = document.getElementById("rta");
  let palabra ="";

  parrafo.innerHTML = parrafo.textContent
    .split(" ")
    .map(function (palabra) {
      if (palabra.length >= 8) {
        return '<span class="pintar">' + palabra + '</span>'
      } else {
        
        return '<span class="crecer">' + palabra + '</span>';
      }
    })
    .join(" ");

  rta.textContent = palabra;
}
