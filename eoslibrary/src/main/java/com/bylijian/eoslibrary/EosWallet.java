package com.bylijian.eoslibrary;

import android.text.TextUtils;

import com.bylijian.eoslibrary.util.FileUtils;

import java.io.File;

public class EosWallet implements Wallet {
    private String walletName;
    private String password;
    private String parentPath;
    private File walletFile;
    private byte walletData[];


    public EosWallet(String parentPath, String walletName) {
        this.parentPath = parentPath;
        this.walletName = walletName;
        this.walletFile = new File(parentPath, walletName);

    }


    @Override
    public String getWalletName() {
        return TextUtils.isEmpty(walletName) ? "" : walletName;
    }

    @Override
    public void open() {
        walletFile = new File(parentPath, walletName);
        if (!FileUtils.isFileExists(walletFile)) {
            FileUtils.createOrExistsFile(walletFile);
        }
    }

    @Override
    public void close() {

    }

    @Override
    public void lock() {
        walletData = null;
        password = "";

    }

    @Override
    public void unlock(String password) {

    }

    @Override
    public void listPrivateKey() {

    }

    @Override
    public void listPublickey() {

    }
}
