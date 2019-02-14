$(document).ready(function () {
    var delay=0;
    var image= ["1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"];
    setInterval( function(){
        $(".slider").attr('src',image[delay]);
        delay++;
        if(delay==5){
            delay=0;
        }
        console.log(image[delay]);
    },3000);
});