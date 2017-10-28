function gerarBuilds(role) {
    var buildsFiltradas = buscaBuildsPorRole(role);
    preencheHtmlRoles(buildsFiltradas);
}

function buscaBuildsPorRole(role) {
    buildsPorRole = [];
    builds.forEach(function(build)
    {
        if(build.role == role) {
            buildsPorRole.push(build);
        }
    });
    return buildsPorRole;
}

function preencheHtmlRoles(lista_de_builds) {
    var builds = $("#builds");
    lista_de_builds.forEach(function(build){
        //criar elementos de exibição
        var divBuild = $("<div>");
        divBuild.addClass("build");

        build.itens.forEach(function(item) {
            var itemNome = "<div>" + item.nome + "</div>";
            var itemImagem = "<img src='" + item.imagem + "'>";
            divBuild.append(itemNome);
            divBuild.append(itemImagem);
        });
        var elementoRole = "<div>" + build.role + "</div>";
        divBuild.append(elementoRole);
        builds.append(divBuild);
    });
}
