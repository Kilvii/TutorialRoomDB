package com.example.tutorialroomdb

data class ContactState(
    val contacts: List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val description: String = "",
    val isAddingContact: Boolean = false,
    val isShowingInfo: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME,

)