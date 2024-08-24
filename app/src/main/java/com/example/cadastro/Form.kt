package com.example.cadastro

class Form(
    var nome: String,
    var telefone: String,
    var email: String,
    var ingressar_na_lista_de_emails: Boolean,
    var sexo: String,
    var cidade: String,
    var uf: String
) {
    override fun toString(): String {
        return """
        Dados:
        Nome: '$nome'
        Telefone: '$telefone'
        Email: '$email'
        Inscrito na lista de emails? $ingressar_na_lista_de_emails
        Sexo: '$sexo'
        Cidade: '$cidade'
        UF: '$uf'
        """.trimIndent()
    }
}