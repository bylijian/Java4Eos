package com.bylijian.eoslibrary;

public interface Wallet {
    String getWalletName();

    void open();
    void close();
    void lock();
    void unlock(String password);
    void listPrivateKey();
    void listPublickey();

}
