const ipServer = "http://172.30.198.206:8080";
function openTab(evt, tabName) {
  var i, tabcontent, tablinks;

  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }

  tablinks = document.getElementsByClassName("tablink");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(tabName).style.display = "block";
  evt.currentTarget.className += " active";
}

document.addEventListener('DOMContentLoaded', function() {
  document.querySelector('.tablink').click();
});
function showAddContentForm() {
  document.getElementById('contentForm').style.display = 'block';
}

function addContent() {
  const title = document.getElementById('contentTitle').value;
  const director = document.getElementById('contentDirector').value;
  const year = document.getElementById('contentYear').value;
  fetch(ipServer + "/contenido/")
    .then(response => response.json())
    .then(json => console.log(json));
  console.log('Añadiendo contenido:', title, director, year);
}

function showAddClientForm() {
  document.getElementById('clientForm').style.display = 'block';
}

function addClient() {
  const nombre = document.getElementById('clientName').value;
  const contrasenya = document.getElementById('clientPassword').value;
  const apellido = document.getElementById('clientLastName').value;
  const email = document.getElementById('clientEmail').value;
  const usuario = document.getElementById('clientEmail').value;
  fetch(ipServer + "/usuario/")
    .then(response => response.json())
    .then(json => console.log(json));
  console.log('Añadiendo cliente: ',usuario, nombre, apellido , contrasenya , email);
}



