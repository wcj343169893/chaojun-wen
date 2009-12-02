$(function(){
    var ei = $("#large");
    ei.hide();
    $("img").mousemove(function(e){
        ei.css({top:e.pageY,left:e.pageX}).html('<img style="border:1px solid gray;" width="140" height="140" src="' + this.src + '" />').show();
    }).mouseout( function(){
        ei.hide();
    })
    $("#f1").change(function(){
        $("#head").attr("src","file:///"+$("#f1").val());
    })
});