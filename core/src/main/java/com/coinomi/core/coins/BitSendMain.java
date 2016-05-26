package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class BitSendMain extends CoinType {
    private BitSendMain() {
        id = "bitsend.main";

        addressHeader = 102;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 25; // COINBASE_MATURITY
        dumpedPrivateKeyHeader = 204;
        
        name = "BitSend";
        symbol = "BITSEND";
        uriScheme = "bitsend";
        bip44Index = 91;
        unitExponent = 8;
        feeValue = value(1000000); // DEFAULT_TRANSACTION_FEE
        minNonDust = value(1000);
        softDustLimit = value(100000);
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("BitSend Signed Message:\n");
    }

    private static BitSendMain instance = new BitSendMain();
    public static synchronized BitSendMain get() {
        return instance;
    }
}
