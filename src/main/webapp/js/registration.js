
function startNewReg(event){
	event.preventDefault();
	$('#registration-form').fadeIn(100);
}
function closeRegForm(event){
	event.preventDefault();
	$('#registration-form').fadeOut(100);
}

function nextRegStep(event, nextValue){
	event.preventDefault();
	$('#step'+(nextValue-1)).css({
		left: "-100%"
	}).promise().done(e=>{
		$(e).fadeOut(100);
	})
	$('#step'+(nextValue)).css({
		left: "0"
	});
}
function previousRegStep(event, prevValue){
	event.preventDefault();
	$('#step'+prevValue).fadeIn(100).css({
		left: "0"
	});
	$('#step'+(prevValue+1)).css({
		left: "100px"
	});
}

function finishReg(event){
	event.preventDefault();
}