<!Doctype HTML>
<html>
<head>
	<title>Rotango &trade;</title>
	<meta name="viewport" content="width=360, minimum-scale=0.1, maximum-scale=1, user-scalable=no, minimal-ui">
	<meta name="theme-color" content="#ffffff"/>
 	<link rel="shortcut icon" href="/images/rotango.png">
    <link rel="manifest" href="/manifest.json" />
    
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 	<link href="https://site-assets.fontawesome.com/releases/v6.1.1/css/all.css" rel="stylesheet">
 	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
 	<link rel="stylesheet" href="/css/rotango.css">
 	<link rel="stylesheet" href="/css/index.css">
 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
 	<script type="text/javascript" src="/js/functions.js"></script>
 	<script type="text/javascript" src="/js/registration.js"></script>
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<div class="container-fluid d-flex flex-column">
		
		<!-- Page Loader -->
		<div id="page-loader">
				<h1 class="my-5 mx-auto"
					style="width: max-content; font-size: calc(16px + 2.4vmin); font-family:monospace; color:#404040;
							margin:30vh auto 25px auto !important;font-weight:bold;">Rotango<sup>&trade;</sup></h1>
							<!-- <strong class="d-block mx-auto" style="margin-bottom:60px;
								color:#606060; font-size:calc(14px + .1vmin); text-align:center; font-family:;
								font-style:italic;word-spacing:6px;">A long lasting spice for your love life...</strong> -->

				<!--  loader animations -->
				<div style="width: max-content;margin:  130px auto;">
					<div class="loader-container">
						<span class="loader-indicator l1"></span>
						<span class="loader-indicator l2"></span>
						<span class="loader-indicator l3"></span>
						<span class="loader-indicator l4"></span>
					</div>
				</div>
						
		</div>
		
		<div id="login-form" class="d-flex flex-column mx-auto mb-4 pb-4" style="width:85%;height:100%;">
		
				<h1 class="my-5 mx-auto"
					style="width: max-content; font-size: calc(16px + 2.4vmin); font-family:monospace; color:#404040;
							margin:20vh auto 10px auto !important;font-weight:bold;">
							<img alt="logo" src="images/rotango.png" style="width:60px;"> Rotango<sup>&trade;</sup></h1>
							<strong class="d-block mx-auto" style="margin-bottom:30px !important;
								color:#404040; font-size:calc(14px + .1vmin); text-align:center; font-family:;monospace;
								font-style:italic;word-spacing:0px;">A Spice-up for your love life...</strong>
			
					<!--  Login Form -->
					<form class="mt-0 mb-4 mx-auto" style="width:100%; max-width:500px">
				<input placeholder="Username" class="form-control my-2 border-2" style="border-color:#ff8bb6;box-shadow:none;border-radius:20px;" required/>
				<input placeholder="Password" class="form-control my-2 border-2" style="border-color:#ff8bb6;box-shadow:none;border-radius:20px;" required/>
				<button class="btn btn-primary text-white bg-dark my-2" style="width:100%;border-radius:20px;box-shadow:none;border:0;">Login</button>
				<button class="btn text-white" style="background:#5d7ad2; width:100%;border-radius:20px;border:0;"> <i class="fab fa-facebook p-1 bg-white mr-1" style="border-radius:50%;color:#5d7ad2;"></i> Login with Facebook</button>
				<div class="mt-3 mb-4" style="width:100%;text-align:center;">
					<strong class="d-block">Don't have an account?</strong>
					<a href="#register" style="color:#ff0c67;text-decoration: none;" onclick="startNewReg(event)">Register here</a>
				</div>
			</form>
		</div>
		
		<!--  Registration Forms -->
		<div id="registration-form" class="fixed" style="display:none;background:#fffffffc; width:100%; height:100%; top:0; left:0; z-index:10; overflow-y:auto;">
				
				<div class="d-flex flex-column my-4 px-3" style="width:100%; height:max-content;">
					<button class="btn close ml-auto bg-light" style="border-radius:50%;padding:5px 10px 3px 10px" onclick="closeRegForm(event)"><i class="far fa-times" style="font-size:24px;"></i></button>
					<h2  class="mt-4 ml-auto mr-auto" style="width:max-content; font-size:calc(16px + .1vw); font-weight:bold;">Create new account</h2>
					<form class="mt-4 ml-auto mr-auto relative d-flex" data-step="1" style="width:100%; height:100%; max-width:500px; overflow:hidden;">
							
							<div id="step1" class="step" style="left: 0;">
								<input placeholder="Firstname" class="form-control my-2" required autofocus="autofocus">
								<input placeholder="Lastname" class="form-control my-2" required>
								<input placeholder="Email" class="form-control my-2" required>
								<input placeholder="telephone" class="form-control my-2" required>
								<input placeholder="Password" class="form-control my-2" required>
								
									<div class="d-flex mt-5 p-1">
											<button style="border-radius:25px;" onclick="nextRegStep(event, 2);" class="btn theme-bg-color text-white  mt-auto mb-auto p-2 ml-auto d-flex">
												Continue &nbsp; <i class="fas fa-arrow-right m-auto text-white mr-1" style="border-radius:50%;"></i>
											</button>
									</div>
									
							</div>
							
							<div id="step2" class="step">
								Enter the verification code sent to your email.
								<input placeholder="Verification Code" class="form-control my-2" required autofocus="autofocus">
								
									<div class="d-flex mt-5 p-1">
											<button style="border-radius:25px;" onclick="previousRegStep(event, 1);" class="btn bg-secondary text-white  mt-auto mb-auto py-2 px-3 mr-auto d-flex">
												<i class="fas fa-arrow-left m-auto text-white mr-1" style="border-radius:50%;"></i> &nbsp;  Back
											</button>
											<button style="border-radius:25px;" onclick="nextRegStep(event, 3);" class="btn theme-bg-color text-white  mt-auto mb-auto p-2 ml-auto d-flex">
												Continue &nbsp; <i class="fas fa-arrow-right m-auto text-white mr-1" style="border-radius:50%;"></i>
											</button>
									</div>
									
							</div>
							
							<div id="step3" class="step">
								<b class="p-2">Bio:</b>
								<textarea autofocus="autofocus" placeholder="Tell us about yourself." style="border-width:1px;"></textarea>
								
								<b class="p-2 d-flex" style="align-items:center;"><i class="fas fa-briefcase" style="font-size:20px;"></i> &nbsp; Job Title:</b>
								<input placeholder="Job Title" class="form-control my-2" required style="border-width:1px;">
								
								<b class="p-2 d-flex" style="align-items:center;"><i class="fas fa-building-columns" style="font-size:22px;"></i> &nbsp; Workplace:</b>
								<input placeholder="Workplace" class="form-control my-2" required style="border-width:1px;">
								
								<b class="p-2 d-flex" style="align-items:center;"><i class="fad fa-graduation-cap" style="font-size:20px;"></i> &nbsp; Highest Degree (Education):</b>
								<select placeholder="Workplace" class="form-control my-2" required>
										<option>College</option>
										<option>High School</option>
										<option>Masters</option>
										<option>PhD</option>
										<option>Prefer not to say</option>
								</select>
								
								<div class="d-flex p-1 profile-option">
										<div class="mt-auto mb-auto mr-auto">
											<b class="d-flex" style="align-items:center;"> <i class="fa fa-person-half-dress" style="font-size:26px;"></i> &nbsp; Gender</b>
										</div>
										<select class="d-block p-1 bg-white" style="border:1px solid #eaeaea; border-radius:4px;">
												<option value="male">Male</option>
												<option value="female">Female</option>
												<option>Trans Male</option>
												<option>Trans Female</option>
												<option>Bi</option>
										</select>
								</div>
								
								<div class="d-flex p-1 profile-option">
										<div class="mt-auto mb-auto mr-auto">
											<b class="d-flex" style="align-items:center;"> <i class="fa fa-map-marker-alt" style="font-size:26px;"></i> &nbsp; Location</b>
										</div>
										<input class="d-block my-auto py-1 px-2 bg-white" style="max-width:55%;border:1px solid #eaeaea; border-radius:4px;color:black;" placeholder="Add Location" readonly/>
								</div>
								
								<div class="d-flex p-1 profile-option">
										<div class="mt-auto mb-auto mr-auto">
											<b class="d-flex" style="align-items:center;"> <i class="fa fa-heart" style="font-size:24px;"></i> &nbsp; Relationship</b>
										</div>
										<select class="d-block p-1 bg-white" style="border:1px solid #eaeaea; border-radius:4px;">
												<option value="male">Single</option>
												<option>Married</option>
												<option value="female">Divorced</option>
												<option>Widowed Male</option>
												<option>Widowed Female</option>
										</select>
								</div>
								
								<div class="d-flex p-1 profile-option">
										<div class="mt-auto mb-auto mr-auto">
											<b class="d-flex" style="align-items:center;"> <i class="fa fa-search" style="font-size:24px;"></i> &nbsp; Looking For</b>
										</div>
										<select class="d-block p-1 bg-white" style="border:1px solid #eaeaea; border-radius:4px;">
												<option value="male">Relationship</option>
												<option>Friends</option>
												<option>Something Casual</option>
												<option value="female">Don't know yet</option>
										</select>
								</div>
								
									<div class="d-flex mt-5 p-1">
											<button style="border-radius:25px;" onclick="previousRegStep(event, 2);" class="btn bg-secondary text-white  mt-auto mb-auto py-2 px-3 mr-auto d-flex">
												<i class="fas fa-arrow-left m-auto text-white mr-1" style="border-radius:50%;"></i> &nbsp;  Back
											</button>
											<button style="border-radius:25px;" onclick="finishReg(event);" class="btn theme-bg-color text-white  mt-auto mb-auto p-2 ml-auto d-flex">
												Complete &nbsp; <i class="fas fa-arrow-right m-auto text-white mr-1" style="border-radius:50%;"></i>
											</button>
									</div>
									
							</div>

					</form>
				
				</div>
		</div>

	</div>
</body>
</html>