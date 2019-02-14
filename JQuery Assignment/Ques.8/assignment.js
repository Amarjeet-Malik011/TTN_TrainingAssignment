$(document).ready(function () {

    $(".btn").click(function () {
        $(".btn").after("<button class='btn-new'>click-clone</button>");
    });
    $("body").on("click",".btn-new",function () {
        $(".btn").after("<input type=\"button\" class=\"btn-new\" value=\"Click Clone\"/>");
    });
});