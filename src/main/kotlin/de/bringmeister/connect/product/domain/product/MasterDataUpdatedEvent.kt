package de.bringmeister.connect.product.domain.product

import de.bringmeister.connect.product.domain.Event

data class MasterDataUpdatedEvent(
    val productNumber: ProductNumber,
    val name: String,
    val description: String
) : Event {
    override fun getDomainEntityId(): String {
        return productNumber.stringValue()
    }
}
