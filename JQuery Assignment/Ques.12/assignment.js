$(document).ready(function () {
    $("#btn").click(function () {
        alert("hello amarjeet!!!");
    });

    $(".list1").click(function () {
        $("#btn").prop("disabled",true);
    });
});