$(document).ready(function () {

    //In this method two replicas created(one on hoverIn and another on hoverOut)

    $("#btn").hover(function () {
        $(this).after("    <select id=\"s1\" >\n" +
            "        <option disabled selected value>--select--</option>\n" +
            "        <option value=\"volvo\">Volvo</option>\n" +
            "        <option value=\"mercedes\">Mercedes</option>\n" +
            "        <option value=\"audi\">Audi</option>\n" +
            "    </select>");
    });
});