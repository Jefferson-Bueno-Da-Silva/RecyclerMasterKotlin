package com.example.recyclermasterkotlin.model

data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false,
)

class EmailBuilder {
    var user: String = ""
    var subject: String= ""
    var preview: String= ""
    var date: String= ""
    var stared: Boolean= false
    var unread: Boolean= false

    fun build(): Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails(): MutableList<Email> = mutableListOf(
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais para voce conseguir alguma coisa"
        preview = "Olá Jefferson, você precisa ver esse aplicativo para"
        date = "26 jun"
        stared = false
    },
    email {
        user = "Jefferson Bueno"
        subject = "veja nossas três dicas principais para voce conseguir alguma coisa"
        preview = "olá jefferson, você precisa ver esse aplicativo para"
        date = "26 mai"
        stared = true
    },
    email {
        user = "Sophya De Lima"
        subject = "Te amo"
        preview = "Olá Jefferson, você precisa ver esse aplicativo para"
        date = "26 mar"
        stared = true
        unread = true
    },
    email {
        user = "Lorem"
        subject = "veja nossas três dicas principais para voce conseguir alguma coisa"
        preview = "olá jefferson, você precisa ver esse aplicativo para"
        date = "26 jun"
        stared = true
        unread = true
    },
    email {
        user = "Ipson"
        subject = "Veja nossas três dicas principais para voce conseguir alguma coisa"
        preview = "Olá Jefferson, você precisa ver esse aplicativo para"
        date = "26 jun"
        stared = false
        unread = true
    },
    email {
        user = "Delorem"
        subject = "veja nossas três dicas principais para voce conseguir alguma coisa"
        preview = "olá jefferson, você precisa ver esse aplicativo para"
        date = "26 jun"
        stared = false
        unread = true
    },
    email {
        user = "Gorge Fasconselos"
        subject = "Veja nossas três dicas principais para voce conseguir alguma coisa"
        preview = "Olá Jefferson, você precisa ver esse aplicativo para"
        date = "26 jun"
        stared = false
        unread = true
    },
    email {
        user = "Teste"
        subject = "veja nossas três dicas principais para voce conseguir alguma coisa"
        preview = "olá jefferson, você precisa ver esse aplicativo para"
        date = "26 jun"
        stared = false
        unread = true
    },
)
