package com.example.gmail

data class MailData (
    var mailID: Int,
    var username: String,
    var title: String,
    var body: String,
    var timestamp: String,
    var isFavour: Boolean = false
)