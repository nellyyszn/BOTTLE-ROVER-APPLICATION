package com.example.firebasestorage

import com.google.firebase.firestore.Exclude

data class Stores(
    @Exclude var StoreID: String? = "",
    var StoreName: String? = "",
    var StoreNo : String? = "",
    var Location: String? = "",
    var ContactInfo: String? = "",
    var EmailAddress: String? = "",
    var Category: String? = ""
)