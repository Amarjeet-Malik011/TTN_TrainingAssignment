$(document).ready(function () {
    $("#delete-row1").click(function(){
        $("#delete-row1").parents("tr").remove();
    });
    $("#delete-row2").click(function(){
        $("#delete-row2").parents("tr").remove();
    });
    $("#delete-row3").click(function(){
        $("#delete-row3").parents("tr").remove();
    });
});