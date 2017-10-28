function gerarBuilds(role) {

    switch(role) {
        case "Slayer":
            rolesSlayer();
            break;
        case "Marksman":
            rolesMarksman();
    }
}

function rolesSlayer() {
    buildsSlayer = [];
    builds.forEach(function(build)
    {
        if(build.role == 'Slayer') {
            buildsSlayer.push(build);
        }
    });
    return buildsSlayer;
}

function preencheRoles(lista_de_builds) {
    var builds = $("#builds");
    lista_de_builds.forEach(function(build){
        //criar elementos de exibição
        var elementoNome = "<div>" + build.role + "</div";
        var divBuild = $("<div>");
        divBuild.addClass("build");
        divBuild.append(elementoNome);
        builds.append(divBuild);
    });
}
