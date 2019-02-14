$(document).ready(function () {
    var max = -1;
    $(".height").each(function () {
        var h = $(this).height();
        max = h > max ? h : max;
    });
    document.getElementById("maxheight").innerText +="= "+max;

});