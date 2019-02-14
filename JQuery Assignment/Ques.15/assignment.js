$(document).ready(function () {
    var myvar;
    $("#btn").click(function () {
        // data path
        $.ajax({
            url: "https://jsonplaceholder.typicode.com/posts",
            method: "GET"
            }).done(function (response) {
                $("#url-div").text(JSON.stringify(response));
                myvar = response;
                console.log(myvar);
            });
        });
});