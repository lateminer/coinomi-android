package com.coinomi.core.coins;

import com.coinomi.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class DopecoinMain extends PeerFamily {
    private DopecoinMain() {
        id = "dopecoin.main";

        addressHeader = 30;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 60;
        dumpedPrivateKeyHeader = 158;

        name = "DopeCoin";
        symbol = "DOPE";
        uriScheme = "dopecoin";
        bip44Index = 53;
        unitExponent = 8;
        feeValue = value(10000); // 0.0001 DOPE
        minNonDust = value(1);
        softDustLimit = value(1000000); // 0.01 DOPE
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("DopeCoin Signed Message:\n");
    }

    private static DopecoinMain instance = new DopecoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
