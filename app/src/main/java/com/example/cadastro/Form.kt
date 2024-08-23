package com.example.cadastro

class Form(
    var name: String,
    var phone: String,
    var email: String,
    var isSubscribedToEmailList: Boolean,
    var gender: String,
    var city: String,
    var uf: String
) {
    override fun toString(): String {
        return """
        Dados:
        Nome: '$name'
        Telefone: '$phone'
        Email: '$email'
        Inscrito na lista de emails? $isSubscribedToEmailList
        Sexo: '$gender'
        Cidade: '$city'
        UF: '$uf'
        """.trimIndent()
    }
}