package org.readium.r2.shared.opds

import java.io.Serializable


data class Price(var currency: String, var value: Double):Serializable {

}