function gerarBuilds() {
    var buildsFiltradas = buscaBuildsPorRole(imagemSelecionada);
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

//inicialize
var imagemSelecionada;

$(".selectImage").on("click", function(){
    imagemSelecionada = $(this).data("id");
    $('.selectImage').removeClass('selected');
    $(this).addClass('selected');
    console.log(imagemSelecionada);
});


function preencheHtmlRoles(lista_de_builds) {
    var builds = $(".builds");
    lista_de_builds.forEach(function(build){
        //criar elementos de exibição
        var divBuild = $("<div>");
        divBuild.addClass("build");
        divBuild.addClass("row");

        build.itens.forEach(function(item) {
            var itemNome = "<div class='col-md-4'>" + item.nome + "</div>";
            var itemImagem = "<img class='col-md-4' src='" + item.imagem + "'>";
            divBuild.append(itemNome);
            divBuild.append(itemImagem);
        });
        var elementoRole = "<div>" + build.role + "</div>";
        divBuild.append(elementoRole);
        builds.append(divBuild);
    });
}
