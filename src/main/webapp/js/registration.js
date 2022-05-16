
function startNewReg(event){
	event.preventDefault();
	$('#registration-form').fadeIn(100).animate({
		top: 0
	}, 500);
}
function closeRegForm(event){
	event.preventDefault();
	$('#registration-form').animate({
		top: "100%"
	}, 500).fadeOut(100).promise().done(e=>{
		$('.step').fadeIn().css('left', '100px');
		$('.step').eq(0).css('left','0px');
	});
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
	$("#registration-form")[0].scrollTop = 0;
}
function previousRegStep(event, prevValue){
	event.preventDefault();
	$('#step'+prevValue).fadeIn(0).css({
		left: "0"
	});
	$('#step'+(prevValue+1)).css({
		left: "100px"
	});
	$("#registration-form")[0].scrollTop = 0;
}

function finishReg(event){
	event.preventDefault();
}