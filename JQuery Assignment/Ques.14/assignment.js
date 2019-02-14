$(document).ready(function () {

    $("#colorchange").click(function () {
        $("#qw tr").each(function () {
            var customerId = $(this).find(".num").html();
            if (customerId > 10)
                $(this).css("background-color", "aquamarine");
        });
    });

});