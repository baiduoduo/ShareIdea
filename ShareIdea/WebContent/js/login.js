var bannerAD=new Array(); 
var adNum=0; 

bannerAD[0]="./image/banner1.jpg"; 
bannerAD[1]="./image/banner2.jpg"; 
bannerAD[2]="./image/banner3.jpg"; 

var preloadedimages=new Array(); 
for (i=1;i<bannerAD.length;i++) { 
	preloadedimages[i]=new Image(); 
	preloadedimages[i].src=bannerAD[i]; 
} 

function setTransition() { 
	if (document.all) { 
		bannerADrotator.filters.revealTrans.Transition=Math.floor(Math.random()*23); 
		bannerADrotator.filters.revealTrans.apply(); 
	} 
} 

function playTransition() { 
	if (document.all) { 
		bannerADrotator.filters.revealTrans.play(); 
	} 
} 

function nextAd() { 
	if (adNum<bannerAD.length-1) { 
		adNum++; 
	} else { 
		adNum=0; 
	} 
	setTransition(); 
	document.images.bannerADrotator.src=bannerAD[adNum]; 
	playTransition(); 
	theTimer=setTimeout("nextAd()", 5000); 
} 
$(document).ready(function(){ 
			
			jQuery.ssp={};          
			jQuery.ssp.mq_login={};   
			$.ssp.mq_login=function(){  

				//点击账号输入框事件
				var username = $("#username");
				username.bind("click",function(){
					var str = $(this).attr("value");
					if (str === "手机号码/邮箱账号") {
						$(this).attr("value","");
						$(this).css({"color":"black"});
					}
				});		

				//账号输入框失去焦点事件
				username.bind("blur",function(){
					var text = $(this).attr("value");
					if(text === ""){
						$("#account").css({"display": "block"});
					}else{
						$("#account").css({"display":"none"});
					}
				});
				
				//注册按钮点击事件
				$("#register").bind("click",function(){
					window.location= "register.jsp";
				});
				//登陆
				$('#loginbtn').bind('click',function(){ 
					document.login.submit();
				})
			}

			$.ssp.mq_login();              
		})