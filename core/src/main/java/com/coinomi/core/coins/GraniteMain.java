package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

public class GraniteMain extends CoinType {
    private GraniteMain() {
        id = "granite.main";

        addressHeader = 38;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;

        family = BitFamily.get();
        name = "Granite";
        symbol = "GRN";
        uriScheme = "grn";
        bip44Index = 5; //
        unitExponent = 8;
        feePerKb = value(100000);
        minNonDust = value(1000);
        softDustLimit = value(100000);
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Granite Signed Message:\n");
    }

    private static GraniteMain instance = new GraniteMain();
    public static synchronized GraniteMain get() {
        return instance;
    }
}
