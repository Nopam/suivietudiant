/**
 * 
 */



function updateInfos(){
	

}

// Lorsqu'on clique sur "modifier" on actualise le contenu
let modifInProgress = function(){
	$('.showInfos').hide();
	$('.inputInfos').show();
	console.log("showInfosHide")
}

// Lorsqu'on valide les modifications apportées.
let validate = function(){
	$('.inputInfos').hide();
	$('.showInfos').show();
}