document.onreadystatechange = ()=>{
	if (document.readyState == "complete"){
		setTimeout(()=>{
			$('#page-loader').fadeOut(100);
		}, 5000);
	}
}