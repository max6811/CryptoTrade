package com.maxcmartinez.cryptotrade.adapter

import com.maxcmartinez.cryptotrade.model.Crypto


interface CryptosAdapterListener{

    fun onBuyCryptoClicked(crypto: Crypto)
}