$(document).ready(function () {
    $(".btn").click(function () {
       $(".btn").after("<input type=\"button\" class=\".btn\" value=\"Click\"/>");
    });
});