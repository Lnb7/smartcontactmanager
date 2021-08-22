console.log("This is script file")


const toggleSidebar = ()=>{

    if($(".sidebar").is(":visible")){
        
        $(".sidebar").css("display", "none");
        $(".content").css("margin-left", "0%");
  //      $('.content').css("padding-left", "18%");
    }else{
        $(".sidebar").css("display", "block");
        $(".content").css("margin-left", "20%");
//		$('.content').css("padding-left", "1%");
    }
};