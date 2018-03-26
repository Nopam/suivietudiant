/**
 * 
 */

let personneInfos = function initPersonneInfos(){
	return {};
}

function updateInfos(){
	
	$('.showInfos').hide();
}

let modifInProgress = function(){
	$('.showInfos').hide();
	$('.inputInfos').show();
	console.log("showInfosHide")
}

let validate = function(){
	$('.inputInfos').hide();
	$('.showInfos').show();
}