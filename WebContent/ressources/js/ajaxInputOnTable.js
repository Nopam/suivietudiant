function inputFilterPrenom() {
  var input, filter, table, tr, td, i;
  input = document.getElementById("inputPrenom");
  filter = input.value.toUpperCase();
  table = document.getElementById("tableEtudiants");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0]; //Index de l'emplacement de la données, ex : 0 = prénom, 1 = nom...
    if (td) {
      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}


function inputFilterNom() {
	  var input, filter, table, tr, td, i;
	  input = document.getElementById("inputNom");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("tableEtudiants");
	  tr = table.getElementsByTagName("tr");
	  for (i = 0; i < tr.length; i++) {
	    td = tr[i].getElementsByTagName("td")[1]; //Index de l'emplacement de la données, ex : 0 = prénom, 1 = nom...
	    if (td) {
	      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
	        tr[i].style.display = "";
	      } else {
	        tr[i].style.display = "none";
	      }
	    }       
	  }
	}

function inputFilterSearch() {
	  var input, filter, table, tr, td, i;
	  input = document.getElementById("inputSearch");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("tableEtudiants");
	  tr = table.getElementsByTagName("tr");
	  for (i = 0; i < tr.length; i++) {
	    td = tr[i].getElementsByTagName("td")[0]; //Index de l'emplacement de la donnée, ex : 0 = prénom, 1 = nom...
	    if (td) {
	      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
	        tr[i].style.display = "";
	      } else {
	        tr[i].style.display = "none";
	      }
	    }       
	  }
	}