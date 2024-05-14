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
function showAddMovieForm() {
  document.getElementById('movieForm').style.display = 'block';
}

function addMovie() {
  const title = document.getElementById('movieTitle').value;
  const director = document.getElementById('movieDirector').value;
  const year = document.getElementById('movieYear').value;
  // LLamar api cuando este creada.
  console.log('Añadiendo película:', title, director, year);
}

function filterMovies() {
  const search = document.getElementById('movieSearch').value.toLowerCase();
  const movies = document.querySelectorAll('#moviesList tr');
  movies.forEach(movie => {
    const visible = movie.textContent.toLowerCase().includes(search);
    movie.style.display = visible ? '' : 'none';
  });
}
function showAddClientForm() {
  document.getElementById('clientForm').style.display = 'block';
}

function addClient() {
  const name = document.getElementById('clientName').value;
  const email = document.getElementById('clientEmail').value;
  // LLamar api cuando este creada
  console.log('Añadiendo cliente:', name, email);
}

function filterClients() {
  const search = document.getElementById('clientSearch').value.toLowerCase();
  const clients = document.querySelectorAll('#clientsList tr');
  clients.forEach(client => {
    const visible = client.textContent.toLowerCase().includes(search);
    client.style.display = visible ? '' : 'none';
  });
}


